package com.knod.sns.demo.controller;


import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.SubscribeRequest;
import com.knod.sns.demo.constants.ReqKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Subscriptions {


    @Autowired
    private AmazonSNSClient snsClient;

    @GetMapping("/addSubscriptions/{email}")
    public String addSubcription(@PathVariable String email){
        SubscribeRequest request=new SubscribeRequest(ReqKeys.Topic_ARN,"email",email);
        snsClient.subscribe(request);

        return "Subscribe request is pending. To confirm the Subscription, check your email : "+email;
    }

    @RequestMapping("/sendNotifications")
    public String publishMessageToTopic(){
        PublishRequest publishRequest = new PublishRequest(ReqKeys.Topic_ARN,buildEmailBody(),"sb first msg");
        snsClient.publish(publishRequest);
        return "Notification send Successfully";

    }


    private String buildEmailBody(){
        return "Dear All this is my first message boddy";
    }

}
