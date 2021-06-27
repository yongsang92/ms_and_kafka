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


    // @Bean
	// public Supplier<SessionMember> sendMemberInfo() {
	// 	return () -> new SessionMember(new Member(1L,"david","NY"));
	// }
    // @PollableBean

	@Bean
	public Supplier<String> sendMemberInfo() {
		return () -> "about memeber";
	}

    // @Bean
	// public Supplier<String> sendStoreInfo() {
	// 	return () -> "about store";
	// }
	// // ❗ function.Supplier라고?  kafka 패키지에 있는게 아니고?
	// 메시지를 딜레이 간격마다 계속보낸다

    
}
