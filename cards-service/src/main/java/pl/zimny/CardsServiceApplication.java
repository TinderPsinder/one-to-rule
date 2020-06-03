package pl.zimny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "pl.zimny")
public class CardsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsServiceApplication.class, args);
    }
}
