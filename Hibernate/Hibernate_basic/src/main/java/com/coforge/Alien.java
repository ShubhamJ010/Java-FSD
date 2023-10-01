package com.coforge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

    @Id
    private int aid;
    private String aname;
    private String color;

    @Override
    public String toString() {
        return "{" +
                " aid='" + getAid() + "'" +
                ", aname='" + getAname() + "'" +
                ", color='" + getColor() + "'" +
                "}";
    }

    public int getAid() {
        return this.aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {

        return this.aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
