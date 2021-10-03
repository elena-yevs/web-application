package com.nixsolutions.evsiukova.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * For establishing a connection with DB.
 */
public final class DatabaseConnector {
    /**
     * Url of BD.
     */
    private final String connectUrl;
    /**
     * DB username.
     */
    private final String connectUsername;
    /**
     * DB password.
     */
    private final String connectPassword;

    public DatabaseConnector(String connectUrl, String connectUsername, String connectPassword) {
        this.connectUrl = connectUrl;
        this.connectUsername = connectUsername;
        this.connectPassword = connectPassword;
    }

    /**
     * Opens connection to BD.
     *
     * @return connection
     */
    public Connection openConnection() {
        try {
            return DriverManager.getConnection(connectUrl, connectUsername, connectPassword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
