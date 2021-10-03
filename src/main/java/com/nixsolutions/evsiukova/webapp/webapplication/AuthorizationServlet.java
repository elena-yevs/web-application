package com.nixsolutions.evsiukova.webapp.webapplication;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "welcome", value = "/welcome")
public class AuthorizationServlet extends HttpServlet {
    private final static String ADMIN = "admin";

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=utf-8");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        PrintWriter printWriter = response.getWriter();
        if (email.equals(ADMIN) && password.equals(ADMIN)) {
            response.sendRedirect("admin-table.jsp");
        } else {
            request.setAttribute("email", email);
            request.getRequestDispatcher("user.jsp").forward(request, response);
        }
        printWriter.close();
    }


}