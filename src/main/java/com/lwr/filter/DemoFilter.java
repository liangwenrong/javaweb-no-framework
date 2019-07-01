package com.lwr.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class DemoFilter implements Filter{

    @Override
    public void destroy() {
        System.out.println("info: com.lwr.filter.DemoFilter.destroy()...");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)req;
        System.out.println("info: com.lwr.filter.DemoFilter.doFilter(ServletRequest, ServletResponse, FilterChain)...");
        System.out.println("info: doFilter url="+request.getRequestURI());
        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig fc) throws ServletException {
        System.out.println("info: com.lwr.filter.DemoFilter.init(FilterConfig)...");
    }

}
