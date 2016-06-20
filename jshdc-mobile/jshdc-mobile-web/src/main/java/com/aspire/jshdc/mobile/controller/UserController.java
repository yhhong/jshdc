package com.aspire.jshdc.mobile.controller;

import com.aspire.jshdc.mobile.domain.UserDomain;
import com.aspire.jshdc.mobile.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView getIndex() {
        ModelAndView mav = new ModelAndView("index");
        UserDomain user = userService.selectUserById(1);
        mav.addObject("user", user);
        return mav;
    }
}