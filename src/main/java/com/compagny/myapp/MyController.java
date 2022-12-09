package com.compagny.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }

    // @RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
    // @ResponseBody
    // public User getUser(@PathVariable("id") Long userId) {
    // // Récupère et retourne l'utilisateur avec l'identifiant spécifié.
    // }

}