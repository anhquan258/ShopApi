package com.example.shopapi.payload;

import com.example.shopapi.Model.User;

public class LoginMesage {
    String message;
    Boolean status;
    User user;

    public LoginMesage(String message, Boolean status, User user) {
        this.message = message;
        this.status = status;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LoginMesage(String message, Boolean status) {
        this.message = message;
        this.status = status;
        this.user = getUser();
    }
}
