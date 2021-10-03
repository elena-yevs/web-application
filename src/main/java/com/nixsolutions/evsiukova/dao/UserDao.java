package com.nixsolutions.evsiukova.dao;

import com.nixsolutions.evsiukova.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface UserDao {
    void create();

    void update();

    void remove();

    ArrayList<User> findAll();

    List<String> findByUsername(String username);

    List<String> findByEmail(String email);
}
