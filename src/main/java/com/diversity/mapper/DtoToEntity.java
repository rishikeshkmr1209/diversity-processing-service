package com.diversity.mapper;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.LeaderDiversityInfo;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.LeaderDiversityInfoDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DtoToEntity {

    Logger logger = LoggerFactory.getLogger(DtoToEntity.class);
    public static LeaderDiversityInfo mapLeaderDiversityInfoDtoToEntity(LeaderDiversityInfoDto leaderDiversityInfoDto) {
        LeaderDiversityInfo leaderDiversityInfo = new LeaderDiversityInfo();
        leaderDiversityInfo.setName(leaderDiversityInfoDto.getName());
        leaderDiversityInfo.setCompanyName(leaderDiversityInfoDto.getCompanyName());
        leaderDiversityInfo.setEmailId(leaderDiversityInfoDto.getEmailId());
        leaderDiversityInfo.setMobileNumber(leaderDiversityInfoDto.getMobileNumber());
        return leaderDiversityInfo;
    }

    public static CompanyDiversityInfo mapCompanyDiversityInfoDtoToEntity(CompanyDiversityInfoDto companyDiversityInfoDto) {
        CompanyDiversityInfo companyDiversityInfo = new CompanyDiversityInfo();


        if (null != companyDiversityInfoDto) {
            if (null != companyDiversityInfoDto.getId()) {
                companyDiversityInfo.setId(companyDiversityInfoDto.getId());
            }
            if (null != companyDiversityInfoDto.getDunsName()) {
                companyDiversityInfo.setDunsName(companyDiversityInfoDto.getDunsName());
            }
            if (null != companyDiversityInfoDto.getDunsNumber()) {
                companyDiversityInfoDto.setDunsNumber(companyDiversityInfoDto.getDunsNumber());
            }
            if (null != companyDiversityInfoDto.getPhone()) {
                companyDiversityInfo.setPhone(companyDiversityInfoDto.getPhone());
            }
            if (null != companyDiversityInfoDto.getCounty()) {
                companyDiversityInfo.setCity(companyDiversityInfoDto.getCounty());
            }
            if (null != companyDiversityInfoDto.getCity()) {
                companyDiversityInfo.setCity(companyDiversityInfoDto.getCity());
            }
            if (null != companyDiversityInfoDto.getState()) {
                companyDiversityInfo.setState(companyDiversityInfoDto.getState());
            }
            if (null != companyDiversityInfoDto.getZipCode()) {
                companyDiversityInfo.setZipCode(companyDiversityInfoDto.getZipCode());
            }
            if (null != companyDiversityInfoDto.getLeaders()) {
                companyDiversityInfo.setLeaders(companyDiversityInfoDto.getLeaders());
            }

        }

        return companyDiversityInfo;
    }


}
