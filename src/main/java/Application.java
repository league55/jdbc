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
import repositories.OrderRepository;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"model", "repositories"})
public class Application {

	private Logger logger = Logger.getLogger(Application.class);

	@Autowired
	private CustomerRepository repository;

	@Autowired
	private OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			List<Customer> all = repository.findAll();
			logger.info("---------");
			logger.info(all);
			logger.info("---------");
			logger.info(repository.findAllWhereNameStartsWith("Al"));
			logger.info("---------");
			logger.info(orderRepository.findAll());


		};
	}
}
