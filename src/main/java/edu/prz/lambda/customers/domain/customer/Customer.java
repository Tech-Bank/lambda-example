package edu.prz.lambda.customers.domain.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "customers")
@Data
public class Customer {

  @Id
  @GeneratedValue
  Long id;

  String firstName;
  String lastName;
  String email;

}
