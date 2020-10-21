package com.vtpknod.api.sns;


import com.vtpknod.api.sns.controller.Sqs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication(exclude = {ContextStackAutoConfiguration.class, ContextRegionProviderAutoConfiguration.class,ContextInstanceDataAutoConfiguration.class})
public class SnsApplication {



    private static final Logger logger = LoggerFactory.getLogger(Sqs.class);




    public static void main(String[] args) {
        SpringApplication.run(SnsApplication.class, args);

    }

}
