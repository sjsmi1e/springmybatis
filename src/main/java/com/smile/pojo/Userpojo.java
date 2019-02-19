package com.smile.pojo;

/**
 * @program: springmybatis
 * @description: ${description}
 * @author: smile丶
 * @create: 2019-01-29 19:27
 **/
public class Userpojo {
    private int id;
    private String userName;
    private String passWord;
    private String photo;

    public Userpojo() {
    }

    public Userpojo(int id, String userName, String passWord, String photo) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Userpojo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
