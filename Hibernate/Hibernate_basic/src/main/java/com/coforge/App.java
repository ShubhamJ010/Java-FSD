package com.coforge;

import org.hibernate.Session;
// import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
// import org.hibernate.service.ServiceRegistry;
import org.hibernate.Transaction;
// import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {
    public static void main(String[] args) {
        // Object value
        Alien telusko = new Alien();
        telusko.setAid(104);
        telusko.setAname("Shouen");
        telusko.setColor("blue");

        // Establish a connection (Better)
        // Configuration cf = new Configuration()
        // .configure("com/coforge/hibernate.cfg.xml").addAnnotatedClass(Alien.class);
        // ServiceRegistry serviceRegistry = new
        // StandardServiceRegistryBuilder().applySettings(cf.getProperties())
        // .build();
        // SessionFactory sf = cf.buildSessionFactory(serviceRegistry);
        // Session session = sf.openSession();

        // Establish a connection (Better)
        Session session = new Configuration().configure("com/coforge/hibernate.cfg.xml").addAnnotatedClass(Alien.class)
                .buildSessionFactory()
                .openSession();

        // ADD the value
        Transaction tx = session.beginTransaction();
        session.save(telusko);
        tx.commit();

        // Get the value
        System.out.println((Alien) session.get(Alien.class, 104));

    }
}
