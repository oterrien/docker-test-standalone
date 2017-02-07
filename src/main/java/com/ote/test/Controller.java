package com.ote.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @RequestMapping(method = RequestMethod.GET, value = "/ping")
    public ResponseEntity<String> push() {
        return new ResponseEntity("Service is started", HttpStatus.OK);
    }
}
