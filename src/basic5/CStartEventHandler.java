package basic5;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Created by user on 16/5/14.
 */
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent>{

    public void onApplicationEvent(ContextStartedEvent event)
    {
        System.out.print("context event started");
    }



}
