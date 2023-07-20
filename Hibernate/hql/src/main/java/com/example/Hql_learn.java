package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

public class Hql_learn {

    public static void main(String[] args) {
        Session session = new Configuration().configure("com/example/hibernate.cfg.xml")
                .addAnnotatedClass(Students.class)
                .buildSessionFactory()
                .openSession();

        session.beginTransaction();
        Query q = session.createQuery("select count(*) from Students");
        // List<Students> ll = q.list();

        // for Fetching particaulr column
        // 7
        // 36.0
        // Object[] obj = (Object[]) q.uniqueResult();
        // for (Object object : obj) {
        // System.out.println(object);
        // }

        // // For entire table
        // List<Object[]> students = (List<Object[]>) q.list();
        // for (Object[] student : students)
        // System.out.println(student[0] + ":" + student[1]);

        // for agergator function// sum //count(*)
        Object marks = (Object) q.uniqueResult();
        System.out.println(marks);

        // for unique result
        // Students [id=7, name=name7, marks=36.0]
        // Students ll = (Students) q.uniqueResult();
        // System.out.println(ll);

        // for (Students students : ll) {
        // System.out.println(students);
        // }
        session.getTransaction().commit();
    }
}
