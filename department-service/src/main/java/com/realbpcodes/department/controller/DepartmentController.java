package com.realbpcodes.department.controller;

import com.realbpcodes.department.entity.Department;
import com.realbpcodes.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j // for loggers
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    // save department method
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("saveDepartment method inside in DepartmentController");
        return  departmentService.saveDepartment(department);
    }

    // find one - find department by Id
    @GetMapping("{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("findDepartmentById method inside in DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
}
