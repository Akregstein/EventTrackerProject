package com.skilldistillery.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MountainTests {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Mountain mount;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("Mountains");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		mount = em.find(Mountain.class, 1);
		}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		mount = null;
	}

	@Test
	@DisplayName("Initial database test")
	void test1() {
		assertNotNull(mount);
		assertEquals("Kit Carson", mount.getName());
		assertEquals("Sangre de Cristo", mount.getRange());
	}
//	@Test
//	@DisplayName("Test post to category")
//	void test2() {
//		assertNotNull(cat);
//		assertNotNull(cat.getPosts());
//	//	assertEquals(1,cat.getPosts().g);
//	}

}
