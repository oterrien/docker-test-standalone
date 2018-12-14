package com.ote.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @GetMapping(value = "/ping")
    public String ping() {
        return "Service is started";
    }
}
