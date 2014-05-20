package basic2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by user on 14/5/14.
 */
public class Six {
    public static void main(String[] args)
    {
        ApplicationContext context=new AnnotationConfigApplicationContext("Beans.xml");
        HelloWorld s=(HelloWorld)context.getBean("helloWorld");
        s.getMessage();
    }

}
