package fr.intech.s5.tphibernate.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.intech.s5.tphibernate.entity.Client;

public class DAOTest {

	Dao dao;
 
	@Before
	public void setUp(){
		dao = new Dao();
	}
 
	@After
	public void tearDown(){
		dao.close();
	}
 
	@Test
	public void testClient(){
		Client client = new Client();
  
		client.setNom("Martin");
		client.setPrenom("Mickael");
		client.setAdresse("11 rue de la Fayette Paris");
		client.setCodePostal("75002");
		client.setPassword("password");
		client.setVille("Paris");
		client.setEmail("m.martin@gmail.com");
  
		Long idClient = dao.ajout(client);
		Client client1 = dao.getClient(idClient);
  
		assertNotNull(idClient);
		assertTrue(idClient > 0);
		assertEquals("Martin", client1.getNom());
		assertEquals("Mickael", client1.getPrenom());
		assertEquals("11 rue de la Fayette Paris", client1.getAdresse());
		assertEquals("75002", client1.getCodePostal());
		assertEquals("password", client1.getPassword());
		assertEquals("Paris", client1.getVille());
		assertEquals("m.martin@gmail.com", client1.getEmail());
   }
}