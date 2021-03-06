package com.example.demo.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class OrderRequestDto {

    public String nickName; // 사용자 닉네임
    public String storeName; // 가게 이름
    public String menus; // 선택한 메뉴 // TODO : 나중에 List<String> menus로 변경해야 한다
}
