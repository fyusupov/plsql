/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uz.mmm.mvcf.configs;

import java.util.Calendar;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 * created at: 21.10.2020
 * @author Yusupov Farrux <fyusupov90@gmail.com>
 */
class LayoutInterceptor {

    private static final String NO_LAYOUT = "noLayout:";

    private String layoutView;        
    
    public void setLayoutDataView(String layoutDataView) {
        this.layoutView = layoutDataView;
    }
    private void includeLayout(ModelAndView modelAndView, String originalView) {
        boolean noLayout = originalView.startsWith(NO_LAYOUT);
        String realViewName = (noLayout) ? originalView.substring(NO_LAYOUT.length()) : originalView;        
        modelAndView.addObject("view", realViewName);
        modelAndView.setViewName(layoutView);            
        
    }
}
