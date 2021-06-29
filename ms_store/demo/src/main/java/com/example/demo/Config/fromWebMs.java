package com.example.demo.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.example.demo.Message.Address;
import com.example.demo.Message.Member;
import com.example.demo.Message.Store;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class fromWebMs {

   
	// @Bean
	// public Consumer<KStream<Object, Member>> getOrder() {
	//     return input ->
    //             input.foreach((key, value) -> {
    //                 System.out.println("Key: " + key + " Value: " + value);
    //             });
	// }

    

    // @Bean
	// public Consumer<KStream<Object, List<Address>>> getOrder() {
	//     return input ->
    //             input.foreach((key, value) -> {
    //                 System.out.println("Key: " + key + " Value: " + value);
    //             });
	// }

    @Bean
	public Consumer<KStream<Object,Store>> getOrder() {
	    return input ->
                input.foreach((key, value) -> {
                    for(Address ad:value.list)
                        System.out.println(ad.getAddress());
                });
	}


    /* 
    @Bean
	public Consumer<KStream<Object, List<Address>>> getOrder() {
	    return input ->
                input.foreach((key, value) -> {
                    // System.out.println("Key: " + key + " Value: " + value);

                for(Address ads: value){
                    System.out.println(ads);
                }

                });
	}
    
    */
    

}
