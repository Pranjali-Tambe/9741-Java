package com.demo.Criteria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.demo.Criteria.entity.Student;
import java.util.List;

/**
 * Hello world!
 *
 */
public class SingleFetch {  
    
    
    public static void main( String args[]) {  
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
        Student s2=new Student();
        s2.setS_age(22);
        s2.setS_name("pranjali");
        em.persist(s2);
        
        Student s3=new Student();
        s3.setS_age(22);
        s3.setS_name("pooja");
        em.persist(s3);
       
        Student s4=new Student();
        s4.setS_age(21);
        s4.setS_name("poonam");
        em.persist(s4);
        
        CriteriaBuilder cb=em.getCriteriaBuilder();  
        CriteriaQuery<Student> cq=cb.createQuery(Student.class);  
          
        Root<Student> stud=cq.from(Student.class);  
         
        cq.multiselect(stud.get("s_name"));   
       
         
        CriteriaQuery<Student> select = cq.select(stud);  
        TypedQuery<Student> q = em.createQuery(select);  
        List<Student> list = q.getResultList();  

        System.out.println("s_id");  
             
          
        for(Student s:list)  
        {  
        System.out.println(s.getS_id());  
    
      }  
          
em.getTransaction().commit();  
        em.close();  
        emf.close();
             
  
     }  
}

