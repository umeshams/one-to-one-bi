package one.to.one.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import one_to_one_bi.Company;

public class CompanyRitrive {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	Company company=entityManager.find(Company.class, 1);
	
	System.out.println("id is :"+company.getId());
	System.out.println("name is :"+company.getName());
	System.out.println("gst id :"+company.getGst().getGstid());
}
}
