package com.example.examen_h4;

import com.example.examen_h4.services.AlphabetService;
import com.example.examen_h4.services.DiccionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ExamenH4Application {
	@Autowired
	private DiccionaryService  diccionaryService;
	@Autowired
	private AlphabetService alphabetService;


	public static void main(String[] args) {
//		SpringApplication.run(ExamenH4Application.class, args);
		SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(ExamenH4Application.class);
		springApplicationBuilder.headless(false);
		springApplicationBuilder.run(args);
	}
	@PostConstruct
	public void insertDatabase(){
//		String t="LUNES", l="ingles";
//		diccionaryService.traducir(t,l);
		diccionaryService.saveDate();
		alphabetService.getFila1();


	}

}
