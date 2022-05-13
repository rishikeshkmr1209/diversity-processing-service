package com.diversity.mapper;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.LeaderDiversityInfo;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.LeaderDiversityInfoDto;

import java.util.ArrayList;
import java.util.List;

public class EntityToDto {

    public static List<CompanyDiversityInfoDto> mapListCompanyDiversityEntityToDto(List<CompanyDiversityInfo> companyDiversityInfos) {
        List<CompanyDiversityInfoDto> companyDiversityInfoDtos = new ArrayList<>();
        for (CompanyDiversityInfo companyDiversityInfo : companyDiversityInfos) {
            CompanyDiversityInfoDto companyDiversityInfoDto = new CompanyDiversityInfoDto();
            if (null != companyDiversityInfo.getId()) {
                companyDiversityInfoDto.setId(companyDiversityInfo.getId());
            }
            if (null != companyDiversityInfo.getDunsName()) {
                companyDiversityInfoDto.setDunsName(companyDiversityInfo.getDunsName());
            }
            if (null != companyDiversityInfo.getDunsNumber()) {
                companyDiversityInfoDto.setDunsNumber(companyDiversityInfo.getDunsNumber());
            }
            if (null != companyDiversityInfo.getPhone()) {
                companyDiversityInfoDto.setPhone(companyDiversityInfo.getPhone());
            }
            if (null != companyDiversityInfo.getCity()) {
                companyDiversityInfoDto.setCity(companyDiversityInfo.getCity());
            }
            if (null != companyDiversityInfo.getCounty()) {
                companyDiversityInfoDto.setCounty(companyDiversityInfo.getCounty());
            }
            if (null != companyDiversityInfo.getState()) {
                companyDiversityInfoDto.setState(companyDiversityInfo.getState());
            }
            if (null != companyDiversityInfo.getZipCode()) {
                companyDiversityInfoDto.setZipCode(companyDiversityInfo.getZipCode());
            }
            if (null != companyDiversityInfo.getLeaders()) {
                companyDiversityInfoDto.setLeaders(companyDiversityInfo.getLeaders());
            }

            companyDiversityInfoDtos.add(companyDiversityInfoDto);

        }
        return companyDiversityInfoDtos;


    }

    public static CompanyDiversityInfoDto mapCompanyDiversityEntityToDto(CompanyDiversityInfo companyDiversityInfo) {
        CompanyDiversityInfoDto companyDiversityInfoDto = new CompanyDiversityInfoDto();
        if (null != companyDiversityInfo) {

            if (null != companyDiversityInfo.getId()) {
                companyDiversityInfoDto.setId(companyDiversityInfo.getId());
            }

            if (null != companyDiversityInfo.getDunsName()) {
                companyDiversityInfoDto.setDunsName(companyDiversityInfo.getDunsName());
            }

            if (null != companyDiversityInfo.getLeaders()) {
                companyDiversityInfoDto.setLeaders(companyDiversityInfo.getLeaders());
            }

            if (null != companyDiversityInfo.getPhone()) {
                companyDiversityInfoDto.setPhone(companyDiversityInfo.getPhone());
            }

            if (null != companyDiversityInfo.getCity()) {
                companyDiversityInfoDto.setCounty(companyDiversityInfo.getCity());
            }
        }
        return companyDiversityInfoDto;
    }


    public static List<LeaderDiversityInfoDto> mapListLeaderDiversityEntityToDto(List<LeaderDiversityInfo> diversityLeaders) {
        List<LeaderDiversityInfoDto> diversityLeadersDtos = new ArrayList<>();
        for (LeaderDiversityInfo diversityLeaderInfo : diversityLeaders) {
            LeaderDiversityInfoDto leaderDto = new LeaderDiversityInfoDto();
            if (null != diversityLeaderInfo.getName()) {
                leaderDto.setName(diversityLeaderInfo.getName());
            }

            if (null != diversityLeaderInfo.getGender()) {
                leaderDto.setGender(diversityLeaderInfo.getGender());
            }
            if (null != diversityLeaderInfo.getEthnicity()) {
                leaderDto.setEthnicity(diversityLeaderInfo.getEthnicity());
            }

            leaderDto.setDisable(diversityLeaderInfo.getIsDisable());
            leaderDto.setLgbt(diversityLeaderInfo.getIsLgbt());
            leaderDto.setVeteran(diversityLeaderInfo.getIsVeteran());

            diversityLeadersDtos.add(leaderDto);

        }

        return diversityLeadersDtos;
    }

    public static LeaderDiversityInfoDto mapLeaderDiversityEntityToDto(LeaderDiversityInfo diversityLeaderInfo) {
        LeaderDiversityInfoDto leaderDiversityInfoDto = new LeaderDiversityInfoDto();
        if (null != diversityLeaderInfo) {

            if (null != diversityLeaderInfo.getName()) {
                leaderDiversityInfoDto.setName(diversityLeaderInfo.getName());
            }
            if (null != diversityLeaderInfo.getGender()) {
                leaderDiversityInfoDto.setGender(diversityLeaderInfo.getGender());
            }
            if (null != diversityLeaderInfo.getEthnicity()) {
                leaderDiversityInfoDto.setEthnicity(diversityLeaderInfo.getEthnicity());
            }

            leaderDiversityInfoDto.setDisable(diversityLeaderInfo.getIsDisable());
            leaderDiversityInfoDto.setLgbt(diversityLeaderInfo.getIsLgbt());
            leaderDiversityInfoDto.setVeteran(diversityLeaderInfo.getIsVeteran());
            leaderDiversityInfoDto.setSharePercentage(diversityLeaderInfo.getSharePercentage());

        }
        return leaderDiversityInfoDto;
    }
}
