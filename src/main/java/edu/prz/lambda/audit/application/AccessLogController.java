package edu.prz.lambda.audit.application;

import edu.prz.lambda.audit.domain.accesslog.AccessLog;
import edu.prz.lambda.audit.domain.accesslog.AccessLogRepository;
import edu.prz.lambda.audit.domain.accesslog.AccessLogService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/access-log")
@RequiredArgsConstructor
public class AccessLogController {

  final AccessLogService service;
  final AccessLogRepository repository;

  @PostMapping
  public ResponseEntity<Void> add(@RequestBody AccessLog entity) {
    service.add(entity);
    return ResponseEntity.noContent().build();
  }

  @GetMapping
  public ResponseEntity<List<AccessLog>> getMany() {
    return ResponseEntity.ok(repository.findAll());
  }

}
