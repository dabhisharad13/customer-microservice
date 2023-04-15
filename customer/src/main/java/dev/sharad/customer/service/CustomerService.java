package dev.sharad.customer.service;

import dev.sharad.customer.Customer;
import dev.sharad.customer.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public record CustomerService() {

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder().firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
    }
}
