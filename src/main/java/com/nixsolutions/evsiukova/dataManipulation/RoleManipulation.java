package com.nixsolutions.evsiukova.dataManipulation;

import com.nixsolutions.evsiukova.dao.RoleDao;
import com.nixsolutions.evsiukova.entity.Role;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO implementation for `roles`.
 */
public class RoleManipulation extends Role implements RoleDao {

    public Connection connection;

    public RoleManipulation(Connection connection) {
        this.connection = connection;
    }

    /**
     * Fills columns in a table.
     */
    @Override
    public void create() {
        String sql = "INSERT INTO roles (id, roleName) " +
                "VALUES(0, 'unauthorized user'), (1, 'admin'), (2, 'user')";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Updates table according to sql.
     */
    @Override
    public void update() {
        String sql = "UPDATE roles SET roleName = ? WHERE id = 0";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, "guest");
            preparedStatement.executeUpdate();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Removes record from table if its id = 0.
     */
    @Override
    public void remove() {
        String sql = "DELETE FROM roles WHERE id = 0";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.executeUpdate();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Selects roles from table.
     *
     * @param roleName role name to find
     * @return list of roles
     */
    @Override
    public List<Role> findByRoleName(String roleName) {
        List<Role> roles = new ArrayList<>();
        String sql = "SELECT * FROM roles";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                roleName = resultSet.getString(2);
                roles.add(new Role(id, roleName));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return roles;
    }
}
