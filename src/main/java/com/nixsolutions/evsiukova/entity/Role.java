package com.nixsolutions.evsiukova.entity;

/**
 * The role entity that is entered into the table `roles`.
 */
public class Role {
    /**
     * Unique number of a role.
     */
    public int id;
    /**
     * Role name.
     */
    public String roleName;

    /**
     * Role has a unique number and a name.
     *
     * @param id       primary key
     * @param roleName role name
     */
    public Role(int id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public Role() {
    }
}
