package com.acnonline.aws.controller;

import com.acnonline.aws.model.Message;
import com.acnonline.aws.service.MessageService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Aranga on 24/04/2016.
 */
@RestController
public class PublishController
{
    @Autowired
    private MessageService messageService;

    @RequestMapping("/")
    public Message save()
    {
        final Message m = new Message();
        m.setMessageId(new Date().getTime());
        m.setMessage(" HELLO UUID:"+ UUID.randomUUID().toString());
        messageService.save(m);

        return m;
    }

}
