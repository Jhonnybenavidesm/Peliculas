package com.example.asus_pc.peliculas.Login.model;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class Login {
    private boolean searchUser;
    private Integer id;
    private String user;
    private String password;
    private String name;
    private String email;
    private String img_user;

    public boolean isSearchUser() {
        return searchUser;
    }

    public void setSearchUser(boolean searchUser) {
        this.searchUser = searchUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImg_user() {
        return img_user;
    }

    public void setImg_user(String img_user) {
        this.img_user = img_user;
    }
}
