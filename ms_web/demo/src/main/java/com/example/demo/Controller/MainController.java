package com.example.demo.Controller;


import com.example.demo.Dto.OrderRequestDto;
import com.example.demo.Message.OrderMessageDto;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {


    private final StreamBridge streamBridge;


    @PostMapping("order")
    @ResponseBody
    public String order(@RequestBody OrderRequestDto dto)  {

        streamBridge.send("orderMessage", new OrderMessageDto(dto));
        return dto.toString();
    }

}


