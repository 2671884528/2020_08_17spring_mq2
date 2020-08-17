package com.gyg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @auther 郭永钢
 * @data 2020/8/17 21:29
 * @desc:
 */
@Service
public class SpringMQCustomer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringMQCustomer springMQCustomer = (SpringMQCustomer) context.getBean("springMQCustomer");
        String str = (String) springMQCustomer.jmsTemplate.receiveAndConvert();
        System.out.println(str);
    }
}
