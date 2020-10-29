/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uz.mmm.mvcf.configs;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * created at: 21.10.2020
 * @author Yusupov Farrux <fyusupov90@gmail.com>
 */
public class WebAppInitializer implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext container) throws ServletException {
//         Create the dispatcher servlet's Spring application context
        AnnotationConfigWebApplicationContext dispatcherServlet = new AnnotationConfigWebApplicationContext();
//        dispatcherServlet.register(MvcConfig.class, HibernateConfig.class, ServiceConfig.class);
        dispatcherServlet.register(MvcConfig.class);
        
//      Manage the lifecycle of the root application context
        container.addListener(new ContextLoaderListener(dispatcherServlet));
        
//           add backgourd task managers
//        container.addListener(new BackgroundTaskListener());

        dispatcherServlet.setServletContext(container);
        dispatcherServlet.refresh();
        
        DispatcherServlet dp = new DispatcherServlet(dispatcherServlet);
        dp.setThrowExceptionIfNoHandlerFound(false);

//        Register and map the dispatcher servlet
        ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(dispatcherServlet));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }

}
