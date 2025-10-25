package edu.prz.lambda.audit.domain.accesslog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Data
public class AccessLog {

  @Id
  @GeneratedValue
  Long id;

  LocalDateTime accessTime;

}
