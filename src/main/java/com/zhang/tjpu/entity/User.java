package com.zhang.tjpu.entity;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Integer signState;
    private String signTime;

    public User() {
    }
    public User(Integer id, String name, Integer age, Integer signState, String signTime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.signState = signState;
        this.signTime = signTime;

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSignState() {
        return signState;
    }

    public void setSignState(Integer signState) {
        this.signState = signState;
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime;
    }
}
