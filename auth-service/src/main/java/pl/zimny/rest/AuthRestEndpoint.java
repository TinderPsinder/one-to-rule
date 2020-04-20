package pl.zimny.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthRestEndpoint {

    //test endpoint
    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello from auth service";
    }
}
