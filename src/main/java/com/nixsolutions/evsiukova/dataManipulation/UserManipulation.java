package com.nixsolutions.evsiukova.dataManipulation;

import com.nixsolutions.evsiukova.dao.UserDao;
import com.nixsolutions.evsiukova.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO implementation for `users`.
 */
public class UserManipulation extends User implements UserDao {
    public Connection connection;

    public UserManipulation(Connection connection) {
        this.connection = connection;
    }

    /**
     * Fills columns in a table.
     */
    @Override
    public void create() {
        String sql = "INSERT INTO users (id, role_id, username, firstname, lastname, dob, password, email) " +
                "VALUES('1','1','admin','Ryan','Gosling','12.11.1980','admin','ryan-admin@gmail.com'), " +
                "('2','2','pavel-user','Pavel','Ivanov','26.04.2000','pavel2604','pasha@gmail.com'), " +
                "('3','2','angelina','Angelina','Novak','02.08.1999','gelyanovak02','novak@gmail.com')," +
                "('4','1','second-admin','Jensen','Ackles','01.03.1978','admin2jensen','jensenackles@gmail.com')," +
                "('5','1','third-admin','Ivan','Kovalov','15.05.2002','admin','kovalov1505@gmail.com')";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Updates table according to sql.
     */
    @Override
    public void update() {
        String sql = "UPDATE users SET password = ? WHERE role_id = 1";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, "admin");
            preparedStatement.executeUpdate();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Removes record from table according to sql.
     */
    @Override
    public void remove() {
        String sql = "DELETE FROM users WHERE username = 'third-admin'";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.executeUpdate();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Selects all users.
     *
     * @return list of users.
     */
    @Override
    public ArrayList<User> findAll() {
        ArrayList<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                int role_id = resultSet.getInt(2);
                String username = resultSet.getString(3);
                String firstname = resultSet.getString(4);
                String lastname = resultSet.getString(5);
                String dateOfBirth = resultSet.getString(6);
                String password = resultSet.getString(7);
                String email = resultSet.getString(8);
               // users.add(new User(id, role_id, username, firstname, lastname, dateOfBirth, password, email));
                User user = new User(id, role_id, username, firstname, lastname, dateOfBirth, password, email);
                users.add(user);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return users;
    }

    @Override
    public List<String> findByUsername(String username) {
        List<String> usernames = new ArrayList<>();
        String sql = "SELECT * FROM users WHERE username= 'admin' "; //НЕ БАГ А ФИЧА
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                username = resultSet.getString(8);
                usernames.add(username);
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
        return usernames;

    }

    /**
     * Finds users with email "admin".
     *
     * @param email emails to find
     * @return users according to email
     */
    @Override
    public List<String> findByEmail(String email) {
        List<String> emails = new ArrayList<>();
        String sql = "SELECT * FROM users WHERE email= 'admin' ";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                email = resultSet.getString(8);
                emails.add(email);
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
        return emails;
    }
}

   /* @Override
    public String toString() {
        return getClass().getSimpleName() + "[id: " + id + " role_id: " + role_id + " username: " + username +
                " firstname: " + firstname + " lastname: " + lastname + " date of birth: " +  dateOfBirth +
                " password: " +  password + " email: " +  email +"]";
    }
*/


