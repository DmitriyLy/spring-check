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
		List<Speaker> speakers = speakerRepo.findByAgeBetween(25, 40);
		speakers.forEach(System.out::println);

		CriminalRepo criminalRepo = context.getBean(CriminalRepo.class);
		List<Criminal> criminals = criminalRepo.findByNumberGreaterThanOrderByNumber(15);
		criminals.forEach(System.out::println);

		System.out.println("---------------------------------------\n");

		long count = criminalRepo.findByNameContainsCount("ova");
		System.out.println(String.format("Count %s", count));

	}

}
