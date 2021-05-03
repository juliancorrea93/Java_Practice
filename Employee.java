/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.correajulian.capgemini;

/**
 *
 * @author Julian
 */
public class Employee {
    private int empId;
    private String name;
    
    public void setName(String emp_name) {
        name = emp_name;
    }
    public void setempid(int emp_id) {
        empId = emp_id;
    }
    public String getName() {
        return name;
    }
    public int getempid() {
        return empId;
    }
    //You can generate getters and setters within STS
}
