package edu.prz.lambda.audit.domain.accesslog;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Data;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("access_log")
@Data
public class AccessLog {

  @PrimaryKeyColumn(name = "id", type = PrimaryKeyType.PARTITIONED)
  UUID id;

  Long customerId;
  LocalDateTime accessTime;

  public AccessLog() {
    this.id = UUID.randomUUID();
  }
}
