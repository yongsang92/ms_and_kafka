package com.example.demo.Message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderMessageDto{


    String storeName; // 가게 이름

    String menus; // 선택한 메뉴 // TODO : 나중에 List<String> menus로 변경해야 한다
}
