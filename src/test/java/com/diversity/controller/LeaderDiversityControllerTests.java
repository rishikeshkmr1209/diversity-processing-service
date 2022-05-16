package com.diversity.controller;

import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.LeaderDiversityInfoDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

/**
 * Basic integration tests for service demo application.
 *
 * @author Rishikesh Kumar
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LeaderDiversityControllerTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

   // @Test
    public void shouldReturn200WhenSendingRequestToController() throws Exception {
        String leaderName="Ramu";
        @SuppressWarnings("rawtypes")
        ResponseEntity<LeaderDiversityInfoDto> entity = this.testRestTemplate.exchange(
                "http://localhost:" + this.port + "/leaders/"+leaderName, HttpMethod.GET, null, new ParameterizedTypeReference<LeaderDiversityInfoDto>() {
                });

        then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }


}