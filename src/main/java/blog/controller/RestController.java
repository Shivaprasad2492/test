package blog.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/api/")
    public String hello() {
        return "hello";
    }
}

