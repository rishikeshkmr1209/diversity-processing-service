package com.diversity.mapper;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.LeaderDiversityInfo;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.LeaderDiversityInfoDto;

public  class DtoToEntity {
    public static LeaderDiversityInfo mapLeaderDiversityInfoDtoToEntity(LeaderDiversityInfoDto leaderDiversityInfoDto) {
      LeaderDiversityInfo leaderDiversityInfo=new LeaderDiversityInfo();
      leaderDiversityInfo.setName(leaderDiversityInfoDto.getName());
      leaderDiversityInfo.setCompanyName(leaderDiversityInfoDto.getCompanyName());
      leaderDiversityInfo.setEmailId(leaderDiversityInfoDto.getEmailId());
      leaderDiversityInfo.setMobileNumber(leaderDiversityInfoDto.getMobileNumber());
      return  leaderDiversityInfo;
    }

    public static CompanyDiversityInfo mapCompnayDiversityInfoDtoToEntity(CompanyDiversityInfoDto companyDiversityInfoDto){
      CompanyDiversityInfo companyDiversityInfo=new CompanyDiversityInfo();
      companyDiversityInfo.setCompanyName(companyDiversityInfoDto.getCompanyName());
      companyDiversityInfo.setEmailId(companyDiversityInfoDto.getEmailId());
      companyDiversityInfo.setMobileNumber(companyDiversityInfoDto.getMobileNumber());
      companyDiversityInfo.setLeaders(companyDiversityInfoDto.getLeaders());
      return companyDiversityInfo;
    }

}
