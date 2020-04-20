package pl.zimny.payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsRestEndpoint {

    //test enpoint
    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello from payments service";
    }

}
