package Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "Bean2.xml");
        Students s = ac.getBean("students", Students.class);
        System.out.println(s.getCousrList().getClass().getName());
    }

}
