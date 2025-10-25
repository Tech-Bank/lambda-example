package edu.prz.lambda.audit.application;

import edu.prz.lambda.audit.domain.accesslog.AccessLog;
import edu.prz.lambda.audit.domain.accesslog.AccessLogRepository;
import edu.prz.lambda.audit.domain.accesslog.AccessLogService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("access-log")
@RequiredArgsConstructor
public class AccessLogController {

  final AccessLogService service;
  final AccessLogRepository repository;

  @PostMapping
  public ResponseEntity<Void> add() {
    service.add();
    return ResponseEntity.noContent().build();
  }

  @GetMapping
  public ResponseEntity<List<AccessLog>> getMany() {
    return ResponseEntity.ok(repository.findAll());
  }

}
