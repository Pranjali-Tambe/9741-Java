package com.demo.ManyTOOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.ManyTOOne.entity.library;
import com.demo.ManyTOOne.entity.student;

/**
 * Hello world!
 *
 */
public class ManyTOOne 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "books_issued" );  
        EntityManager em = emf.createEntityManager( );  
        em.getTransaction( ).begin( );  
       
        library lib=new library();  
	        //lib.setB_id(101);  
	        lib.setB_name("Data Structure");  
	          
	        em.persist(lib);  
	          
	        student st1=new student();  
	        //st1.setS_id(1);  
	        st1.setS_name("Swetal");  
	       st1.setLib(lib);  
	      
	          
	        student st2=new student();  
	        //st2.setS_id(2);  
	        st2.setS_name("Ayush");  
	        st2.setLib(lib);  
          
        em.persist(st1);  
        em.persist(st2);  
      
        em.getTransaction().commit();  
          
       em.close();  
        emf.close();
    }
}
