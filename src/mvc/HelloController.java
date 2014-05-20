package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created by user on 20/5/14.
 */
@Controller
public class HelloController {
  @RequestMapping("/hello")
    public ModelAndView helloworld()
  {
        String message="WELCOME";
      return new ModelAndView("hellopage","message",message);
  }

}
