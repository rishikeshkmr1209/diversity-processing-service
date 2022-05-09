package com.diversity.service;

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
@Service
public class DiversityLeaderService {

    Logger logger = LoggerFactory.getLogger(DiversityLeaderService.class);
    @Autowired
    private LeaderDiversityInfoRepository leaderDiversityInfoRepository;

    public void updateLeaderDiversityInformation(LeaderDiversityInfoDto leaderDiversityInfo) {
        if(leaderDiversityInfo==null)
            throw new RecordNotFoundException(Constants.MSG_RECORD_NOT_FOUND);
        leaderDiversityInfoRepository.save(DtoToEntity.mapLeaderDiversityInfoDtoToEntity(leaderDiversityInfo));

    }

    public LeaderDiversityInfoDto getLeaderByName(String leaderName) {

        LeaderDiversityInfo diversityLeaderInfo = leaderDiversityInfoRepository.findByName(leaderName);
        if(diversityLeaderInfo==null)
           throw new RecordNotFoundException(Constants.MSG_RECORD_NOT_FOUND);
        return EntityToDto.mapLeaderDiversityEntityToDto(diversityLeaderInfo);
    }

    public List<LeaderDiversityInfoDto> getAllDiversityLeaders() {
        List<LeaderDiversityInfo> diversityLeaders = leaderDiversityInfoRepository.findAll();
        if(diversityLeaders.isEmpty())
            throw new RecordNotFoundException(Constants.MSG_RECORD_NOT_FOUND);

        return EntityToDto.mapListLeaderDiversityEntityToDto(diversityLeaders);
    }

}
