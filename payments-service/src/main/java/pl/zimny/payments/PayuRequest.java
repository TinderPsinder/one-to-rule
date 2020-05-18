package pl.zimny.payments;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PayuRequest {

    //String notifyUrl;
    String customerIp;
    String merchantPosId;
    String description;
    String currencyCode;
    String totalAmount;
    Buyer buyer;
    Settings settings;
    Product[] products;
}
