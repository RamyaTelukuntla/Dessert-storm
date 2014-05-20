package basic5;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 16/5/14.
 */
public class MainApplication {

    public static void main(String[] args)
    {
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");

        context.start();
        HelloWorld obj=(HelloWorld)context.getBean("helloworld");
        obj.getMessage();
        context.stop();
        obj.getMessage();
    }
}
