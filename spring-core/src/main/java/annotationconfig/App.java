package annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ab = new AnnotationConfigApplicationContext(Javaconfig.class);
        Student s = ab.getBean("S", Student.class);
        System.out.println(s);
    }
}
