package com.diversity.controller;

import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.service.CompanyDiversityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CompanyDiversityController {

    Logger logger = LoggerFactory.getLogger(CompanyDiversityController.class);

    @Autowired
    private CompanyDiversityService service;

    @PostMapping("/company-diversity")
    public ResponseEntity<String> updateCompanyDiversityInformation(@RequestBody CompanyDiversityInfoDto companyDiversityInfoDto) {

        service.updateCompanyDiversityInformation(companyDiversityInfoDto);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping("/companies")
    public ResponseEntity<List<CompanyDiversityInfoDto>> getAllCompanies() {
        List<CompanyDiversityInfoDto> companyDiversityInfoDtos = service.getAllCompanies();
        return new ResponseEntity<>(companyDiversityInfoDtos, HttpStatus.OK);

    }

    @GetMapping("/companies/{companyName}")
    public ResponseEntity<CompanyDiversityInfoDto> getCompanyByName(@PathVariable String companyName) {
        CompanyDiversityInfoDto companyDiversityInfoDto = service.getCompanyByName(companyName);
        return new ResponseEntity<>(companyDiversityInfoDto, HttpStatus.OK);

    }

}
