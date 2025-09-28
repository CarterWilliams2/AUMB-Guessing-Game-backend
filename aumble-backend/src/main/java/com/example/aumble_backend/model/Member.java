package com.example.aumble_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String auburnID;
    private String name;
    private String section;
    private int year;
    private String role;

    public Member() {}

    public Member(String auburnID, String name, String section, int year, String role) {
        this.auburnID = auburnID;
        this.name = name;
        this.section = section;
        this.year = year;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getAuburnID() {
        return auburnID;
    }

    public void setAuburnID(String auburnID) {
        this.auburnID = auburnID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}