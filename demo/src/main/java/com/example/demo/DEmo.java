package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class DEmo {
	
	@Autowired
	@Qualifier
	public int a;
	
	@Bean
	@Qualifier
	public int Demo()
	{
		return 0;
	}

}
