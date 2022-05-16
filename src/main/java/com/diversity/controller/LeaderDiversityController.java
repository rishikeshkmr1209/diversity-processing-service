package com.diversity.controller;

import com.diversity.model.LeaderDiversityInfoDto;
import com.diversity.service.LeaderDiversityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LeaderDiversityController {

    Logger logger = LoggerFactory.getLogger(LeaderDiversityController.class);
    @Autowired
    private LeaderDiversityService leaderService;

    @PostMapping("/leader-diversity")
    public ResponseEntity<String> updateLeaderDiversityInformation(@RequestBody LeaderDiversityInfoDto leaderDiversityInfo) {

        leaderService.updateLeaderDiversityInformation(leaderDiversityInfo);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping("/leaders/{leaderName}")
    public ResponseEntity<LeaderDiversityInfoDto> getLeaderDiversityInformation(@PathVariable String leaderName)
    {
        LeaderDiversityInfoDto diversityLeaderDto = leaderService.getLeaderByName(leaderName);
        return new ResponseEntity<>(diversityLeaderDto, HttpStatus.OK);
    }

    @GetMapping("/leaders")
    public ResponseEntity<List<LeaderDiversityInfoDto>> getAllDiversityLeaders()
    {
        List<LeaderDiversityInfoDto> diversityLeaders = leaderService.getAllDiversityLeaders();
        return new ResponseEntity<>(diversityLeaders, HttpStatus.OK);
    }

    @GetMapping("/leaders-details/{companyId}")
    public ResponseEntity<List<LeaderDiversityInfoDto>> getAllDiversityLeadersUsingCompanyId(@PathVariable String companyId)
    {
        List<LeaderDiversityInfoDto> diversityLeaders = leaderService.getAllDiversityLeadersUsingCompanyId(companyId);
        return new ResponseEntity<>(diversityLeaders, HttpStatus.OK);
    }



}
