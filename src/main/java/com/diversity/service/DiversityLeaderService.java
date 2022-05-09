package com.diversity.service;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.LeaderDiversityInfo;
import com.diversity.mapper.DtoToEntity;
import com.diversity.mapper.EntityToDto;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.LeaderDiversityInfoDto;
import com.diversity.repo.LeaderDiversityInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiversityLeaderService {
    @Autowired
    private LeaderDiversityInfoRepository leaderDiversityInfoRepository;

    public void updateLeaderDiversityInformation(LeaderDiversityInfoDto leaderDiversityInfo) {
        leaderDiversityInfoRepository.save(DtoToEntity.mapLeaderDiversityInfoDtoToEntity(leaderDiversityInfo));

    }

    public LeaderDiversityInfoDto getLeaderByName(String leaderName) {
        LeaderDiversityInfo diversityLeaderInfo = leaderDiversityInfoRepository.findByName(leaderName);
        return EntityToDto.mapLeaderDiversityEntityToDto(diversityLeaderInfo);
    }

    public List<LeaderDiversityInfoDto> getAllDiversityLeaders() {
        List<LeaderDiversityInfo> diversityLeaders = leaderDiversityInfoRepository.findAll();

        return EntityToDto.mapListLeaderDiversityEntityToDto(diversityLeaders);
    }

}
