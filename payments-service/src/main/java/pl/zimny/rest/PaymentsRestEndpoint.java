package pl.zimny.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zimny.service.PaymentsService;

@RestController
@RequiredArgsConstructor
public class PaymentsRestEndpoint {

    private final PaymentsService paymentsService;

    //test enpoint
    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello from payments service";
    }

}
