/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uz.mmm.mvcf.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.mmm.mvcf.dto.EmployeeDto;

/**
 * created at: 25.10.2020
 * @author Yusupov Farrux <fyusupov90@gmail.com>
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EpmloyeeService{
    
    @Autowired
    DataSource dataSource;
    
    @Override
    public List<EmployeeDto> getAllEmployeeList() {
        List<EmployeeDto> list = new ArrayList<>();
        PreparedStatement ps = null;
        Connection conn = null;
        try{
            conn = dataSource.getConnection();
            conn.setAutoCommit(false);
            String sql = "SELECT e.id"
                    + "             e.firstname,"
                    + "             e.secondname,"
                    + "             e.phone_number,"
                    + "             e.employee_address,"
                    + "             e.employee_icon"
                    + "             FROM employee e";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            while(rs.next()){
                EmployeeDto emp = new EmployeeDto();
                emp.setId(rs.getInt("id"));
                emp.setFirstname(rs.getString("firstname"));
                emp.setSecondname(rs.getString("secondname"));
                emp.setPhone_number(rs.getString("phone_number"));
                emp.setEmployee_address(rs.getString("employee_address"));
                emp.setEmployee_icon(rs.getString("employee_icon"));
                list.add(emp);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
