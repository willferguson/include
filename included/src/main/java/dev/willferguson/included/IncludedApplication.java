package dev.willferguson.included;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IncludedApplication {

    public static void main(String[] args) {
        SpringApplication.run(IncludedApplication.class, args);
    }

    @RestController
    public class IncludedController {

        @GetMapping("/test/{name}")
        public String test(@PathVariable("name") String name) throws InterruptedException {
            Thread.sleep(2500);
            return "hello " + name;
        }
    }
}
