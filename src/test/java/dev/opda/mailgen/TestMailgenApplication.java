package dev.opda.mailgen;

import org.springframework.boot.SpringApplication;

public class TestMailgenApplication {

	public static void main(String[] args) {
		SpringApplication.from(MailgenApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
