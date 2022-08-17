package one_to_one_bi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Company {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
@OneToOne(mappedBy = "company")
private Gst gst;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Gst getGst() {
	return gst;
}
public void setGst(Gst gst) {
	this.gst = gst;
}

}
