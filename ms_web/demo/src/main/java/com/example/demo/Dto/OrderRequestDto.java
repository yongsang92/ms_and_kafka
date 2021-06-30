package com.example.demo.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// 이렇게 되면 에러 난다 씨발..
public class OrderRequestDto {

    public String nickName; // 사용자 닉네임
    public String storeName; // 가게 이름
    public String menus; // 선택한 메뉴 // TODO : 나중에 List<String> menus로 변경해야 한다

    
    

    // public OrderRequestDto(String a,String b){
    //     nickName=a;
    //     nickName=b;
    // }
    // 이런거 하나 만들었다고 에러가 날줄은 몰랐다    // 기본생성자가 안만들어져서 이 사단이 난다

}
