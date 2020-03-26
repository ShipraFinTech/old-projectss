package web.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by shipra on 29/12/17.
 */
@Controller
public class Hello {

    @RequestMapping(value = "/", method = GET)
    public String home() {
        return "home";
    }
}
