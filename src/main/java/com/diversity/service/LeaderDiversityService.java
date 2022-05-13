package com.diversity.service;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.exception.RecordNotFoundException;
import com.diversity.exception.Constants;
import com.diversity.entity.LeaderDiversityInfo;
import com.diversity.mapper.DtoToEntity;
import com.diversity.mapper.EntityToDto;
import com.diversity.model.LeaderDiversityInfoDto;
import com.diversity.repo.LeaderDiversityInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class LeaderDiversityService {

    Logger logger = LoggerFactory.getLogger(LeaderDiversityService.class);
    @Autowired
    private LeaderDiversityInfoRepository leaderDiversityInfoRepository;

    public void updateLeaderDiversityInformation(LeaderDiversityInfoDto leaderDiversityInfo) {
        if (leaderDiversityInfo == null)
            throw new RecordNotFoundException(Constants.MSG_RECORD_NOT_FOUND);
        leaderDiversityInfoRepository.save(DtoToEntity.mapLeaderDiversityInfoDtoToEntity(leaderDiversityInfo));

    }

    public LeaderDiversityInfoDto getLeaderByName(String leaderName) {

        LeaderDiversityInfo diversityLeaderInfo = leaderDiversityInfoRepository.findByName(leaderName);
        if (diversityLeaderInfo == null)
            throw new RecordNotFoundException(Constants.MSG_RECORD_NOT_FOUND);
        return EntityToDto.mapLeaderDiversityEntityToDto(diversityLeaderInfo);
    }

    public List<LeaderDiversityInfoDto> getAllDiversityLeaders() {
        var leaderDiversityIterable = leaderDiversityInfoRepository.findAll();
        List<LeaderDiversityInfo> diversityLeaders = StreamSupport.stream(leaderDiversityIterable.spliterator(), false).collect(Collectors.toList());

        if (diversityLeaders.isEmpty())
            throw new RecordNotFoundException(Constants.MSG_RECORD_NOT_FOUND);

        return EntityToDto.mapListLeaderDiversityEntityToDto(diversityLeaders);
    }

    public List<LeaderDiversityInfoDto> getAllDiversityLeadersUsingCompanyId(String companyId) {
        List<LeaderDiversityInfo> diversityLeaders = leaderDiversityInfoRepository.findLeadersUsingCompanyId(Integer.parseInt(companyId));
        if (diversityLeaders.isEmpty())
            throw new RecordNotFoundException(Constants.MSG_RECORD_NOT_FOUND);
        return EntityToDto.mapListLeaderDiversityEntityToDto(diversityLeaders);
    }

}
