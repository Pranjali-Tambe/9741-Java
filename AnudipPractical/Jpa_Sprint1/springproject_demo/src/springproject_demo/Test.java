
package springproject_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	      
	    Student student=(Student)ac.getBean("studentbean");  
			    student.displayInfo(); 
			    ((ClassPathXmlApplicationContext) ac).close();
	}

}
