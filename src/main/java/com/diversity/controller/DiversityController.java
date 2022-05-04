package com.diversity.controller;

import com.diversity.model.EmployeeDto;
import com.diversity.model.LeaderDiversityInfoDto;
import com.diversity.service.DiversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DiversityController {

    @Autowired
    private DiversityService service;

    @PostMapping("/employee")
    public EmployeeDto addEmployee(@RequestBody EmployeeDto employee) {

        return service.addEmployee(employee);
    }


    @GetMapping("/employeeById")
    public EmployeeDto getEmployeeById(@RequestParam Integer id) {
        return service.getEmployeeById(id);

    }

    @PostMapping("/leader-diversity")
    public ResponseEntity<String> updateLeaderDiversityInformation(@RequestBody LeaderDiversityInfoDto leaderDiversityInfo) {

        service.updateLeaderDiversityInformation(leaderDiversityInfo);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

}
