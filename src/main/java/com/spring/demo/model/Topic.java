package com.spring.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private  String id;
    private String name;
    private String descriprion;

    public Topic(String id, String name, String descriprion) {
        this.id = id;
        this.name = name;
        this.descriprion = descriprion;
    }

    public Topic() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }
}
