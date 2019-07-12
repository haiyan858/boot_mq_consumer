package com.atguigu.boot.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-07-12 14:24
 */

@Component
public class Queue_Consumer {

    @JmsListener(destination = "${myqueue}") //消息监听
    public void receive(TextMessage textMessage) throws JMSException {
        System.out.println("消费者收到消息："+textMessage.getText());
    }

}
