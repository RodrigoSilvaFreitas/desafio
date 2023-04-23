package com.luizalabs.desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import com.luizalabs.desafio.models.Order;
import com.luizalabs.desafio.models.Product;
import com.luizalabs.desafio.models.User;

public class Application {

	public static void main(String[] args) {

		BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader("data_1.txt"));
			String line = reader.readLine();

			ArrayList<User> users = new ArrayList<>();

			while (line != null) {
				final var userId = Integer.parseInt(line.substring(0, 10).trim());
				final var name = line.substring(10, 55).trim();
				final var orderId = line.substring(55, 65).trim();
				final var productId = Integer.parseInt(line.substring(65, 75).trim());
				final var value = new BigDecimal(line.substring(75, 87).trim());
				final String date = line.substring(87, 95).trim();

				var user = users.stream().filter(x -> x.getUserId() == userId).findFirst().orElse(null);

				if (user == null) {
					user = new User();
					user.setUserId(userId);
					user.setName(name);

					var product = createProduct(productId, value);

					var order = new Order();
					order.setOrderId(orderId);
					order.setDate(date);
					order.setTotal(value);
					final var products = new ArrayList<Product>();
					products.add(product);
					order.setProducts(products);

					final var orders = new ArrayList<Order>();
					orders.add(order);
					user.setOrders(orders);
					users.add(user);
				} else {
					var order = user.getOrders().stream().filter(x -> x.getOrderId() == orderId).findFirst()
							.orElse(null);
					if (order == null) {
						order = new Order();
						order.setOrderId(orderId);
						order.setDate(date);
						order.setTotal(value);

						var product = createProduct(productId, value);

						final var products = new ArrayList<Product>();
						products.add(product);
						order.setProducts(products);

						user.getOrders().add(order);
					} else {
						var product = createProduct(productId, value);

						order.setTotal(order.getTotal().add(value));
						order.getProducts().add(product);
					}
				}

				line = reader.readLine();
			}

			reader.close();

			System.out.println(users);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Product createProduct(int productId, BigDecimal value) {
		var product = new Product();
		product.setProductId(productId);
		product.setValue(value);
		return product;
	}
}