package com.example.demo_flow_u.service;

import com.example.demo_flow_u.entity.Department;
import com.example.demo_flow_u.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service

public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
    return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department getDepartmentByID(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public Department updateDepartmentById(Long departmentId, Department department) {
        Department depDb=departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName())&&!"".equalsIgnoreCase(department.getDepartmentName()))
        {
            depDb.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentCode())&&!"".equalsIgnoreCase(department.getDepartmentCode()))
        {
            depDb.setDepartmentCode(department.getDepartmentCode());
        }

        if(Objects.nonNull(department.getDepartmentAddress())&&!"".equalsIgnoreCase(department.getDepartmentAddress()))
        {
            depDb.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepository.save(depDb);
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameEqualsIgnoreCase(departmentName);
    }
}
