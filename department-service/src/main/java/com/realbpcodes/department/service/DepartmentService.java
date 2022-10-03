package com.realbpcodes.department.service;

import com.realbpcodes.department.entity.Department;
import com.realbpcodes.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j // for loggers
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("saveDepartment method inside in DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("findDepartmentById method inside in DepartmentService");
        return departmentRepository.findDepartmentByDepartmentId(departmentId);
    }
}
