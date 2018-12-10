package br.com.juliogriebeler.movieevaluator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MovieEvaluatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieEvaluatorApplication.class, args);
	}
}
