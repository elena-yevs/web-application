package com.nixsolutions.evsiukova.webapp.webapplication;

import com.nixsolutions.evsiukova.connection.ConnectionManager;
import com.nixsolutions.evsiukova.dataManipulation.UserManipulation;
import com.nixsolutions.evsiukova.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "admin", value = "/admin")
public class AdminServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            getServletContext().getRequestDispatcher("/admin-table.jsp").forward(request, response);

    }
}
