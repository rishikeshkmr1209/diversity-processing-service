package com.diversity.repo;

import com.diversity.model.LeaderDiversityInfoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderDiversityInfoRepository extends JpaRepository<LeaderDiversityInfoDto,Integer> {

}