package com.eldar.challenge.creditCard.api;

import com.eldar.challenge.creditCard.Brand;
import com.eldar.challenge.creditCard.CreditCardOperationUtils;
import com.eldar.challenge.creditCard.Operation;
import com.eldar.challenge.creditCard.card.VISA;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "operation", produces = "application/JSON", consumes = "application/JSON")
public class OperationController {

    @GetMapping
    public OperationResponse getOperationInfo(@RequestBody OperationRequest request) {
        try {
            final CreditCardOperationUtils utils = new CreditCardOperationUtils();
            final String brandName = request.brand;
            final Double amount = request.amount;

            final Brand brand = utils.getBrandByName(brandName);
            final Double rate = brand.calculateRate();

            return new OperationResponse(HttpStatus.OK, "Request approved", (double) Math.round(rate), brand, amount);

        } catch (final IllegalArgumentException e) {
            return new OperationResponse(HttpStatus.SERVICE_UNAVAILABLE, "Request body format error", 0d, VISA.getInstance(), 0d);
        }
    }
}
