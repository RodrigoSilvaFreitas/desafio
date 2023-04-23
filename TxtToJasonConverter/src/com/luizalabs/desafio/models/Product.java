package com.luizalabs.desafio.models;

import java.math.BigDecimal;

public class Product {
	private int productId;
	private BigDecimal value;

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nproductId: ").append(productId);
		sb.append("\nvalue: ").append(value);
		return sb.toString();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
