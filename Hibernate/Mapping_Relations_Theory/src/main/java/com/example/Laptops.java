package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Laptops {
    @Id
    private int id;
    private String name;

    // @ManyToOne
    // private students student;// Mapped by this student(1)

    @ManyToMany
    private List<students> student = new ArrayList<>();

    public List<students> getStudent() {
    return student;
    }

    public void setStudent(List<students> student) {
    this.student = student;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public students getStudent() {
    //     return student;
    // }

    // public void setStudent(students student) {
    //     this.student = student;
    // }

}
