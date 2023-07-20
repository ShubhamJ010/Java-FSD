package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
    @Id
    private int id;
    private String name;
    private float marks;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return this.marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}
