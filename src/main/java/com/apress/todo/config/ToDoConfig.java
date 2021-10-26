package com.apress.todo.config;

import com.apress.todo.domain.ToDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.handler.LoggingHandler;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

@Configuration
public class ToDoConfig {

//    @Bean
//    public ApplicationRunner runner(MessageChannel input){
//        return args -> {
//            input.send(
//            MessageBuilder
//                  .withPayload(new ToDo("buy milk today",true))
//                  .build());
//        };
//    }

    
// You can uncomment this section if you comment out the section @MessageEndpoint class SimpleServiceActivator in ToDoIntegration.java
    @Bean
    @ServiceActivator(inputChannel = "toLog")
    public LoggingHandler logging() {
        LoggingHandler adapter = new LoggingHandler(LoggingHandler.Level.INFO);
        adapter.setLoggerName("SIMPLE_LOGGER");
        adapter.setLogExpressionString("headers.id + ': ' + payload");
        return adapter;
    }    
	

}