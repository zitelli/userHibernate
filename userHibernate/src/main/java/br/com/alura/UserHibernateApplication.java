package br.com.alura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @ComponentScan(basePackages = "br.com.alura.control") // Adjust package name as needed
public class UserHibernateApplication {

	  public static void main(String[] args) {
	    SpringApplication.run(UserHibernateApplication.class, args);

	    //    SessionFactory sessionFactory = (SessionFactory) new ClassPathXmlApplicationContext("spring.xml").getBean("sessionFactory");
		//    Session session = sessionFactory.openSession();

	    //    session.beginTransaction();
		//    User person = new User();
		 //   person.setName("John Doe");
		//    person.setEmail("doe@gmail.com");
		 //   session.save(person);
		//    session.getTransaction().commit();

		//    session.close();
	  
	  }
	}	

