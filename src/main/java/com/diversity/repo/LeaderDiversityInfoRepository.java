package com.diversity.repo;

import com.diversity.entity.LeaderDiversityInfo;
import com.yugabyte.data.jdbc.repository.YsqlRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaderDiversityInfoRepository extends YsqlRepository<LeaderDiversityInfo,Integer> {
    LeaderDiversityInfo findByName(String name);

    @Query(value="SELECT * FROM tbl_div_leader l WHERE l.company_id = ?1", nativeQuery = true)
    List<LeaderDiversityInfo> findLeadersUsingCompanyId(Integer companyId);
}