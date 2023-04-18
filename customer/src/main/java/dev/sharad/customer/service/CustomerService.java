package dev.sharad.customer.service;

import dev.sharad.customer.CustomerRegistrationRequest;
import dev.sharad.customer.model.Customer;
import dev.sharad.customer.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder().firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // save customer in the db
        customerRepository.save(customer);
    }
}
