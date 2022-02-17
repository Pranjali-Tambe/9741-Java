package springproject_demo1;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			      ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
			      Helloworld objA = (Helloworld) context.getBean("helloworld");

			      objA.setMessage("I'm object A");
			      objA.getMessage();

			      Helloworld objB = (Helloworld) context.getBean("helloworld");
			      objB.getMessage();
			   }
			}



