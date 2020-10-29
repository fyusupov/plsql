/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uz.mmm.mvcf.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * created at: 21.10.2020
 * @author Yusupov Farrux <fyusupov90@gmail.com>
 */
@Controller
@RequestMapping("/main")
public class HomeController {
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public void index(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String context = request.getContextPath();
        response.sendRedirect(context+"/main/index");
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String homePage(HttpServletRequest request, HttpServletResponse response, Model model){
        
        return "index";
    }
}
