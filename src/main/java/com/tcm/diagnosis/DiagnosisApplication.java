package com.tcm.diagnosis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tcm.diagnosis.mapper")
@SpringBootApplication
public class DiagnosisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiagnosisApplication.class, args);
	}

}
