package pl.zimny.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.zimny.payments.PayuResponse;
import pl.zimny.service.PaymentsService;

import java.security.Principal;

@RestController
public class PaymentsRestEndpoint {

    private PaymentsService paymentsService;

    public PaymentsRestEndpoint(PaymentsService paymentsService) {
        this.paymentsService = paymentsService;
    }

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello from payments service";
    }

    @PostMapping(path = "/pay")
    public PayuResponse pay(){
        return paymentsService.sendPayuRequest();
    }

    @GetMapping(path = "/hasPremium")
    public Boolean hasPremium(@RequestParam String username) {
        if (username != null && !username.isEmpty()) {
            return paymentsService.hasPremium(username);
        } else {
            return false;
        }
    }

}
