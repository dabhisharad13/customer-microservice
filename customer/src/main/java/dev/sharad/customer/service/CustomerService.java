package dev.sharad.customer.service;

import dev.sharad.customer.model.Customer;
import dev.sharad.customer.CustomerRegistrationRequest;
import dev.sharad.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder().firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // save customer in the db
        customerRepository.save(customer);
    }
}
