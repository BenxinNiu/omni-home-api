package com.ben.omni.omnihomeapi.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = "/world", method = RequestMethod.GET, produces = "application/json")
    public String hello() {
        log.info("Hello World");
        return "Hello World";
    }
}
