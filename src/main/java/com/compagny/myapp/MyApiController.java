package com.compagny.myapp;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApiController {

    @RequestMapping("/api")
    public String index() {
        return "API disponible !";
    }

    // @RequestMapping(value = "/api/items", method = RequestMethod.GET)
    // public List<Item> getItems() {
    //     // récupérer les données de la base de données H2
        
    // }
}
