package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by online09 on 10/19/2017.
 */

@Controller
public class TestController {

    @RequestMapping(value = "/testPage", method = RequestMethod.GET)
    public String printTestPage(ModelMap model) {
        model.addAttribute("Message", "This is Rahul Johny + +++++");

        return "testPage";
    }

}
