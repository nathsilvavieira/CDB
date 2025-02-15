package com.api.corridadasblogueiras.model;

import jakarta.persistence.*;



@Entity
@Table(name="users")
public class UserModel {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name",nullable = false, length = 100)
    private String name;

    @Column(name = "season")
    private int season;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "age")
    private int age;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeason() {
        return season;
    }

    public String getStatus() {
        return status;
    }

    public int getAge() {
        return age;
    }
    public void setSeason(int season) {
        this.season = season;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
