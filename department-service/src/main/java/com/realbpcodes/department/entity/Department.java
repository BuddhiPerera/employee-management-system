package com.realbpcodes.department.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
// Adding Lombok for getters & setters, and constructors
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    // generate the department id value auto
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // defining department attributes
    private Long departmentId;
    private String departmentName;
    private String departmentCode;
    private String departmentLocation;
}
