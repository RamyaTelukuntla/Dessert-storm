package basic2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");

      //  HelloWorld obj = (HelloWorld) context.getBean("seven");

       /* obj.getName();*/

      /*  obj.setMessage("HI");
        obj.getMessage();*/


        Seven s=(Seven) context.getBean("seven");

        s.getMessage();
       context.registerShutdownHook();


    }
}
