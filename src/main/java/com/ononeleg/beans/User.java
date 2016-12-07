package com.ononeleg.beans;

/**
 * Created by ilya on 07/12/2016.
 */
public class User {

        private UserType type;
        private String usenrame;
        private String password;


    public User(UserType type, String usenrame, String password) {
        this.type = type;
        this.usenrame = usenrame;
        this.password = password;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getUsenrame() {
        return usenrame;
    }

    public void setUsenrame(String usenrame) {
        this.usenrame = usenrame;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
