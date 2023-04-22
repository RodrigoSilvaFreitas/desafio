package com.luizalabs.desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader("data_1.txt"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				final var userId = line.substring(0, 10);
				final var userName = line.substring(10, 55);
				final var orderId = line.substring(55, 65);
				final var productId = line.substring(65, 75);
				final var value = line.substring(75, 87);
				final var date = line.substring(87, 95);
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
