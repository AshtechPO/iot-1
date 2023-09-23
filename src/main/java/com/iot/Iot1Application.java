package com.iot;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iot.devices.Device1;

@SpringBootApplication
public class Iot1Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Iot1Application.class, args);
		Device1 device1 = new Device1(0, 10);
		
		device1.generateData();
	}

}

