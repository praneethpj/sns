package com.vtpknod.api.sns.controller;


import com.vtpknod.api.sns.SnsApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sqs {




    private static final Logger logger = LoggerFactory.getLogger(Sqs.class);



    @SqsListener("queueforsnsp")
    private void loadMessageFromSQS(String message){
        logger.info(message);

    }

}
