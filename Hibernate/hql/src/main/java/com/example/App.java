package com.example;

import java.util.Random;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Session session = new Configuration().configure("com/example/hibernate.cfg.xml")
                .addAnnotatedClass(Students.class)
                .buildSessionFactory()
                .openSession();

        session.beginTransaction();
        Random r = new Random();

        for (int i = 1; i <= 50; i++) {
            Students s = new Students();
            s.setId(i);
            s.setName("name" + i);
            s.setMarks(r.nextInt(100));
            session.save(s);
        }
        session.getTransaction().commit();
    }
}
