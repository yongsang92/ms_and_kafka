package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Store {


    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    Long id;

    String name;

    
}
