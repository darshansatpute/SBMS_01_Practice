package com.codingtips;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashokit.util.PasswordEncryptor;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("*** AppConfig :: Constructor *** ");
	}

	@Bean
	public PasswordEncryptor getInstance() {
		PasswordEncryptor pe = new PasswordEncryptor();
		return pe;
	}
}
