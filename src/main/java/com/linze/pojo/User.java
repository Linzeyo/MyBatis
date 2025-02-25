package com.linze.pojo;

public class User {
    int uid;
    String uname;
    int uage;
//    public User() {
//    }
//    public User(int uid, String uname, String uage) {
//        this.uid = uid;
//        this.uname = uname;
//        this.uage = uage;
//    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public int getUage() {
        return uage;
    }
    public void setUage(int uage) {
        this.uage = uage;
    }
    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                '}';
    }
}
