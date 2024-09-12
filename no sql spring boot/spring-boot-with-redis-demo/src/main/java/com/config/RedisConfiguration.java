package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfiguration {

	@Bean
	public RedisConnectionFactory redisConnectionFactory() {
		// we can provide redis database details 
		return new LettuceConnectionFactory("localhost", 6379);
	}
	
	@Bean
	public RedisTemplate<Integer, Object> redisTemplate() {
		RedisTemplate<Integer, Object> template = new RedisTemplate<Integer, Object>();
		template.setConnectionFactory(redisConnectionFactory());
		return template;
	}
}