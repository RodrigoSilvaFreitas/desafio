package com.luizalabs.desafio.models;

import java.util.ArrayList;

public class User {

	private int userId;
	private String name;
	private ArrayList<Order> orders;

	public User() {
		super();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nuserId: ").append(userId);
		sb.append("\nname: ").append(name);
		sb.append("\norders: ").append(orders);
		return sb.toString();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

}