package pl.zimny.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.zimny.dao.PaymentsRepository;
import pl.zimny.model.Payment;
import pl.zimny.payments.*;

import java.util.Optional;

@Service
public class PaymentsService {

    @Autowired
    PaymentsRepository paymentsRepository;

    private static final String PAY_URL = "https://secure.snd.payu.com/api/v2_1/orders";
    private final RestTemplate restTemplate;

    public PaymentsService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public PayuResponse sendPayuRequest() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth("d9a4536e-62ba-4f60-8017-6053211d3f47");

        Buyer buyer = new Buyer("jakubzimnyy@gmail.com", "500600700", "Jakub", "Zimny");
        Settings settings = new Settings("true");
        Product[] products = {new Product("premium", "6900", "1")};
        PayuRequest payuRequest = new PayuRequest(
                "127.0.0.1", "300746", "mock request", "PLN", "6900", buyer, settings, products);

        HttpEntity<PayuRequest> entity = new HttpEntity<>(payuRequest, headers);

        return restTemplate.postForObject(PAY_URL, entity, PayuResponse.class);
    }

    public boolean hasPremium(String username) {
        Optional<Payment> paymentOptional = paymentsRepository.findByUsername(username);
        if(paymentOptional.isPresent()) {
            return true;
        }
        else {
            return false;
        }
    }
}