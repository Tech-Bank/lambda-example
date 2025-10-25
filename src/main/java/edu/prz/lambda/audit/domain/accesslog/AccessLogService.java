package edu.prz.lambda.audit.domain.accesslog;

import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccessLogService {

  final AccessLogRepository repository;

  public void add() {
    AccessLog accessLog = new AccessLog();
    accessLog.setAccessTime(LocalDateTime.now());
    repository.save(accessLog);
  }

}
