package model;

import java.util.Date;

public class Order {

	private Integer id;
	private String item;
	private int quantity;
	private Date orderDate;
	private int customerId;

	public Order(Integer id, String item, int quantity, Date orderDate, int customerId) {
		this.id = id;
		this.item = item;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.customerId = customerId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", item='" + item + '\'' +
				", quantity=" + quantity +
				", orderDate=" + orderDate +
				", customerId=" + customerId +
				'}';
	}
}
