package basic4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by user on 15/5/14.
 */
public class MainApp {
    public static void main(String[] args)
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld=context.getBean(HelloWorld.class);
        helloWorld.setMessage("hie");
        helloWorld.getMessage();
}
}