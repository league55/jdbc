package repositories;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.Customer;

@Repository
public class CustomerRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Customer> findAll() {

		return jdbcTemplate.query(
				"SELECT id, name, email, created_date FROM CUSTOMER",
				(rs, rowNum) -> new Customer(rs.getInt("id"),
						rs.getString("name"), rs.getString("email"), rs.getDate("created_date"))
		);
	}

	public List<Customer> findAllOrderByDate() {

		return jdbcTemplate.query(
				"SELECT * "
						+ "FROM CUSTOMER "
						+ "ORDER BY CREATED_DATE",
				(rs, rowNum) -> new Customer(rs.getInt("id"),
						rs.getString("name"), rs.getString("email"), rs.getDate("created_date"))
		);
	}

	public List<Customer> findAllWhereNameStartsWith(String nameStart) {

		return jdbcTemplate.query(
				"SELECT * "
						+ "FROM CUSTOMER "
						+ "WHERE NAME LIKE '" + nameStart + "%'",
				(rs, rowNum) -> new Customer(rs.getInt("id"),
						rs.getString("name"), rs.getString("email"), rs.getDate("created_date"))
		);
	}

	// Add new customer
	public void addCustomer(String name, String email) {

		jdbcTemplate.update("INSERT INTO customer(name, email, created_date) VALUES (?,?,?)",
				name, email, new Date());

	}

}
