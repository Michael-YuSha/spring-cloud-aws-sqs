package com.acnonline.aws.service;

import com.acnonline.aws.model.Message;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * Created by Aranga on 24/04/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageServiceTest
{

    @Rule
    public OutputCapture capture = new OutputCapture();

    @Autowired
    private MessageService messageService;
    @Test
    public void testPublish() throws InterruptedException {
        final Message m = new Message();
        m.setMessageId(100);
        messageService.save(m);
        //give time to picked up by consumer
        Thread.sleep(200);
        String out= capture.toString();
        assertTrue("check message output is coming up",out.indexOf("TEST:100") != -1);

    }
}