package Com.springcore.App1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello World!" );
        ApplicationContext ab = new ClassPathXmlApplicationContext("src/main/java/com/spring/Spring-config.xml");
        Students s = (Students) ab.getBean("S1");
        System.out.println(s);
    }
}
