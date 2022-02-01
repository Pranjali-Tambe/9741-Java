package jpasamplefind.jpasamplefind;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpasamplefind.jpasamplefind.entity.StudentEntity;

/**
 * Hello world!
 *
 */
public class FindStudent {  
    public static void main(String args[])  
    {  
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
        em.getTransaction().begin();
          
         
    
  

          
        StudentEntity s=em.find(StudentEntity.class,101);  
          
        System.out.println("Student id = "+s.getS_id());  
        System.out.println("Student Name = "+s.getS_name());  
        System.out.println("Student Age = "+s.getS_age());  
        
        em.getTransaction().commit();
        emf.close();
        em.close();
          
    }  
}