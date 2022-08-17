package one.to.one.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import one_to_one_bi.Person;

public class PanRitriveFeatchType {
public static void main(String[] args) throws InterruptedException {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	        Person person=  entityManager.find(Person.class, 2);
	       
	       System.out.println("name is :"+person.getName());
	       
	       Thread.sleep(2000);
	       System.out.println("---------------------------------------");
	       
	       System.out.println("father name is :"+person.getPan().getFatherName());
//	   //    Hibernate: select person0_.id as id1_3_0_, person0_.age as age2_3_0_, 
//	       person0_.name as name3_3_0_, pan1_.id as id1_2_1_, 
//	       pan1_.fatherName as fatherna2_2_1_, pan1_.panNumber as pannumbe3_2_1_, 
//	       pan1_.person_id as person_i4_2_1_ from Person person0_ left outer join Pan pan1_ 
//	       on person0_.id=pan1_.person_id where person0_.id=?

}
}
