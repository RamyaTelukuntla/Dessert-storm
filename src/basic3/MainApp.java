package basic3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by user on 15/5/14.
 */
public class MainApp {

    public static void main(String[] args)
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
