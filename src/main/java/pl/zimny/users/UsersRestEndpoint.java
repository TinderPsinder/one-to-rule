package pl.zimny.users;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zimny.service.UsersService;

@RestController
@RequiredArgsConstructor
public class UsersRestEndpoint {

    private final UsersService usersService;

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello from users service";
    }


    @PostMapping(path ="/register")
    public HttpStatus registerUser() {
        return usersService.registerUser();
    }

    @PostMapping(path = "/report")
    public HttpStatus reportUser(){
        return usersService.reportUser();
    }

    // only for admins
    @PostMapping(path = "/mischief")
    public HttpStatus confirmMischief(){
        return usersService.confirmMischief();
    }

}
