package pl.zimny.payments;

import lombok.*;

import java.io.Serializable;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Status implements Serializable {

    String statusCode;
}