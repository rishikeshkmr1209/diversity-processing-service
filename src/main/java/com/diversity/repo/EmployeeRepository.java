package com.diversity.repo;

import com.diversity.entity.Employee;
import com.yugabyte.data.jdbc.repository.YsqlRepository;

public interface EmployeeRepository extends YsqlRepository<Employee, Integer> {
    public Employee findByName(String name);
}
