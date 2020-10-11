package dev.willferguson.including;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IncludingApplication {

    public static void main(String[] args) {
        SpringApplication.run(IncludingApplication.class, args);
    }

    @Controller()
    public class JSPController {

        @GetMapping("/")
        public String hello(ModelMap model) {
            model.put("name", "hello");
            return "ssi";
        }
    }

    @Controller()
    public class JSTLController {

        @GetMapping("/jstl")
        public String hello(ModelMap model) {
            model.put("name", "hello");
            return "jstl";
        }
    }

}



