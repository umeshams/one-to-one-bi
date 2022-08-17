package one.to.one.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_one_bi.Pan;
import one_to_one_bi.Person;



public class PanTestA {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setAge(22);
		person.setName("raju");
		
		Pan pan=new Pan();
		pan.setFatherName("manu");
		pan.setPanNumber("ARHge1234");
		
	pan.setPerson(person);
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(pan);
	entityTransaction.commit();

		System.out.println("-------data stored----------");
		
		
		
	}
}
