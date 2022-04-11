package com.demo.helloworldapp.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldResource {

    private final Logger log = LoggerFactory.getLogger(HelloWorldResource.class);

    @GetMapping
    ResponseEntity<?> getHello(){
        log.info("getHello() called at :" + LocalDateTime.now());
        return ResponseEntity.ok().body("Hello from hello-world-application !!!!!!!!!!");
    }
}
