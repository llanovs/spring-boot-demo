package com.spring.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private  String id;
    private String name;
    private String descriprion;

    @ManyToOne
    private Topic topic;

    public Course(String id, String name, String descriprion, String topicId) {
        this.id = id;
        this.name = name;
        this.descriprion = descriprion;
        this.topic = new Topic(topicId, "", "");
    }

    public Course() {

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

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Topic getTopic() {
        return topic;
    }
}
