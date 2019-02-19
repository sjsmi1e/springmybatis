package com.smile.pojo;

/**
 * @program: springmybatis
 * @description: ${description}
 * @author: smile丶
 * @create: 2019-02-11 15:00
 **/
public class Imgpojo {
    private int id;
    private String path;

    public Imgpojo() {
    }

    public Imgpojo(int id, String path) {
        this.id = id;
        this.path = path;
    }

    @Override
    public String toString() {
        return "Imgpojo{" +
                "id=" + id +
                ", path='" + path + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
