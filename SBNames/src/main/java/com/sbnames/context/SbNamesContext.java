package com.sbnames.context;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SbNamesContext {
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
