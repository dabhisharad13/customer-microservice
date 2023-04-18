package dev.sharad.fraud.controller;

import dev.sharad.fraud.FraudCheckResponse;
import dev.sharad.fraud.service.FraudCheckService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {

    private final FraudCheckService fraudCheckService;
    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {

        boolean isFraudulentCustomer = fraudCheckService.isFradulentCustomer(customerId);

        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
