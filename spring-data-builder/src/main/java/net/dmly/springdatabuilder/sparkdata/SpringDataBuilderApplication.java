package net.dmly.springdatabuilder.sparkdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataBuilderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataBuilderApplication.class, args);
		SpeakerRepo speakerRepo = context.getBean(SpeakerRepo.class);
		List<Speaker> speakers = speakerRepo.findByAgeBetween(20, 25);
		speakers.forEach(System.out::println);
	}

}
