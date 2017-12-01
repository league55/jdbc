package model;

import java.util.Date;

public class Order {

	private Integer id;
	private int quantity;
	private Date orderDate;
	private int songId;

	public Order(Integer id, int quantity, Date orderDate, int songId) {
		this.id = id;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.songId = songId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", quantity=" + quantity +
				", orderDate=" + orderDate +
				", songId=" + songId +
				'}';
	}
}
