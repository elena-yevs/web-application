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
import java.sql.Connection;
import java.util.ArrayList;

@WebServlet(name = "new-user", value = "/new-user")
public class NewUserServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
            getServletContext().getRequestDispatcher("/admin-table.jsp").forward(request, response);

    }
}
