package com.demo.JpaCascadeRemove;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.JpaCascadeRemove.entity.StudentEntity;

/**
 * Hello world!
 *
 */
public class JpaCascadeRemoveEx 
{
    public static void main( String[] args )
    {
    	
    	          EntityManagerFactory emf = Persistence.createEntityManagerFactory( "JpaCascadePersist" );  
    	            
    	          EntityManager em = emf.createEntityManager( );  
    	        em.getTransaction().begin();  
    	  
    	           
    	          StudentEntity s=em.find(StudentEntity.class, 101);  
    	         em.remove(s);  
    	            
    	          
    	          em.getTransaction().commit();  
    	  
    	          em.close( );  
    	          emf.close( );  
    	          
    	          
    	    }  
    	 
    	      
    	}
