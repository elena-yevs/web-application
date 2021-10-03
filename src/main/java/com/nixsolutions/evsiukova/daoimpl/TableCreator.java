package com.nixsolutions.evsiukova.daoimpl;

import com.nixsolutions.evsiukova.connection.ConnectionManager;
import com.nixsolutions.evsiukova.creation.TableCreation;

/**
 * Creating tables program.
 *
 * <p>Creates tables `roles`, `users`.
 */
public class TableCreator extends ConnectionManager {

    private static final ConnectionManager connectionManager = new ConnectionManager();

    /**
     * Entry point to a program.
     */
    public static void main(String[] args) {
        connectionManager.openConnection();

        TableCreation tableCreation = new TableCreation(connection());
        tableCreation.createTableRoles();
        tableCreation.createTableUsers();
        connectionManager.closeConnection();
    }
}
