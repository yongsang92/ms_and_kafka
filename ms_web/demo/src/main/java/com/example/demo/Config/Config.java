package com.example.demo.Config;

import java.util.function.Consumer;
import java.util.function.Supplier;

import com.example.demo.Dto.OrderRequestDto;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
public class Config {


	@Bean
	public Consumer<KStream<Object, OrderRequestDto>> orderMessageResult() {
		return input -> 
			input.foreach((key, value) -> {
			System.out.println(value);
		});
	}

	// @Bean
	// public Consumer<KStream<Object, Object>> orderMessageResult() {
	// 	return input -> 
	// 		input.foreach((key, value) -> {
	// 		System.out.println(value);
	// 	});
	// }

}
