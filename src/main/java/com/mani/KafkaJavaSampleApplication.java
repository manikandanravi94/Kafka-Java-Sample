package com.mani;

import com.mani.service.MessageWriterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.mani.*"})
public class KafkaJavaSampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(KafkaJavaSampleApplication.class, args);
		MessageWriterService messageWriterService =context.getBean(MessageWriterService.class);
		messageWriterService.enqueueMessage();
	}

}
