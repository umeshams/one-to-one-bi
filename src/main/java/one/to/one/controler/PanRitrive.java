package one.to.one.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import one_to_one_bi.Pan;
import one_to_one_bi.Person;

public class PanRitrive {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	        Person person=  entityManager.find(Person.class, 2);
	        
	       System.out.println("id is :"+person.getId());
	       
	       System.out.println("age is :"+person.getAge());
	       System.out.println("name is :"+person.getName());
	       System.out.println("father name :"+person.getPan().getFatherName());
	       System.out.println("pan Number :"+person.getPan().getPanNumber());
}

}