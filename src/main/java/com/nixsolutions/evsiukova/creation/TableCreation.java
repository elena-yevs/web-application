package com.nixsolutions.evsiukova.creation;

import com.nixsolutions.evsiukova.connection.ConnectionManager;

import java.sql.*;

/**
 * Contains methods of tables creation.
 */
public class TableCreation extends ConnectionManager {

    private final Connection connection;

    public TableCreation(Connection connection) {
        this.connection = connection;
    }

    /**
     * Creates table `users` in BD.
     *
     * <p>Table contains eight columns: id(PK), role_id(FK), username, firstname, lastname,
     *
     * <p>email, date of birth, password.
     **/
    public void createTableUsers() {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE  users ( " +
                    "id INT NOT NULL PRIMARY KEY,"
                    + "role_id INT NOT NULL,"
                    + "FOREIGN KEY (role_id) REFERENCES roles (id),"
                    + "username VARCHAR(256) NOT NULL UNIQUE,"
                    + "firstname VARCHAR(256) NOT NULL,"
                    + "lastname VARCHAR(256) NOT NULL,"
                    + "email VARCHAR(256) NOT NULL,"
                    + "dob VARCHAR(256) NOT NULL,"
                    + "password VARCHAR(256) NOT NULL)");

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Creates table `roles` in BD.
     *
     * <p>Table contains two columns: id (PK), roleName.
     **/
    public void createTableRoles() {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE  roles ( " +
                    "id INT NOT NULL PRIMARY KEY,"
                    + "roleName VARCHAR(256) NOT NULL)");
            statement.executeUpdate("DROP TABLE IF EXISTS  role ");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
