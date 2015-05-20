/**
 * 
 */
package edu.lp1.sistemagestaoacademica.model.vo;

/**
 * @author Brendoon Ryos
 *
 */
public abstract class Student {
	
	private long ID;
	private String name = new String();
	private String address = new String();
	private String phone = new String();
	private String email = new String();
		
	public Student() {
		
	}
	public Student(long iD, String name, String address, String phone,
			String email) {
		ID = iD;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public long getID() {
		return ID;
	}
	
	public void setID(long iD) {
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract boolean equals(Object obj);
	
	public String toString(){
		return " \n|ID: "+ID+" \n|Nome: "+name+" \n|Endereço: "+address+" \n|Telefone: "+phone+" \n|Email: "+email;
	}
	
	

}
