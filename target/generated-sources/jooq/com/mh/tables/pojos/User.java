/*
 * This file is generated by jOOQ.
 */
package com.mh.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String  username;
    private String  password;
    private String  displayname;

    public User() {}

    public User(User value) {
        this.id = value.id;
        this.username = value.username;
        this.password = value.password;
        this.displayname = value.displayname;
    }

    public User(
        Integer id,
        String  username,
        String  password,
        String  displayname
    ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.displayname = displayname;
    }

    /**
     * Getter for <code>website1.user.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>website1.user.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>website1.user.username</code>.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for <code>website1.user.username</code>.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for <code>website1.user.password</code>.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>website1.user.password</code>.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for <code>website1.user.displayname</code>.
     */
    public String getDisplayname() {
        return this.displayname;
    }

    /**
     * Setter for <code>website1.user.displayname</code>.
     */
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(displayname);

        sb.append(")");
        return sb.toString();
    }
}