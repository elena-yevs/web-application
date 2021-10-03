package com.nixsolutions.evsiukova.entity;

/**
 * The user entity that is entered into the table `users`.
 */
public class User {
    /**
     * Unique number of a user.
     */
    private int id;
    /**
     * Id of user`s role.
     */
    private int role_id;
    /**
     * User`s name on the website.
     */
    private String username;
    /**
     * User`s firstname.
     */
    private String firstName;
    /**
     * User`s lastname.
     */
    private String lastName;
    /**
     * User`s date of a birth.
     */
    private String dateOfBirth;
    /**
     * User`s password.
     */
    private String password;
    /**
     * User`s email.
     */
    private String email;

    public User() {
    }

    /**
     * Each user contains 8 parameters.
     *
     * @param id          primary key
     * @param role_id     foreign key
     * @param username    username (login)
     * @param firstname   firstname
     * @param lastname    lastname
     * @param dateOfBirth date of birth
     * @param password    password
     * @param email       email
     */
    public User(int id, int role_id, String username, String firstname, String lastname,
                String dateOfBirth, String password, String email) {
        this.id = id;
        this.role_id = role_id;
        this.username = username;
        this.firstName = firstname;
        this.lastName = lastname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
