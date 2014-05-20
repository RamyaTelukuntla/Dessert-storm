package basic4;

import org.springframework.context.annotation.Bean;

/**
 * Created by user on 15/5/14.
 */
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld()
    {
        return new HelloWorld();

    }
}
