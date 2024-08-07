package com.techie.microservices.notification.service;

import com.techie.microservices.notification.order.OrderPlacedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationService {

 //   private final JavaMailSender javaMailSender;
    private final org.springframework.kafka.core.KafkaTemplate<String, OrderPlacedEvent> kafkaTemplate;
   // @KafkaListener(topics = "order-placed", groupId = "notification-service")
//    public void listen(OrderPlacedEvent orderPlacedEvent){
//        log.info("Got Message from order-placed topic {}", orderPlacedEvent);
//        MimeMessagePreparator messagePreparator = mimeMessage -> {
//            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
//            messageHelper.setFrom("springshop@email.com");
//            messageHelper.setTo(orderPlacedEvent.getEmail());
//            messageHelper.setSubject(String.format("Your Order with OrderNumber %s is placed successfully", orderPlacedEvent.getOrderNumber()));
//            messageHelper.setText(String.format("""
//                            Hi %s,%s
//
//                            Your order with order number %s is now placed successfully.
//
//                            Best Regards
//                            Spring Shop
//                            """,
//                    orderPlacedEvent.getFirstName().toString(),
//                    orderPlacedEvent.getLastName().toString(),
         //           orderPlacedEvent.getOrderNumber()));
//        };
//        try {
//            javaMailSender.send(messagePreparator);
//            log.info("Order Notifcation email sent!!");
//        } catch (MailException e) {
//            log.error("Exception occurred when sending mail", e);
//            throw new RuntimeException("Exception occurred when sending mail to springshop@email.com", e);
//        }
//    }
}