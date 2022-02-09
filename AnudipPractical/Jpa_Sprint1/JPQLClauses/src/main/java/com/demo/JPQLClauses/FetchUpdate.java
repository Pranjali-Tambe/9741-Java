package com.demo.JPQLClauses;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.JPQLClauses.entity.student;

/**
 * Hello world!
 *
 */
public class FetchUpdate 
{
    public static void main( String[] args )
    {

  	  EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
  		          EntityManager em = emf.createEntityManager();  
   	          em.getTransaction().begin( );  
  		                    
  	  	          Query query1 = em.createQuery("Update student SET s_age = 26 where s_id >= 3");  
  	  	          query1.executeUpdate();
  	  	          //em.getTransaction().commit();
  	  	          
  	  	      Query query2 = em.createQuery("Delete from student where s_id = 4");  
	  	          query2.executeUpdate();
	  	          em.getTransaction().commit();
	  	          
	  	          
	  	      Query query3 = em.createQuery("Select count(s) from student s");  
	  	      System.out.println("Total Records: " + query3.getSingleResult());
	  	        
	  	         
	  	    Query query4 = em.createQuery("Select Max(s.s_age) from student s");  
	  	      System.out.println("Max Age: " + query4.getSingleResult());
	  	      
	  	      
	  	    Query query5 = em.createQuery("Select Min(s.s_age) from student s");  
	  	      System.out.println("Min Age " + query5.getSingleResult());
	  	        
	  	      
	  	    //Query queryn = em.createQuery("select s from student s where s_name like 'a%'");
	  	    Query queryn = em.createQuery("select s from student s where s_age between 23 and 26");
	  	      
  	  	          @SuppressWarnings("unchecked")  
  		        List<student> list =queryn.getResultList();  
  	 	          System.out.println("student details :");  
  	  	          for(student s:list) {  
  	 	                
  	  	             System.out.println(s.getS_id() + "" +s.getS_age() + "" + s.getS_name());  
  	          
  	               
  	  	          }  
  		            
  	        
  		          em.close();  
  		          emf.close();    
    }
}
