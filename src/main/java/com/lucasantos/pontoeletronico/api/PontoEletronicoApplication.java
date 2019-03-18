package com.lucasantos.pontoeletronico.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"${basePackages}"})
public class PontoEletronicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PontoEletronicoApplication.class, args);
	}

}
