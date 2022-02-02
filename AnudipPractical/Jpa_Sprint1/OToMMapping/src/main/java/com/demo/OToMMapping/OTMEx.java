package com.demo.OToMMapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.OToMMapping.entity.library;
import com.demo.OToMMapping.entity.student;

public class OTMEx{
	 public static void main(String arg[])
	 {
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("books_issued");  
	 EntityManager em=emf.createEntityManager();  
	  
	 em.getTransaction().begin();  
	   
	  library lib1=new library();  
	    //lib1.setB_id(101);  
	    lib1.setB_name("Data Structure");  
	     
	      
	    library lib2=new library();  
	    //lib2.setB_id(102);  
	    lib2.setB_name("DBMS");  
	    
	    em.persist(lib1);  
	    em.persist(lib2);  
	      
	    ArrayList<library> list=new ArrayList<library>();  
	    list.add(lib1);  
	    list.add(lib2);  
	      
	      
	      
	      
	   
	   
	 student st1=new student();  
	  //st1.sets_id(1);  
	    st1.setS_name("Vipul");  
	    st1.setBooks_issued(list);  
	      
	   
	    em.persist(st1);  
	    
	      
	 em.getTransaction().commit();  
	 em.close();  
	 emf.close();
		 
	 }
 }
