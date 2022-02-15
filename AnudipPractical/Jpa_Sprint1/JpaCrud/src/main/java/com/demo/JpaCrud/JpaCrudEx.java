package com.demo.JpaCrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import com.demo.JpaCrud.entity.Player;


public class JpaCrudEx 
{
    
        public static void main( String[] args )
        {
        	//JpaCrudEx.createRecord();
        	//JpaCrudEx.retrieveRecord();
        	//JpaCrudEx.updateRecord();
        	//JpaCrudEx.deleteRecord();
        	JpaCrudEx.queryRecord();
        	JpaCrudEx.findByNamedQuery();

        }
        @SuppressWarnings("unchecked")
    	
    	private static void findByNamedQuery() {
        	// TODO Auto-generated method stub
    		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Jpa_Crud");
    		EntityManager entityManager = emf.createEntityManager();
    		entityManager.getTransaction().begin();

    		Query query=  entityManager.createNamedQuery("Player.findByEmail");
    		query.setParameter("email", "mj@mcnz.com");
    		List<Player> players = query.getResultList();

    		for (Player playa : players) {
    			System.out.println(playa);
    		}

    		for (int i = 0; i < players.size(); i++) {
    			Player player = players.get(i);
    			System.out.println(player.getLoginName());
    		}
    		
    		entityManager.getTransaction().commit();
    	}
    	
    	public static void findByFuzzyNamedQuery() {
    		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Jpa_Crud");
    		EntityManager entityManager = emf.createEntityManager();
    		entityManager.getTransaction().begin();

    		Query query=  entityManager.createNamedQuery("Player.findByFuzzyEmail");
    		query.setParameter("email", "%scja%");
    		List<Player> players = query.getResultList();

    		for (Player playa : players) {
    			System.out.println(playa);
    		}

    		for (int i = 0; i < players.size(); i++) {
    			
    			Player player = players.get(i);
    			System.out.println(player.getLoginName());
    		}
    		entityManager.getTransaction().commit();
    	}
			
	
    
			

		private static void queryRecord() {
			// TODO Auto-generated method stub
    		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Jpa_Crud");
    		EntityManager entityManager = emf.createEntityManager();
    		entityManager.getTransaction().begin();

    		Query query = entityManager.createQuery("select distinct p from Player as p", Player.class);
    		

    		List<Player> players = query.getResultList();

    		for (Player playa : players) {
    			System.out.println("The password is :" + playa.getPassword());
    		}

    		for (int i = 0; i < players.size(); i++) {
    			Player player = players.get(i);
    			System.out.println(player.getLoginName());
    		}
    		entityManager.flush();
    		//entityManager.detach(arg0);h();
    		entityManager.getTransaction().commit();
    	}
			
	

	/*	private static void deleteRecord() {
    		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Jpa_Crud");
    		EntityManager entityManager = emf.createEntityManager();
    		entityManager.getTransaction().begin();

    		Long key = Long.valueOf(1);
    		Player p = entityManager.find(Player.class, key);
    		entityManager.remove(p); // record is deleted
    		System.out.println("Delete Data");
    		System.out.println(p.getPassword());

    		entityManager.getTransaction().commit();
    		
    	}

    	private static void updateRecord() {
    		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Jpa_Crud");
    		EntityManager entityManager = emf.createEntityManager();
    		entityManager.getTransaction().begin(); 

    		Long key = Long.valueOf(2);
    		Player p = entityManager.find(Player.class, Long.valueOf(2));
    		p.setPassword("Root@123");
    		System.out.println("Update Data");
    		System.out.println(p.getPassword());

    		entityManager.getTransaction().commit();
    		
    	}

    	private static void retrieveRecord() {

    		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Jpa_Crud");  
    	    EntityManager em=emf.createEntityManager();  
    	    em.getTransaction().begin();
    	    
    	    Long key = Long.valueOf(2);
    		Player p = em.find(Player.class, key);
    		System.out.println("Retrieve Data");
    		System.out.println(p.getPassword()+"    "+ p.getLoginName());
    		
    		
    		em.getTransaction().commit();
    	}

    	*/
    	
    	private static void createRecord() {
    		
    		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Jpa_Crud");  
    	    EntityManager em=emf.createEntityManager();  
    	    em.getTransaction().begin(); 
    	    Player p1 = new Player();
    	    	p1.setLoginName("Pranjali");
    	    	p1.setPassword("panu19");
    	    	p1.setEmailAddress("tambe19@gmail.com");
    	    	//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    	       // Date date = new Date();
    	        p1.setRegistrationDate(new java.util.GregorianCalendar(2017,05,21));
    	    	p1.setVerified(true);
    	    	p1.setLastAccessTime(new java.util.Date());
    	    	
    	    	Player p2 = new Player();
    	    	p2.setLoginName("Pooja");
    	    	p2.setPassword("Poo08");
    	    	p2.setEmailAddress("poo12@gmail.com");
    	    	//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    	       // Date date = new Date();
    	        p2.setRegistrationDate(new java.util.GregorianCalendar(2017,05,23));
    	    	p2.setVerified(true);
    	    	p2.setLastAccessTime(new java.util.Date());

    	    	Player p3 = new Player();
    	    	p3.setLoginName("Deepika");
    	    	p3.setPassword("Dipu13");
    	    	p3.setEmailAddress("dipi13@gmail.com");
    	    	//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    	       // Date date = new Date();
    	        p3.setRegistrationDate(new java.util.GregorianCalendar(2017,05,25));
    	    	p3.setVerified(true);
    	    	p3.setLastAccessTime(new java.util.Date());
    	    	
    	    	Player p4 = new Player();
    	    	p4.setLoginName("Poo");
    	    	p4.setPassword("poo12");
    	    	p4.setEmailAddress("Poomotite21@gmail.com");
    	    	//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    	       // Date date = new Date();
    	        p4.setRegistrationDate(new java.util.GregorianCalendar(2017,05,25));
    	    	p4.setVerified(true);
    	    	p4.setLastAccessTime(new java.util.Date());
    	    	
    	    	
    	    	
    	    	em.persist(p1);
    	    	em.persist(p2);
    	    	em.persist(p3);
    	    	em.persist(p4);
    	    	
    	    	em.getTransaction().commit();
    	    	Query query = em.createQuery("select p1 from Player p1");
    	    	
    	    	List<Player> list =query.getResultList();  
    	          System.out.println("Player details :");  
    	          for(Player s:list) {  
    	                
    	             System.out.println(s);      
    	          }
    	    	em.close();
    	    	emf.close();
    	    	
    		
	    	   
	}

}
