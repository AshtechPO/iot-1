package com.iot.devices;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

public class Device1 {

	int min, max, randomNum = 0;
	Random random = new Random();
	File file;
	FileWriter fr;

	public Device1(int min, int max) throws IOException {
		this.min = min;
		this.max = max;
		file = new File("C:\\Users\\5600G\\Documents\\Projects\\iot-1\\src\\main\\device1.txt");
	}

	public void generateData() {
		while (true) {
			randomNum = random.nextInt((max - min) + 1) + min;
			System.out.println(randomNum);
			try {
				writeToFile(randomNum);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void writeToFile(int randomNum) {
		System.out.println("Writing to the file : " + randomNum);
		try {
				fr = new FileWriter(file, true);
				fr.write(String.valueOf(randomNum));
				fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}