import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import model.Customer;
import repositories.CustomerRepository;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"model", "repositories"})
public class Application {

	private Logger logger = Logger.getLogger(Application.class);

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			List<Customer> all = repository.findAll();
			logger.info("---------");
			logger.info(all.get(0));
			logger.info("---------");
			System.out.println(all);

		};
	}
}
