package com.diversity.service;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.Employee;
import com.diversity.mapper.DtoToEntity;
import com.diversity.mapper.EntityToDto;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.EmployeeDto;
import com.diversity.model.LeaderDiversityInfoDto;
import com.diversity.repo.CompanyDiversityInfoRepository;
import com.diversity.repo.EmployeeRepository;
import com.diversity.repo.LeaderDiversityInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class DiversityService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private LeaderDiversityInfoRepository leaderDiversityInfoRepository;

    private CompanyDiversityInfoRepository companyDiversityInfoRepository;

    public EmployeeDto addEmployee(@RequestBody EmployeeDto employeeDto) {
        System.out.println("Inside addEmployee: " + employeeDto);
        Employee employee = repository.save(DtoToEntity.convertDtoToEntity(employeeDto));
        System.out.println("addEmployee: " + employee);
        return EntityToDto.convertEntityToDto(employee);

    }

    public EmployeeDto getEmployeeById(int id) {
        Optional<Employee> employee = repository.findById(id);
        System.out.println("getEmployeeById: " + employee + " for id: " + id);
        if (employee.isPresent()) {
            return EntityToDto.convertEntityToDto(employee.get());
        } else {
            return null;
        }

    }


   /* public void updateLeaderDiversityInformation(LeaderDiversityInfoDto leaderDiversityInfo) {
        leaderDiversityInfoRepository.save(DtoToEntity.mapLeaderDiversityInfoDtoToEntity(leaderDiversityInfo));

    }*/


    public void updateCompanyDiversityInformation(CompanyDiversityInfoDto companyDiversityInfoDto) {
        CompanyDiversityInfo companyDiversityInfo=DtoToEntity.mapCompanyDiversityInfoDtoToEntity(companyDiversityInfoDto);
            companyDiversityInfoRepository.save(companyDiversityInfo);
    }

    public List<CompanyDiversityInfoDto> getAllCompanies() {
        List<CompanyDiversityInfo> companyDiversityInfos = companyDiversityInfoRepository.findAll();

        return EntityToDto.mapListCompanyDiversityEntityToDto(companyDiversityInfos);
    }

    public CompanyDiversityInfoDto getCompanyByName(String companyName) {
        CompanyDiversityInfo companyDiversityInfo = companyDiversityInfoRepository.findByCompanyName(companyName);
        return EntityToDto.mapCompanyDiversityEntityToDto(companyDiversityInfo);
    }
}
