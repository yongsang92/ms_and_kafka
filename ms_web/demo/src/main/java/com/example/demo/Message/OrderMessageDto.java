package com.example.demo.Message;

import com.example.demo.Dto.OrderRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class OrderMessageDto {

    public String storeName; // 가게 이름
    public String menus; // 선택한 메뉴 // TODO : 나중에 List<String> menus로 변경해야 한다

    public OrderMessageDto(OrderRequestDto dto) {
        storeName = dto.storeName;
        menus = dto.menus;
    }

}
