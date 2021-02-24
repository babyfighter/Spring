package com.adam.springboot04;

import com.adam.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.sql.DataSource;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Springboot04ApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {
//        简单邮件
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("Hello MailMessage");
        mailMessage.setText("thanks");
        mailMessage.setTo("hailinchen123@outlook.com");
        mailMessage.setFrom("hailinchen123@outlook.com");

        mailSender.send(mailMessage);
    }

    @Test
    void contextLoads1() throws MessagingException {
//        复杂邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
//        组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        helper.setSubject("hello");
        helper.setText("<p style='color:red'>thank you</p>",true);
//        附件
        helper.addAttachment("p1.jpg",new File("localpath"));

        helper.setTo("qq1.com");
        helper.setFrom("qq1.com");
        mailSender.send(mimeMessage);
    }
}
