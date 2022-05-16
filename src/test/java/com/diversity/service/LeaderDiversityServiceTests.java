package com.diversity.service;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.LeaderDiversityInfo;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.LeaderDiversityInfoDto;
import com.diversity.repo.CompanyDiversityInfoRepository;
import com.diversity.repo.LeaderDiversityInfoRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.Mockito.when;

/**
 * Basic integration tests for service demo application.
 *
 * @author Dave Syer
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LeaderDiversityServiceTests {

    @Mock
    private LeaderDiversityInfoRepository leaderDiversityInfoRepository;

    @InjectMocks
    LeaderDiversityService leaderDiversityService;

    @Test
    public void getLeaderByName() throws IOException {
        String leaderName = "Ramu";
        ObjectMapper objectMapper = new ObjectMapper();

        InputStream input = new FileInputStream("src/test/resources/leaderDiversityJson.json");

        LeaderDiversityInfo leaderDiversityInfo = objectMapper.readValue(input, LeaderDiversityInfo.class);
        when(leaderDiversityInfoRepository.findByName(leaderName)).thenReturn(leaderDiversityInfo);

        LeaderDiversityInfoDto leaderDiversityInfoDto = leaderDiversityService.getLeaderByName(leaderName);
        then(leaderDiversityInfoDto.getEthnicity()).isEqualTo("Asian");

    }


    /*@Test
    public void getAllDiversityLeadersUsingCompanyId() throws IOException {

        String companyId = "199";
        ObjectMapper objectMapper = new ObjectMapper();

        InputStream input = new FileInputStream("src/test/resources/leaderListDiversityJson.json");

        *//*List<LeaderDiversityInfo> leaderDiversityInfos = objectMapper.readValue(input, new TypeReference<List<LeaderDiversityInfo>>() {
        });*//*

        List<LeaderDiversityInfo> leaderDiversityInfos = objectMapper.readValue(input, objectMapper.getTypeFactory().constructCollectionType(List.class, LeaderDiversityInfo.class));
        when(leaderDiversityInfoRepository.findLeadersUsingCompanyId(Integer.parseInt(companyId))).thenReturn(leaderDiversityInfos);

        List<LeaderDiversityInfoDto> leaderDiversityInfoDtos = leaderDiversityService.getAllDiversityLeadersUsingCompanyId(companyId);

        then(leaderDiversityInfoDtos.size()).isEqualTo(1);

    }*/

}