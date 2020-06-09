package com.prograiii.swing;

import com.prograiii.swing.Repository.ButtonRepository;
import com.prograiii.swing.Services.AlphabetService;
import com.prograiii.swing.Services.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SwingApplication {
	@Autowired
	private ButtonService buttonService ;
	@Autowired
	private AlphabetService alphabetService;

	public static void main(String[] args) {
//		SpringApplication.run(SwingApplication.class, args);
		SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(SwingApplication.class);
		springApplicationBuilder.headless(false);
		springApplicationBuilder.run(args);
	}

	@PostConstruct
	public void insertDatabase(){
//		buttonService.saveDate();
//		buttonService.getRow();
		alphabetService.saveDate();
		alphabetService.getFila1();
	}
}
