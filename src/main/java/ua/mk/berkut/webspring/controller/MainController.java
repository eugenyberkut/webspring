package ua.mk.berkut.webspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.mk.berkut.webspring.beans.Person;

/**
 * Created by Eugeny on 05.10.2016.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        Person person = new Person("Иванов", 25);
        return new ModelAndView("index").addObject("person", person);
    }

    @RequestMapping(value = "/qwe")
    public ModelAndView second(@RequestParam(name = "username") String name, @RequestParam(name = "userage")int age) {
        return new ModelAndView("second").addObject("person", new Person(name, age));
    }

    @RequestMapping(value = "/asd")
    public String method() {
        return "another";
    }
}
