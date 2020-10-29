/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uz.mmm.mvcf.services;

import java.util.List;
import uz.mmm.mvcf.dto.EmployeeDto;

/**
 * created at: 25.10.2020
 * @author Yusupov Farrux <fyusupov90@gmail.com>
 */
public interface EpmloyeeService {
    List<EmployeeDto> getAllEmployeeList();
}
