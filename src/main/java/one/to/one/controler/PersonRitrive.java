package one.to.one.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import one_to_one_bi.Pan;
import one_to_one_bi.Person;

public class PersonRitrive {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		        Pan pan=entityManager.find(Pan.class, 1);
		        
//		       System.out.println("id is :"+person.getId());
//		       
//		       System.out.println("age is :"+person.getAge());
//		       System.out.println("name is :"+person.getName());
//		       System.out.println("father name :"+person.getPan().getFatherName());
//		       System.out.println("pan Number :"+person.getPan().getPanNumber());
	}
}
