docker pull mongo:7.0.5
docker pull mysql:8.3.0
docker pull confluentinc/cp-zookeeper:7.5.0
docker pull confluentinc/cp-kafka:7.5.0
docker pull confluentinc/cp-schema-registry:7.5.0
docker pull provectuslabs/kafka-ui:latest
docker pull mysql:8
docker pull quay.io/keycloak/keycloak:24.0.1
docker pull grafana/loki:main
docker pull prom/prometheus:v2.46.0
docker pull grafana/tempo:2.2.2
docker pull grafana/grafana:10.1.0
docker pull saiupadhyayula007/new-api-gateway:latest
docker pull saiupadhyayula007/new-product-service:latest
docker pull saiupadhyayula007/new-order-service:latest
docker pull saiupadhyayula007/new-inventory-service:latest
docker pull saiupadhyayula007/new-notification-service:latest

kind load docker-image -n microservices mongo:7.0.5
kind load docker-image -n microservices mysql:8.3.0
kind load docker-image -n microservices confluentinc/cp-zookeeper:7.5.0
kind load docker-image -n microservices confluentinc/cp-kafka:7.5.0
kind load docker-image -n microservices confluentinc/cp-schema-registry:7.5.0
kind load docker-image -n microservices provectuslabs/kafka-ui:latest
kind load docker-image -n microservices mysql:8
kind load docker-image -n microservices quay.io/keycloak/keycloak:24.0.1
kind load docker-image -n microservices grafana/loki:main
kind load docker-image -n microservices prom/prometheus:v2.46.0
kind load docker-image -n microservices grafana/tempo:2.2.2
kind load docker-image -n microservices grafana/grafana:10.1.0
kind load docker-image -n microservices saiupadhyayula007/new-api-gateway:latest
kind load docker-image -n microservices saiupadhyayula007/new-product-service:latest
kind load docker-image -n microservices saiupadhyayula007/new-order-service:latest
kind load docker-image -n microservices saiupadhyayula007/new-inventory-service:latest
kind load docker-image -n microservices saiupadhyayula007/new-notification-service:latest
