package Test;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {
	@Id
	int id;
	private String firtsname,lastname;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String firtsname, String lastname) {
		super();
		this.id = id;
		this.firtsname = firtsname;
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirtsname() {
		return firtsname;
	}
	public void setFirtsname(String firtsname) {
		this.firtsname = firtsname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
