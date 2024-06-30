package com.dukaan.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({ "com.dukaan.common.entity", "com.dukaan.admin.user" })
public class DukaanBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(DukaanBackEndApplication.class, args);
	}

}
