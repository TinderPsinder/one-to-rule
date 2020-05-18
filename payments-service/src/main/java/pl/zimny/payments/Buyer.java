package pl.zimny.payments;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Buyer {

    String email;
    String phone;
    String firstName;
    String lastName;
    //String language;
}
