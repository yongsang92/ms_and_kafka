package com.example.demo.Config;

import java.io.IOException;
import java.util.Base64;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.example.demo.Dto.OrderRequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
public class Config {

	private final ObjectMapper mapper;

	@Bean
	public Serde<Integer> IntegerSerde(){
		return new Serde<Integer>(){
			@Override
			public Deserializer<Integer> deserializer() {
				return new Deserializer<Integer>(){
					@Override
					public Integer deserialize(String topic, byte[] data) {
						try {
							return mapper.readValue(data, Integer.class);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return null;
						
					}
				};
			}
			@Override
			public Serializer<Integer> serializer() {

				return new Serializer<Integer>(){
					@Override
					public byte[] serialize(String topic, Integer data) {
						// 직렬화 하지 않을 것이기 때문에 직렬화 코드는 생략
						return null;
					}
				};
			}
		};
	}
	

	@Bean
	public Consumer<KStream<Object, OrderRequestDto>> orderMessageResult() {
		return input -> input.foreach((key, value) -> {
			System.out.println(value);
		});
	}

}
