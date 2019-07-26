package org.spring.cloud.demo.credit.card.transaction.generator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ RecordGeneratorProperties.class })
public class CreditCardTransactionGeneratorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardTransactionGeneratorApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Boza");
	}

}
