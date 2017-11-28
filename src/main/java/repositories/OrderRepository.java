package repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.Order;

@Repository
public class OrderRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Order> findAll() {

		return jdbcTemplate.query(
				"SELECT *FROM ORDERS",
				(rs, rowNum) -> new Order(rs.getInt("id"),
						rs.getString("item"),
						rs.getInt("quantity"),
						rs.getDate("order_date"),
						rs.getInt("order_date"))
		);
	}


}
