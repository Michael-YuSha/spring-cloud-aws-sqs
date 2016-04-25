package com.acnonline.aws.service;

import com.acnonline.aws.model.Message;
import org.springframework.stereotype.Service;

/**
 * Created by Aranga on 24/04/2016.
 */

public interface MessageService
{
    void save(Message message);
}
