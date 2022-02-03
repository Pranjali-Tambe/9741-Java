package com.demo.jpaCascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.demo.jpaCascade.entity.StudentEntity;
import com.demo.jpaCascade.entity.subject;



public class JpaCascadeEx 
{
    public static void main( String[] args )
    {
    
    	          EntityManagerFactory emf = Persistence.createEntityManagerFactory( "JpaCascadePersist" );  
    	            
    	          EntityManager em = emf.createEntityManager( );  
    	        em.getTransaction().begin();  
    	  
    	           
    	          StudentEntity s1=new StudentEntity();  
    	          s1.setS_id(101);  
    	          s1.setS_name("Vipul");  
    	          s1.setS_age(20);  
    	            
    	          StudentEntity s2=new StudentEntity();  
    	          s2.setS_id(102);  
    	          s2.setS_name("Aman");  
    	          s2.setS_age(22);  
    	            
    	          subject sb1=new subject();  
    	          sb1.setName("ENGLISH");  
    	          sb1.setMarks(80);  
    	            sb1.setS_id(s1.getS_id());  
    	              
    	            subject sb2=new subject();  
    	          sb2.setName("Maths");  
    	          sb2.setMarks(75);  
    	              sb2.setS_id(s2.getS_id());  
    	            
    	          s1.setSub(sb1);  
    	          s2.setSub(sb2);  
    	            
    	              
    	            
    	          em.persist( s1 );//No need to perform persist operation separately for different entities.  
    	          em.persist(s2);  
    	          
    	          em.getTransaction().commit();  
    	  
    	          em.close( );  
    	          emf.close( );  
    	          
    	          
    	    }  
    	  
    	      
    	}

