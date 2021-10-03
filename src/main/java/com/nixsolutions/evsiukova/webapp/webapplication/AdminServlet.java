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
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;


@WebServlet(name = "admin", value = "/admin")
public class AdminServlet extends HttpServlet {
    private static final ConnectionManager connectionManager = new ConnectionManager();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = connectionManager.openConnection();
            UserManipulation userManipulation = new UserManipulation(connection);
            ArrayList<User> users = userManipulation.findAll();
            request.setAttribute("users", users);
            getServletContext().getRequestDispatcher("/admin-table.jsp").forward(request, response);
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }

    }
}
