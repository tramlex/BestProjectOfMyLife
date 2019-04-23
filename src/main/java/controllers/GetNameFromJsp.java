package controllers;

import database.entities.UsersEntity;
import database.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GetNameFromJsp {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/GetNameFromJsp", method = RequestMethod.GET)
    protected String saveUser(@RequestParam(name = "name") String name, @RequestParam(name = "sname") String sname, @RequestParam(name = "fname") String fname) {
        userService.saveUser(name, sname, fname);
        return "redirect:name.jsp";

    }
}
