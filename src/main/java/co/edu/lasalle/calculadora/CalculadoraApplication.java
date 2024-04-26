package co.edu.lasalle.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "co.edu.lasalle.calculadora.controllers",
		"co.edu.lasalle.calculadora.services",
		"co.edu.lasalle.calculadora.dtos"})
public class CalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
	}

}
