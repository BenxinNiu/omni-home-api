package com.ben.omni.omnihomeapi.app.food.controller;

import com.ben.omni.omnihomeapi.app.food.model.MenuItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/menu")
public class MenuController {


    @RequestMapping(value = "/item/{id}", produces = "application/json")
    public MenuItem getMenuItemById(@PathVariable String id) {
        log.info("Getting menu item by id: {}", id);

      return MenuItem.builder()
        .name("Burger")
        .url("/burger")
        .icon("burger.png")
        .description("A delicious burger")
        .build();
    }
}
