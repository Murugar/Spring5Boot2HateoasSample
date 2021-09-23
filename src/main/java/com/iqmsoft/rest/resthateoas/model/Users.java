package com.iqmsoft.rest.resthateoas.model;

import org.springframework.hateoas.RepresentationModel;


public class Users extends RepresentationModel {

    private String name;
    private Long salary;

    public Users(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}

