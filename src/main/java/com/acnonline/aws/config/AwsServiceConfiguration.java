package com.acnonline.aws.config;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sqs.AmazonSQS;
import org.springframework.cloud.aws.core.env.ResourceIdResolver;
import org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplate;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Aranga on 24/04/2016.
 */
@Configuration
public class AwsServiceConfiguration
{

    @Bean
    public QueueMessagingTemplate queueMessagingTemplate(AmazonSQS amazonSqs, ResourceIdResolver resourceIdResolver)
    {

        return new QueueMessagingTemplate(amazonSqs, resourceIdResolver);
    }

    @Bean
    public NotificationMessagingTemplate notificationMessagingTemplate(AmazonSNS amazonSNS, ResourceIdResolver resourceIdResolver) {
        return new NotificationMessagingTemplate(amazonSNS, resourceIdResolver);
    }
}
