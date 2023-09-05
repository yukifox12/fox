package com.fox.day17.bean;

import java.util.List;

public class Dep {
    private int id;
    private String name;


    public Dep() {
    }

    public Dep(int id, String name) {
        this.id = id;
        this.name = name;
    }


    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Dep{id = " + id + ", name = " + name + "}";
    }
}
