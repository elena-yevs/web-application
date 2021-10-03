package com.nixsolutions.evsiukova.connection;

import com.nixsolutions.evsiukova.config.DatabaseConfig;
import com.nixsolutions.evsiukova.utils.DatabaseConnector;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Contains methods of connection and disconnection to BD.
 */
public class ConnectionManager {

    private static DatabaseConnector databaseConnector;

    private static Connection connection;

    /**
     * Opens connection to BD.
     * @return connection
     */
    public Connection openConnection() {
        databaseConnector = new DatabaseConnector(DatabaseConfig.DATABASE_URL,
                DatabaseConfig.DATABASE_USER, DatabaseConfig.DATABASE_PASSWORD);


        return connection = databaseConnector.openConnection();
    }

    /**
     * Closes connection to BD.
     */
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                connection = null;
            }
        }
    }

    public static Connection connection() {
        return connection;
    }
}
