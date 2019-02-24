package com.vmware.mytabisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.vmware.mytabisdemo")
@MapperScan("com.vmware.mytabisdemo.dao")
public class MytabisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MytabisDemoApplication.class, args);
	}
}
