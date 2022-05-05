package com.diversity.service;

import com.diversity.entity.Employee;
import com.diversity.mapper.DtoToEntity;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.EmployeeDto;
import com.diversity.model.LeaderDiversityInfoDto;
import com.diversity.repo.EmployeeRepository;
import com.diversity.repo.LeaderDiversityInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class DiversityService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private LeaderDiversityInfoRepository leaderDiversityInfoRepository;

    public EmployeeDto addEmployee(@RequestBody EmployeeDto employeeDto) {
        System.out.println("Inside addEmployee: " + employeeDto);
        Employee employee = repository.save(convertDtoToEntity(employeeDto));
        System.out.println("addEmployee: "+employee);
        return convertEntityToDto(employee);

    }

    public EmployeeDto getEmployeeById(int id) {
        Optional<Employee> employee = repository.findById(id);
        System.out.println("getEmployeeById: "+employee + " for id: "+id);
        if(employee.isPresent()){
            return convertEntityToDto(employee.get());
        }else{
            return null;
        }

    }


    private Employee convertDtoToEntity(EmployeeDto employee) {
        Employee emp = new Employee();
        emp.setName(employee.getName());
        emp.setSalary(employee.getSalary());
        emp.setDept(employee.getDept());
        return emp;
    }

    private EmployeeDto convertEntityToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setSalary(employee.getSalary());
        employeeDto.setDept(employee.getDept());
        return employeeDto;

    }

    public void updateLeaderDiversityInformation(LeaderDiversityInfoDto leaderDiversityInfo) {
        leaderDiversityInfoRepository.save( DtoToEntity.mapLeaderDiversityInfoDtoToEntity(leaderDiversityInfo));

    }


    public void updateCompanyDiversityInformation(CompanyDiversityInfoDto companyDiversityInfoDto) {

    }
}
