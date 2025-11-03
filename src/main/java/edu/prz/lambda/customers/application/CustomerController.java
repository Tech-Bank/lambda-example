package edu.prz.lambda.customers.application;

import edu.prz.lambda.customers.domain.customer.Customer;
import edu.prz.lambda.customers.domain.customer.CustomerRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

  final CustomerRepository repository;

  @PostMapping
  public Customer add(@RequestBody Customer customer) {
    return repository.save(customer);
  }

  @GetMapping
  public List<Customer> getMany() {
    return repository.findAll();
  }

}
