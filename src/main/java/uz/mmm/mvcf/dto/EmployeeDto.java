/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uz.mmm.mvcf.dto;

/**
 * created at: 25.10.2020
 * @author Yusupov Farrux <fyusupov90@gmail.com>
 */
public class EmployeeDto {
    private Integer id;
    private String firstname;
    private String secondname;
    private String phone_number;
    private String employee_address;
    private String employee_icon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public String getEmployee_icon() {
        return employee_icon;
    }

    public void setEmployee_icon(String employee_icon) {
        this.employee_icon = employee_icon;
    }
    
}
