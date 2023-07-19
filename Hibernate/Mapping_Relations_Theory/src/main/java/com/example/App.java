package com.example;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Laptops l = new Laptops();
        l.setId(101);
        l.setName("Dell");

        students s = new students();
        s.setName("Navin");
        s.setId(1);
        s.setMarks(50);

        // for one to one
        // s.setLaptops(l);

        // for one to many realionship
        // s.getLaptops().add(l);

        // for many to one mapping (without a student_laptots table)
        // l.setStudent(s);

        // for many to many mapping
        l.getStudent().add(s);

        Session session = new Configuration().configure("com/example/hibernate.cfg.xml")
                .addAnnotatedClass(Laptops.class)
                .addAnnotatedClass(students.class)
                .buildSessionFactory()
                .openSession();
        session.beginTransaction();
        session.save(l);
        session.save(s);
        session.getTransaction().commit();

    }
}
