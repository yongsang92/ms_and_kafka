package com.example.demo.Message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Store implements Serializable {

    public List<Address> list;

}
