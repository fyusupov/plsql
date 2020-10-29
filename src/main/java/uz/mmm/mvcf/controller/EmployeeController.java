/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uz.mmm.mvcf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.mmm.mvcf.services.EpmloyeeService;

/**
 * created at: 25.10.2020
 * @author Yusupov Farrux <fyusupov90@gmail.com>
 */
@Controller
@RequestMapping("employee")
public class EmployeeController {
    
    @Autowired
    EpmloyeeService epmloyeeService;
    
    
}
