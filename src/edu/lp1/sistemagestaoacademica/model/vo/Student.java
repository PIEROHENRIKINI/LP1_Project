/**
 * 
 */
package edu.lp1.sistemagestaoacademica.model.vo;

import com.jgoodies.common.base.Objects;


public abstract class Student {
	
	protected long ID;
	protected String name;
	protected String address;
	protected String phone;
	protected String email;
	protected String major;
	protected String minor;
	protected String thesisTitle;
	protected String supervisor;
	
		
	

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
	
	@Override
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(getClass()!=obj.getClass()){
			return false;
		}
		Student other = (Student)obj;
		if(!Objects.equals(this.ID, other.ID)){
			return false;
		}
		if(this.name!=other.name){
			return false;
		}
		if(this.address!=other.address){
			return false;
		}
		if(this.phone!=other.phone){
			return false;
		}
		if(this.email!=other.email){
			return false;
		}
		return true;
	}
	
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
