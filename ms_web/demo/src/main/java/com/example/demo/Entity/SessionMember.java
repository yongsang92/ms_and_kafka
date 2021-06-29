package com.example.demo.Entity;

import java.io.Serializable;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class SessionMember implements Serializable {

    Long id;

    String name;

    Address address;

    public SessionMember(){
        
    }

    public SessionMember(Member m) {
        this.id = m.id;
        this.name = m.name;
        this.address = m.address;
    }

}

// 직렬화 해서 REST API로 전달해야 한다
