package com.nixsolutions.evsiukova.daoimpl;

import com.nixsolutions.evsiukova.connection.ConnectionManager;
import com.nixsolutions.evsiukova.remover.RemoverTable;

/**
 * Dropping tables program.
 *
 * <p>Drops tables `users`, `roles`.
 */
public class Remover extends ConnectionManager {
    private static final ConnectionManager connectionManager = new ConnectionManager();

    /**
     * Entry point to a program.
     */
    public static void main(String[] args) {
        connectionManager.openConnection();

        RemoverTable removerTable = new RemoverTable(connection());
        removerTable.dropUsersTable();
        removerTable.dropRolesTable();

        connectionManager.closeConnection();
    }
}
