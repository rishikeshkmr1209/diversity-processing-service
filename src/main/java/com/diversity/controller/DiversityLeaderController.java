package com.diversity.controller;

import com.diversity.model.LeaderDiversityInfoDto;
import com.diversity.service.DiversityLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiversityLeaderController {
    @Autowired
    private DiversityLeaderService leaderService;

    @PostMapping("/updateDiversityLeader")
    public ResponseEntity<String> updateLeaderDiversityInformation(@RequestBody LeaderDiversityInfoDto leaderDiversityInfo) {

        leaderService.updateLeaderDiversityInformation(leaderDiversityInfo);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping("/getDiversityLeader")
    public ResponseEntity<LeaderDiversityInfoDto> getLeaderDiversityInformation(String leaderName)
    {
        LeaderDiversityInfoDto diversityLeaderDto = leaderService.getLeaderByName(leaderName);
        return new ResponseEntity<>(diversityLeaderDto, HttpStatus.OK);
    }

    @GetMapping("/diversityLeaders")
    public ResponseEntity<List<LeaderDiversityInfoDto>> getAllDiversityLeaders()
    {
        List<LeaderDiversityInfoDto> diversityLeaders = leaderService.getAllDiversityLeaders();
        return new ResponseEntity<>(diversityLeaders, HttpStatus.OK);
    }

}
