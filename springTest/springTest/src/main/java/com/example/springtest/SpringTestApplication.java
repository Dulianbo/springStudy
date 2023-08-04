package com.example.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
		System.out.println(" 　.╭╮︵☆╭╮.` .`  `. ` .  .  ╔═════╦═════╗ .`.`\n" +
						   " .〔　o　o　〕╭springBoot!╮  `╭启╮ `╭动╮ ╭!!!!╮.\n" +
						   " .〔ミ О ミ〕.|__________|.`. ╲╱.`. ╲╱    ╲╱ .`.\n" +
						   " 〔︵灬　灬︵〕");
	}

}
