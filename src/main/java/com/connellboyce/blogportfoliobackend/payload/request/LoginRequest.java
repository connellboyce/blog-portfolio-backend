package com.connellboyce.blogportfoliobackend.payload.request;

public class LoginRequest {
    private String username;

    private String password;

    /**
     * Returns the username from the request.
     *
     * @return a String containing the username in the request
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Returns the password from the request.
     *
     * @return a String containing the username in the request
     */
    public String getPassword() {
        return this.password;
    }
}
