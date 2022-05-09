package com.diversity.controller;

import com.diversity.model.LeaderDiversityInfoDto;
import com.diversity.service.DiversityLeaderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LeaderDiversityController {

    Logger logger = LoggerFactory.getLogger(LeaderDiversityController.class);
    @Autowired
    private DiversityLeaderService leaderService;

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

}
