package com.example.demo_flow_u.repository;

import com.example.demo_flow_u.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

   public  Department findByDepartmentName(String departmentName);
   public Department findByDepartmentNameEqualsIgnoreCase(String departmentName);

}
