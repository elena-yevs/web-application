package com.nixsolutions.evsiukova.daoimpl;

import com.nixsolutions.evsiukova.connection.ConnectionManager;
import com.nixsolutions.evsiukova.dataManipulation.RoleManipulation;
import com.nixsolutions.evsiukova.dataManipulation.UserManipulation;

/**
 * DAO implementation.
 * <p>
 * Creates, updates, deletes, finds roles and emails.
 */
public class InteractionWithTables extends ConnectionManager {

    private static final ConnectionManager connectionManager = new ConnectionManager();

    /**
     * Entry point to a program.
     */
    public static void main(String[] args) {
        connectionManager.openConnection();

        RoleManipulation roleManipulation = new RoleManipulation(connection());
        roleManipulation.create();
        roleManipulation.update();
        roleManipulation.remove();

        UserManipulation userManipulation = new UserManipulation(connection());
        userManipulation.create();
        userManipulation.update();
        userManipulation.remove();
        userManipulation.findAll();
        userManipulation.findByEmail("admin");

        roleManipulation.findByRoleName("admin");

        connectionManager.closeConnection();
    }
}

