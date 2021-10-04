package com.nixsolutions.evsiukova.webapp.webapplication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "new-user", value = "/new-user")
public class NewUserServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            getServletContext().getRequestDispatcher("/admin-table.jsp").forward(request, response);
    }
}
