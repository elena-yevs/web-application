package com.nixsolutions.evsiukova.dao;

import com.nixsolutions.evsiukova.dataManipulation.RoleManipulation;
import com.nixsolutions.evsiukova.entity.Role;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface RoleDao {
    void create();
    void update();
    void remove();
    List<Role> findByRoleName(String roleName);
}
