package com.example.demo_flow_u.controller;

import com.example.demo_flow_u.entity.Department;
import com.example.demo_flow_u.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentservice;
    private Logger LOGGER =LoggerFactory.getLogger(DepartmentController.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside save department method");
        return departmentservice.saveDepartment(department);

    }
    @GetMapping("/getdepartments")
    public List<Department> GetDepartments(){
        LOGGER.info("Inside fetch all departments method");

        return departmentservice.getDepartments();
    }
    @GetMapping("/getdepartmentbyid/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        LOGGER.info("Inside get department by id method");
        return departmentservice.getDepartmentByID(departmentId);
    }
    @DeleteMapping("/deletedepartmentbyid/{id}")
    public String deleteDepartmentByID(@PathVariable("id") Long departmentId){
        LOGGER.info("delete department by id method");
        departmentservice.deleteDepartmentById(departmentId);
        return "Department deleted Successfully";
    }
    @PutMapping("/updatedepartmentbyid/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId,@RequestBody Department department){
        LOGGER.info("Inside update department by id method");
        return departmentservice.updateDepartmentById(departmentId,department);

    }
    @GetMapping("/getdepartmentbyname/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName){
        LOGGER.info("Inside get department by name method");
        return departmentservice.getDepartmentByName(departmentName);
    }


}
