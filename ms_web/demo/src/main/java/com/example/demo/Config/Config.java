package com.example.demo.Config;

import java.util.function.Supplier;
import com.example.demo.Entity.Member;
import com.example.demo.Entity.SessionMember;

import org.springframework.cloud.function.context.PollableBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Configuration
public class Config {



	@Bean
	public Supplier<String> sendMemberInfo() {
		return () -> "about memeber";
	}


    
}
