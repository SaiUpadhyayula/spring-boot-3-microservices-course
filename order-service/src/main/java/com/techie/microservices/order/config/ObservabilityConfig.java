//package com.techie.microservices.order.config;
//
//import io.micrometer.observation.ObservationRegistry;
//import io.micrometer.observation.aop.ObservedAspect;
//import jakarta.annotation.PostConstruct;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//@RequiredArgsConstructor
//public class ObservabilityConfig {
//
////    private final KafkaTemplate kafkaTemplate;
//
//    @PostConstruct
//    public void setObservationForKafkaTemplate() {
//        kafkaTemplate.setObservationEnabled(true);
//    }
//
//    @Bean
//    ObservedAspect observedAspect(ObservationRegistry registry) {
//        return new ObservedAspect(registry);
//    }
//}
