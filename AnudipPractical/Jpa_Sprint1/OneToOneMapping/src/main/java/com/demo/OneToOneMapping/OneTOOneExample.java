package com.demo.OneToOneMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.OneToOneMapping.entity.library;
import com.demo.OneToOneMapping.entity.student;

/**
 * Hello world!
 *
 */
public class OneTOOneExample 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Book_issued" );  
         EntityManager em = emf.createEntityManager( );  
         em.getTransaction( ).begin( );  
        
         student st1=new student();  
         //st1.setS_id(1);  
         st1.setS_name("Vipul");  
           
         student st2=new student();  
        // st2.setS_id(2);  
         st2.setS_name("Vimal");  
       
       
        em.persist(st1);  
         em.persist(st2);  
           
         library lib1=new library();  
        // lib1.setB_id(101);  
        lib1.setB_name("Data Structure");  
         lib1.setStud(st1);  
           
         library lib2=new library();  
        // lib2.setB_id(102);  
        lib2.setB_name("DBMS");  
         lib2.setStud(st2);  
           
         em.persist(lib1);  
         em.persist(lib2);  
       
         em.getTransaction().commit();  
           
        em.close();  
         emf.close();  
}
    }

