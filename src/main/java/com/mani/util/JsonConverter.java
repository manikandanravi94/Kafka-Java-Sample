package com.mani.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

/**
 * Created by gbs05347 on 28-04-2020.
 */
@Component
public class JsonConverter {


    public <T> T getJsonFromString(String message, Class<T> type) throws JsonProcessingException {
       return new ObjectMapper().readValue(message,type);
    }
}
