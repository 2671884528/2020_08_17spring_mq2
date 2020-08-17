package com.gyg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.TextMessage;

/**
 * @auther 郭永钢
 * @data 2020/8/17 17:04
 * @desc:
 */
@Service
public class SpringMQProduct {

    @Autowired
    private JmsTemplate jmsTemplate;

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringMQProduct springMQProduct = (SpringMQProduct) context.getBean("springMQProduct");
        springMQProduct.jmsTemplate.send(session -> {
            TextMessage message = session.createTextMessage("消息队列-spring整合");
            return message;
        });
        System.out.println("$$$$$$$$$$$$$$");
    }
}
