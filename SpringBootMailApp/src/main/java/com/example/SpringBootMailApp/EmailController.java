package com.example.SpringBootMailApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmailController {

    @Autowired
    EmailService emailService;

    @GetMapping("/sendEmail")
    public String sendEmail() {
        return emailService.sendEmail();
    }


}