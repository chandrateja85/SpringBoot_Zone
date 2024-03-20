package com.example.demo_flow_u.service;

import com.example.demo_flow_u.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getDepartments();

    public Department getDepartmentByID(Long departmentId);

    public void deleteDepartmentById(Long departmentID);

    public Department updateDepartmentById(Long departmentId,Department department);

    public Department getDepartmentByName(String departmentName);
}
