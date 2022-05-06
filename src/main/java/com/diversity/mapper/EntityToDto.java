package com.diversity.mapper;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.Employee;
import com.diversity.entity.LeaderDiversityInfo;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.EmployeeDto;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EntityToDto {


    public static EmployeeDto convertEntityToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setSalary(employee.getSalary());
        employeeDto.setDept(employee.getDept());
        return employeeDto;

    }

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


}
