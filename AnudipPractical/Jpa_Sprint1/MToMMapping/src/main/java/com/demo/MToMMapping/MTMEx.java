package com.demo.MToMMapping;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.MToMMapping.entity.library;
import com.demo.MToMMapping.entity.student;
import java.util.*;

public class MTMEx 
{
   
    	    public static void main(String[] args) {  
    	          
    	        EntityManagerFactory emf=Persistence.createEntityManagerFactory("books_issued");  
    	        EntityManager em=emf.createEntityManager();  
    	          
    	        em.getTransaction().begin();  
    	          
    	        student st1=new student("Vipul",null);  
    	        student st2=new student("Vimal",null);  
    	          
    	        em.persist(st1);  
    	        em.persist(st2);  
    	        
    	          
    	          
    	       List<student> al1=new ArrayList<student>();  
    	    List<student> al2=new ArrayList<student>();  
    	          
    	        al1.add(st1);  
    	        al1.add(st2);  
    	          
    	        al2.add(st1);  
    	        al2.add(st2);  
    	          
    	        library lib1 = new library("Data Structure",al1);  
    	        library lib2 = new library("DBMS",al2);  
    	          
    	          
    	        em.persist(lib1);  
    	        em.persist(lib2);  
    	          
    	        em.getTransaction().commit();  
    	        em.close();  
    	        emf.close();  
    	          
    	    }  
    	  
    	}
    