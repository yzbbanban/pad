package com.yzb.pad;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.yzb.pad.dao")
public class PadApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadApplication.class, args);
	}

}
