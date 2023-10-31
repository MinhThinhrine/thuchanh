package vn.edu.hcmuaf.bean;

public class User {
    String username;
    String fullname;

    public User(String username, String fullname) {
        this.username = username;
        this.fullname = fullname;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
