package com.anderson.email.controllers;

import com.anderson.email.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms-email")
public class EmailController {
    @Autowired
    EmailService emailService;
}
