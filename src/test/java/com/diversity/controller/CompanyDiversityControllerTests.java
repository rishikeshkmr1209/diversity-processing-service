package com.diversity.controller;

import java.util.List;
import java.util.Map;

import com.diversity.model.CompanyDiversityInfoDto;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.BDDAssertions.then;

/**
 * Basic integration tests for service demo application.
 *
 * @author Dave Syer
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CompanyDiversityControllerTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    //@Test
    public void shouldReturn200WhenSendingRequestToController() throws Exception {
        @SuppressWarnings("rawtypes")
        ResponseEntity<List<CompanyDiversityInfoDto>> entity = this.testRestTemplate.exchange(
                "http://localhost:" + this.port + "/companies", HttpMethod.GET, null, new ParameterizedTypeReference<List<CompanyDiversityInfoDto>>() {
                });

        then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }


}
