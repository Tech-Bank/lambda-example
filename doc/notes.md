# Notes

## Build

set JAVA_HOME=C:\Program Files\Java\jdk-21
mvn clean package -DskipTests

## Compose

podman compose up --build
podman compose down -v

## Podman

podman exec -it cassandra-db bash

## Cassandra

CREATE KEYSPACE IF NOT EXISTS lambda_keyspace WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};
