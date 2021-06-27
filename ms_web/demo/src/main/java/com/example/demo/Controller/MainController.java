package com.example.demo.Controller;

import java.io.IOException;
import java.util.function.Supplier;

import com.example.demo.Entity.Member;
import com.example.demo.Entity.SessionMember;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.integration.support.json.Jackson2JsonObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {


    private final Supplier sendMemberInfo;
    private final StreamBridge streamBridge;
    private final ObjectMapper oMapper;


    @PostMapping("order/{userId}/{storeId}")
    @ResponseBody
    public String order(@PathVariable int userId, @PathVariable int storeId) throws IOException {

        // 웹서비스에서 사용자의 아이디, 가게의 아이디를 전달받는다
        // 사용자의 아이디로 DB에서 사용자의 주소, 뭐 기타 정보를 가져와서
        // 카프카에게 메시지를 발행한다

        //1. 카프카에게 메시지를 발행하는것 부터 해보자

        streamBridge.send("sendStoreInfo",new Member(1l,"aladin","india"));
 
    
        return sendMemberInfo.get().toString();

    }

}

