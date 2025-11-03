package edu.prz.lambda.audit.domain.accesslog;

import java.util.UUID;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface AccessLogRepository extends CassandraRepository<AccessLog, UUID> {

}
