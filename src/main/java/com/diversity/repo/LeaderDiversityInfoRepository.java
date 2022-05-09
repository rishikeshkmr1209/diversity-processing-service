package com.diversity.repo;

import com.diversity.entity.LeaderDiversityInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderDiversityInfoRepository extends JpaRepository<LeaderDiversityInfo,Integer> {
    LeaderDiversityInfo findByName(String name);
}