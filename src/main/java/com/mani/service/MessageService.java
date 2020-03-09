package com.mani.service;

import com.mani.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by gbs05347 on 09-03-2020.
 */
@Service
public class MessageService {


    private static final String TOPIC_NAME = "hello-kafka";

    // This is for normal message enqueue, not pushing any specific object type
//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, Employee> kafkaTemplate;

    public void enqueueMessage(){
        kafkaTemplate.send(TOPIC_NAME,new Employee("Manikandan","Ravi","software Developer"));
        System.out.println("message posted successfully");
    }
}
