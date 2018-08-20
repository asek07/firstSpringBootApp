package com.example.springbootapp.demo.mail;


import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class MockMailSenderImpl implements MailSender {

    private static Log log = LogFactory.getLog(MockMailSenderImpl.class);

    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending MOCK Mail to " + to);
        log.info("with subject " + subject);
        log.info("and body " + body);
    }
}
