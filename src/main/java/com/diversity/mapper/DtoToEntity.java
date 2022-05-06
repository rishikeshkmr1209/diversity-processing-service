package com.diversity.mapper;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.Employee;
import com.diversity.entity.LeaderDiversityInfo;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.EmployeeDto;
import com.diversity.model.LeaderDiversityInfoDto;

import javax.persistence.*;
import java.util.Set;

public class DtoToEntity {
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

    public static Employee convertDtoToEntity(EmployeeDto employee) {
        Employee emp = new Employee();
        emp.setName(employee.getName());
        emp.setSalary(employee.getSalary());
        emp.setDept(employee.getDept());
        return emp;
    }


}
