package com.example.demo.Entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Member {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;


    @Embedded
    Address address;



    public Member() {
    }

    public Member(Long i, String name, Address address) {
        this.id = i;
        this.name = name;
        this.address = address;
    }


    public Long getId() {
        return this.id;
    }

  
    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }

    


}
