package pl.sda.JokeApp123;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.sda.JokeApp123.joke.entity.JokeEntity;
import pl.sda.JokeApp123.joke.repository.JokeRepository;

@SpringBootApplication
public class JokeApp123Application {

	public static void main(String[] args) {
		SpringApplication.run(JokeApp123Application.class, args);
	}

	@Bean
	public CommandLineRunner loadData(JokeRepository repository) {
		return (args) -> {
			repository.save(new JokeEntity("example joke 1", "daddy's joke"));
			repository.save(new JokeEntity("example joke 2", "modern"));
			repository.save(new JokeEntity("example joke 3", "chuck norris"));
			repository.save(new JokeEntity("example joke 4", "daddy's joke"));
		};
	}

}
