package pl.zimny.payments;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PayuResponse {

    Status status;
    String redirectUri;
    String orderId;
    String extOrderId;
}
