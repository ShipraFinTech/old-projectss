package com.org.web.controller;

import com.org.DAO.userDao;
import com.org.beans.User;
import com.org.classes.UserCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.org.service.UserService;

import java.util.ArrayList;
import java.util.List;



@Controller
@RequestMapping("/login")
public class HelloController {

    userDao userDao;

    @Autowired
    private UserService userService;


    //    @Autowired
//    public Hello(UserService userService1) {
//        this.userService = userService;
//    }
    @RequestMapping("/")
    public String helloWorld() {
        return "hello";
    }

    @RequestMapping("/login")
    public ModelAndView sign() {
        return new ModelAndView("index");
    }

//    @RequestMapping("/save")
//    public ModelAndView save(@ModelAttribute("user") User user) {
//        System.out.print("========" + user.getUsername() + "=============" + user.getPassword());
//        List<User> userList = new ArrayList<User>();
//        userList.add(new User(user.getUsername(), user.getPassword()));
////        userList.add(new User("shaly", "1234"));
////        userList.add(new User("shipra", "1234"));
//        userDao.save(user);
//        return new ModelAndView("view", "userList", userList);
//    }

    @RequestMapping("/save")
    public ModelAndView save(UserCommand userCommand) {
        System.out.print("========" + userCommand.getUsername() + "=============" + userCommand.getPassword());
        List<User> userList = new ArrayList<User>();
        System.out.print("==============USER COMMAND=====" + userCommand.getUsername());
        userService.create(userCommand);
        return new ModelAndView("view", "userList", userList);
    }
}
