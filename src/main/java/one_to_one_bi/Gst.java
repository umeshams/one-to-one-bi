package one_to_one_bi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Gst {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String gstid;
	@OneToOne
	@JoinColumn
	private Company company;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGstid() {
		return gstid;
	}
	public void setGstid(String gstid) {
		this.gstid = gstid;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
}
