package com.example.springbootapp.demo.controllers;

import com.example.springbootapp.demo.mail.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailSender mailSender;

    @RequestMapping("/mail")
    public String mail() {
        mailSender.send("andy.sek94@gmail.com", "SpringBoot", "hey, spring is working!");
        return "Mail sent.";
    }



}
