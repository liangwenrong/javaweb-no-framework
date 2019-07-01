package com.lwr.listener;

import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DemoListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("info: com.lwr.filter.DemoListener.contextDestroyed(ServletContextEvent)...");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("info: com.lwr.filter.DemoListener.contextInitialized(ServletContextEvent)...");
        Enumeration<String> initParameterNames = sce.getServletContext().getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String initName = initParameterNames.nextElement();
            System.out.println(
                    "context-param: " + initName + "=" + sce.getServletContext().getInitParameter(initName));
        }
    }

}
