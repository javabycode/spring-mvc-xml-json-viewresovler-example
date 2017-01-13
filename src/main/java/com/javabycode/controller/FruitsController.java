package com.javabycode.controller;

import com.javabycode.model.Fruit;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viewfruit")
public class FruitsController {

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Fruit getFruit(@PathVariable Integer id, ModelMap model) {
        return new Fruit(id, "Orange", "Indonesia");
    }
}
