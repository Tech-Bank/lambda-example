package edu.prz.lambda.audit.domain.accesslog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessLogRepository extends JpaRepository<AccessLog, Long> {

}
