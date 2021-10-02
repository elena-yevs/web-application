package com.nixsolutions.evsiukova.webapp.webapplication;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "welcome", value = "/welcome")
public class AuthorizationServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        PrintWriter printWriter = response.getWriter();
        if (email.equals("admin") && password.equals("password")) {
            response.sendRedirect("admin.jsp");
        } else {
            printWriter.println("Hello, " + email + "!");
        }
        printWriter.close();
    }


}