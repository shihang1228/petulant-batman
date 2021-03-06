package com.baldurtech;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public class DispatcherServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        resp.getWriter().println(req.getServletPath());
        resp.getWriter().println(req.getContextPath());
        resp.getWriter().println(req.getRequestURI());
        resp.getWriter().println(req.getRequestURL());
    }
}