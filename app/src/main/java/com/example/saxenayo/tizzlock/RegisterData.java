package com.example.saxenayo.tizzlock;

/**
 * Created by SaxenaYo on 4/15/2016.
 */
public class RegisterData {
    int id;
    String name;
    String username;
    String password;
    String emailid;
    String tizzkey;

    RegisterData ()
    {

    }

    public RegisterData(int id, String tizzkey, String emailid, String password, String username, String name) {
        this.id = id;
        this.tizzkey = tizzkey;
        this.emailid = emailid;
        this.password = password;
        this.username = username;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getTizzkey() {
        return tizzkey;
    }

    public void setTizzkey(String tizzkey) {
        this.tizzkey = tizzkey;
    }
}