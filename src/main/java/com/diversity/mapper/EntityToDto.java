package com.diversity.mapper;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.LeaderDiversityInfo;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.EmployeeDto;
import com.diversity.model.LeaderDiversityInfoDto;

import java.util.ArrayList;
import java.util.List;

public class EntityToDto {



    public static List<CompanyDiversityInfoDto> mapListCompanyDiversityEntityToDto(List<CompanyDiversityInfo> companyDiversityInfos) {
        List<CompanyDiversityInfoDto> companyDiversityInfoDtos = new ArrayList<>();
        for (CompanyDiversityInfo companyDiversityInfo : companyDiversityInfos) {
            CompanyDiversityInfoDto companyDiversityInfoDto = new CompanyDiversityInfoDto();
            if (null != companyDiversityInfo.getCompanyName()) {
                companyDiversityInfoDto.setCompanyName(companyDiversityInfo.getCompanyName());
            }
            if (null != companyDiversityInfo.getEmailId()) {
                companyDiversityInfoDto.setEmailId(companyDiversityInfo.getEmailId());
            }
            if (null != companyDiversityInfo.getId()) {
                companyDiversityInfoDto.setId(companyDiversityInfo.getId());
            }
            if (null != companyDiversityInfo.getMobileNumber()) {
                companyDiversityInfoDto.setMobileNumber(companyDiversityInfo.getMobileNumber());
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

            if (null != companyDiversityInfo.getCompanyName()) {
                companyDiversityInfoDto.setCompanyName(companyDiversityInfo.getCompanyName());
            }

            if (null != companyDiversityInfo.getLeaders()) {
                companyDiversityInfoDto.setLeaders(companyDiversityInfo.getLeaders());
            }

            if (null != companyDiversityInfo.getMobileNumber()) {
                companyDiversityInfoDto.setMobileNumber(companyDiversityInfo.getMobileNumber());
            }

            if (null != companyDiversityInfo.getEmailId()) {
                companyDiversityInfoDto.setEmailId(companyDiversityInfo.getEmailId());
            }
        }
        return companyDiversityInfoDto;
    }


    public static List<LeaderDiversityInfoDto> mapListLeaderDiversityEntityToDto(List<LeaderDiversityInfo> diversityLeaders) {
        List<LeaderDiversityInfoDto> diversityLeadersDtos = new ArrayList<>();
        for ( LeaderDiversityInfo diversityLeaderInfo : diversityLeaders) {
            LeaderDiversityInfoDto leaderDto = new LeaderDiversityInfoDto();
            if (null != diversityLeaderInfo.getName()) {
                leaderDto.setName(diversityLeaderInfo.getName());
            }

            if (null != diversityLeaderInfo.getCompanyName()) {
                leaderDto.setCompanyName(diversityLeaderInfo.getCompanyName());
            }

            if (null != diversityLeaderInfo.getMobileNumber()) {
                leaderDto.setMobileNumber(diversityLeaderInfo.getMobileNumber());
            }

            if (null != diversityLeaderInfo.getEmailId()) {
                leaderDto.setEmailId(diversityLeaderInfo.getEmailId());
            }

            if (null != diversityLeaderInfo.getGender()) {
                leaderDto.setGender(diversityLeaderInfo.getGender());
            }

            if (null != diversityLeaderInfo.getColor()) {
                leaderDto.setColor(diversityLeaderInfo.getColor());
            }

            if (null != diversityLeaderInfo.getLanguage()) {
                leaderDto.setLanguage(diversityLeaderInfo.getLanguage());
            }

            leaderDto.setSalary(diversityLeaderInfo.getSalary());

            if (null != diversityLeaderInfo.getMaritialStatus()) {
                leaderDto.setMaritialStatus(diversityLeaderInfo.getMaritialStatus());
            }

            if (null != diversityLeaderInfo.getSexualOrientation()) {
                leaderDto.setSexualOrientation(diversityLeaderInfo.getSexualOrientation());
            }

            if (null != diversityLeaderInfo.getPoliticalOrientation()) {
                leaderDto.setPoliticalOrientation(diversityLeaderInfo.getPoliticalOrientation());
            }

            if (null != diversityLeaderInfo.getReligion()) {
                leaderDto.setReligion(diversityLeaderInfo.getReligion());
            }

            if (null != diversityLeaderInfo.getNationality()) {
                leaderDto.setNationality(diversityLeaderInfo.getNationality());
            }

            leaderDto.setDisable(diversityLeaderInfo.isDisable());
            leaderDto.setLgbt(diversityLeaderInfo.isLgbt());
            leaderDto.setVeteran(diversityLeaderInfo.isVeteran());

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

            if (null != diversityLeaderInfo.getCompanyName()) {
                leaderDiversityInfoDto.setCompanyName(diversityLeaderInfo.getCompanyName());
            }

            if (null != diversityLeaderInfo.getMobileNumber()) {
                leaderDiversityInfoDto.setMobileNumber(diversityLeaderInfo.getMobileNumber());
            }

            if (null != diversityLeaderInfo.getEmailId()) {
                leaderDiversityInfoDto.setEmailId(diversityLeaderInfo.getEmailId());
            }

            if (null != diversityLeaderInfo.getGender()) {
                leaderDiversityInfoDto.setGender(diversityLeaderInfo.getGender());
            }

            if (null != diversityLeaderInfo.getColor()) {
                leaderDiversityInfoDto.setColor(diversityLeaderInfo.getColor());
            }

            if (null != diversityLeaderInfo.getLanguage()) {
                leaderDiversityInfoDto.setLanguage(diversityLeaderInfo.getLanguage());
            }

            leaderDiversityInfoDto.setSalary(diversityLeaderInfo.getSalary());

            if (null != diversityLeaderInfo.getMaritialStatus()) {
                leaderDiversityInfoDto.setMaritialStatus(diversityLeaderInfo.getMaritialStatus());
            }

            if (null != diversityLeaderInfo.getSexualOrientation()) {
                leaderDiversityInfoDto.setSexualOrientation(diversityLeaderInfo.getSexualOrientation());
            }

            if (null != diversityLeaderInfo.getPoliticalOrientation()) {
                leaderDiversityInfoDto.setPoliticalOrientation(diversityLeaderInfo.getPoliticalOrientation());
            }

            if (null != diversityLeaderInfo.getReligion()) {
                leaderDiversityInfoDto.setReligion(diversityLeaderInfo.getReligion());
            }

            if (null != diversityLeaderInfo.getNationality()) {
                leaderDiversityInfoDto.setNationality(diversityLeaderInfo.getNationality());
            }

            leaderDiversityInfoDto.setDisable(diversityLeaderInfo.isDisable());
            leaderDiversityInfoDto.setLgbt(diversityLeaderInfo.isLgbt());
            leaderDiversityInfoDto.setVeteran(diversityLeaderInfo.isVeteran());

        }
        return leaderDiversityInfoDto;
    }
}
