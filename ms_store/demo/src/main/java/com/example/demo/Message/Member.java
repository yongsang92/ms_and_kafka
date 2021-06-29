package com.example.demo.Message;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



// @Data
// public class Member {
//     Long id;

//     String name;

//     Address address;
// }


@ToString@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
public class Member {
    Long id;

    String name;

    Address address;
}
