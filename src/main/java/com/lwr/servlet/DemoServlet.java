package com.lwr.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("info: com.lwr.DemoServlet.doPost(HttpServletRequest, HttpServletResponse)...");
        System.out.println("info: request.getRequestURL()=" + request.getRequestURL());
        Enumeration<String> initParameters = this.getInitParameterNames();
        while (initParameters.hasMoreElements()) {
            String initName = initParameters.nextElement();
            System.out.println("init-param: " + initName + "=" + this.getServletConfig().getInitParameter(initName));
        }
        request.setAttribute("name", request.getParameter("name"));
        request.getRequestDispatcher("/WEB-INF/views/demo.jsp").forward(request, response);
    }

}