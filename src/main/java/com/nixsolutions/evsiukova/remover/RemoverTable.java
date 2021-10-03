package com.nixsolutions.evsiukova.remover;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Contain methods of dropping tables from BD.
 */
public class RemoverTable {
    private final Connection connection;

    public RemoverTable(Connection connection) {
        this.connection = connection;
    }

    /**
     * Drops table `users` from BD.
     */
    public void dropUsersTable() {
        String sql = "DROP TABLE users";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Drops table `roles` from BD.
     */
    public void dropRolesTable() {
        String sql = "DROP TABLE roles";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
