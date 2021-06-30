package com.example.demo.Config;

import java.util.function.Consumer;
import java.util.function.Supplier;

import com.example.demo.Message.OrderMessageDto;
import com.example.demo.Service.TransactionService;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class fromWebMs {

    private final TransactionService service;


    @Bean
    public Consumer<KStream<Object, OrderMessageDto>> orderMessage() {

        return input ->
            input.foreach((key, dto) -> {
                service.takeOrder(dto);
            });
    }

    

}
