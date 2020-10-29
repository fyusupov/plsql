/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uz.mmm.mvcf.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * created at: 21.10.2020
 * @author Yusupov Farrux <fyusupov90@gmail.com>
 */
public class MvcConfig implements WebMvcConfigurer{
    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/");
        bean.setSuffix(".jsp");
        return bean;
    }
    @Bean
    public LayoutInterceptor otherInterceptor() {
        LayoutInterceptor layout = new LayoutInterceptor();
        layout.setLayoutDataView("templates/layout_data");        
        return layout;
    }
}
