package com.noobisoftcontrolcenter.tokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.openelements.hedera.spring.EnableHedera;

@SpringBootApplication
@EnableHedera
public class TokemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokemonApplication.class, args);
	}

}
