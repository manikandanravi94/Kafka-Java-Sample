package com.mani.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mani.model.Employee;
import com.mani.util.JsonConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Created by gbs05347 on 28-04-2020.
 */
@Service
public class MessageReaderService {

    @Autowired
    private JsonConverter converter;


    @KafkaListener(topics = "hello-kafka", groupId = "GROUP_ID")
    public void readMessage(String message){
        System.out.println("testing the message reader"+message);
        try {
            Employee employee = converter.getJsonFromString(message,Employee.class);
            System.out.println("Employee object after testing"+employee);
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }
    }
}
