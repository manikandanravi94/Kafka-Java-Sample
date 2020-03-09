package com.mani;

import com.mani.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.mani.*"})
public class KafkaJavaSampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(KafkaJavaSampleApplication.class, args);
		MessageService messageService=context.getBean(MessageService.class);
		messageService.enqueueMessage();
	}

}
