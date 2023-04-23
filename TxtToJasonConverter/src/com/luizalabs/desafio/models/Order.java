package com.luizalabs.desafio.models;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Order {

	private String orderId;
	private BigDecimal total;
	private String date;
	private ArrayList<Product> products;

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\norderId: ").append(orderId);
		sb.append("\ntotal: ").append(total);
		sb.append("\ndate: ").append(date);
		sb.append("\nproducts: ").append(products);
		return sb.toString();
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}