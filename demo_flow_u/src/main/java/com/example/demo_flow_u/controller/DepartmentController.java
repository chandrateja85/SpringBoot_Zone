package com.example.demo_flow_u.controller;

import com.example.demo_flow_u.entity.Department;
import com.example.demo_flow_u.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentservice;
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        return departmentservice.saveDepartment(department);

    }
    @GetMapping("/getdepartments")
    public List<Department> GetDepartments(){
        return departmentservice.getDepartments();
    }
    @GetMapping("/getdepartmentbyid/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentservice.getDepartmentByID(departmentId);
    }
    @DeleteMapping("/deletedepartmentbyid/{id}")
    public String deleteDepartmentByID(@PathVariable("id") Long departmentId){
        departmentservice.deleteDepartmentById(departmentId);
        return "Department deleted Successfully";
    }
    @PutMapping("/updatedepartmentbyid/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentservice.updateDepartmentById(departmentId,department);

    }
    @GetMapping("/getdepartmentbyname/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName){
        return departmentservice.getDepartmentByName(departmentName);
    }


}
