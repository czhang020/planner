package com.upenn.wics.planner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {

    private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

    @RequestMapping(method = RequestMethod.GET)
    public String getHello(@RequestParam(required = false) String name, ModelMap model) {
        model.addAttribute("name", (name != null ? name : "friend") + "!");
        model.addAttribute("tasks", tasks);

        return "hello";
    }
}
