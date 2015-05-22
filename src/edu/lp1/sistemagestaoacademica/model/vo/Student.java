/**
 * 
 */
package edu.lp1.sistemagestaoacademica.model.vo;


public abstract class Student {
	
	protected long ID;
	protected String name = new String();
	protected String address = new String();
	protected String phone = new String();
	protected String email = new String();
	protected String major = new String();
	protected String minor = new String();
	protected String thesisTitle = new String();
	protected String supervisor = new String();
	
		
	

	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMinor() {
		return minor;
	}
	public void setMinor(String minor) {
		this.minor = minor;
	}
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
	public String getThesisTitle() {
		// TODO Auto-generated method stub
		return thesisTitle;
	}
	public String getSupervisor() {
		// TODO Auto-generated method stub
		return supervisor;
	}
	
	

}
