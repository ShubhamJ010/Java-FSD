package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
// import javax.persistence.OneToMany;

@Entity
public class students {
    @Id
    private int id;
    private String name;
    private float marks;

    // @OneToOne
    // private Laptops laptops;

    // @OneToMany(mappedBy = "student") // mapped(1)
    // private List<Laptops> laptops = new ArrayList<>();

    @ManyToMany(mappedBy = "student") // mapped(1)
    private List<Laptops> laptops = new ArrayList<>();

    
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
    
    public float getMarks() {
        return this.marks;
    }
    
    public void setMarks(float marks) {
        this.marks = marks;
    }
    
    public List<Laptops> getLaptops() {
    return this.laptops;
    }

    public void setLaptops(List<Laptops> laptops) {
    this.laptops = laptops;
    }
}
