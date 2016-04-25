package com.acnonline.aws.service;

import com.acnonline.aws.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Service;

/**
 * Created by Aranga on 24/04/2016.
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService
{
    //will be injected by framework
    @Value("${cloud.aws.sqs.messageQueue}")
    private String queueName;



    @Autowired
    private QueueMessagingTemplate queue;

    @Override
    public void save(Message message)
    {
        queue.convertAndSend(queueName,message);


    }

    /**
     * need to be the value reference for di to work
     * i.e cannot replace with the string variable
     * @param message
     * @param approximateFirstReceiveTimestamp
     */
    @MessageMapping("${cloud.aws.sqs.messageQueue}")
    private void subscriber(Message message, @Header("ApproximateFirstReceiveTimestamp") String approximateFirstReceiveTimestamp)
    {
        System.out.println("TEST:"+message.getMessageId());
        //or save to repository
    }
}
