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
            if (null != companyDiversityInfoDto.getCompanyName()) {
                companyDiversityInfo.setCompanyName(companyDiversityInfoDto.getCompanyName());
            }
            if (null != companyDiversityInfoDto.getLeaders()) {
                companyDiversityInfo.setLeaders(companyDiversityInfoDto.getLeaders());
            }
            if (null != companyDiversityInfoDto.getMobileNumber()) {
                companyDiversityInfo.setMobileNumber(companyDiversityInfoDto.getMobileNumber());
            }
            if (null != companyDiversityInfoDto.getEmailId()) {
                companyDiversityInfo.setEmailId(companyDiversityInfoDto.getEmailId());
            }
        }

        return companyDiversityInfo;
    }


}
