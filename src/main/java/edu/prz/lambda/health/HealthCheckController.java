package edu.prz.lambda.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

  @GetMapping
  public String getHealthStatus(){
    return "Application is UP and READY";
  }

}
