package com.example.SpringBootMailApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    JavaMailSender javaMailSender;

    public String sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();

        // put here your email id
        message.setFrom("######@gmail.com");
        // receiver mail id
        message.setTo("yyyyy@gmail.com");
        message.setSubject("SpringBoot Mail Service Testing");
        message.setText("Hi Dear , This is testing mail only ");

        javaMailSender.send(message);

        return "Mail sent successfully";
    }

}
