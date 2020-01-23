package com.huytran.webapp.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.huytran.webapp.model.Contact;

class ContactDAOTest {
	private DriverManagerDataSource dataSource;
	private ContactDAO dao;

	@BeforeEach
	void setupBeforeEach() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("1998");

		dao = new ContactDAOImpl(dataSource);
	}

	@Test
	void testSave() {
		Contact contact = new Contact("Bill Gates", "bill@gmail.com", "Microsoft, CA", "90909090");
		int result = dao.save(contact);

		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		Contact contact = new Contact(2, "Bill Gates", "bill-gates@gmail.com", "Microsoft, CA", "90909090");
		int result = dao.update(contact);

		assertTrue(result > 0);
	}

	@Test
	void testGet() {
		Integer id = 3;
		Contact contact = dao.get(id);

		if (contact != null) {
			System.out.println(contact);
		}
		assertNotNull(contact);
	}

	@Test
	void testDelete() {
		Integer id = 2;
		int result = dao.delete(id);

		assertTrue(result > 0);
	}

	@Test
	void testList() {
		List<Contact> listContacts = dao.list();

		for (Contact aContact : listContacts) {
			System.out.println(aContact);
		}

		assertTrue(!listContacts.isEmpty());

	}

}
