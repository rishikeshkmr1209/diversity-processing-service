package com.diversity.service;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.repo.CompanyDiversityInfoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.BDDAssertions.then;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

/**
 * Basic integration tests for service demo application.
 *
 * @author Dave Syer
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CompanyDiversityServiceTests {

    @Mock
    CompanyDiversityInfoRepository companyDiversityInfoRepository;

    @InjectMocks
    CompanyDiversityService companyDiversityService;

    @Test
    public void getCompanyByDunsName1() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        InputStream input = new FileInputStream("src/test/resources/companyDiversityJson.json");

        CompanyDiversityInfo companyDiversityInfo = objectMapper.readValue(input, CompanyDiversityInfo.class);

        String dunsName = companyDiversityInfo.getDunsName();
        Mockito.when(companyDiversityInfoRepository.findByDunsNameContainingIgnoreCase(dunsName)).thenReturn(companyDiversityInfo);

        CompanyDiversityInfoDto companyDiversityInfoDto = companyDiversityService.getCompanyByName(dunsName);
        then(companyDiversityInfoDto.getCity()).isEqualTo(companyDiversityInfo.getCity());
    }


}