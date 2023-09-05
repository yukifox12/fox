package com.fox.day17.bean;


import javax.validation.constraints.NotBlank;

public class Teacher {
    private Integer id;
    @NotBlank(message = "姓名不能为空")
    private String name;
    private short level;
    private String career;
    private String intro;
    private String avator;

    public Teacher() {
    }

    public Teacher(Integer id, String name, short level, String career, String intro, String avator) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.career = career;
        this.intro = intro;
        this.avator = avator;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return level
     */
    public short getLevel() {
        return level;
    }

    /**
     * 设置
     * @param level
     */
    public void setLevel(short level) {
        this.level = level;
    }

    /**
     * 获取
     * @return career
     */
    public String getCareer() {
        return career;
    }

    /**
     * 设置
     * @param career
     */
    public void setCareer(String career) {
        this.career = career;
    }

    /**
     * 获取
     * @return intro
     */
    public String getIntro() {
        return intro;
    }

    /**
     * 设置
     * @param intro
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * 获取
     * @return avator
     */
    public String getAvator() {
        return avator;
    }

    /**
     * 设置
     * @param avator
     */
    public void setAvator(String avator) {
        this.avator = avator;
    }

    public String toString() {
        return "Teacher{id = " + id + ", name = " + name + ", level = " + level + ", career = " + career + ", intro = " + intro + ", avator = " + avator + "}";
    }
}
