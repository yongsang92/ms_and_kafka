package com.example.demo.Service;

import java.util.function.Consumer;

import com.example.demo.Message.OrderMessageDto;
import com.example.demo.Repo.StoreRepo;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final StoreRepo repo;
    private final StreamBridge streamBridge;

 
    public void takeOrder(OrderMessageDto dto) {
        streamBridge.send("orderMessageResult",new OrderMessageDto("a","b"));

        System.out.println("this is service layer");
        System.out.println(dto);

    }

}
