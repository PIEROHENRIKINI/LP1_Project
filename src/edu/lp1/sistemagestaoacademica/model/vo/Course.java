package edu.lp1.sistemagestaoacademica.model.vo;

import java.util.Objects;

public class Course {

	private int code;

	private String title;

	private int numCredits;

	private int maxStudents;


	public Course(int code, String title, int numCredits,
			int maxStudents) {
		super();
		this.code = code;
		this.title = title;
		this.numCredits = numCredits;
		this.maxStudents = maxStudents;
	}

	public int getCode() {
		
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumCredits() {
		return numCredits;
	}

	public void setNumCredits(int numCredits2) {
		this.numCredits = numCredits2;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(getClass()!=obj.getClass()){
			return false;
		}
		Course other = (Course)obj;
		if(!Objects.equals(this.code,other.code)){
			return false;
		}
		if(this.title!=other.title){
			return false;
		}
		if(this.numCredits!=other.numCredits){
			return false;
		}
		if(this.maxStudents!=other.maxStudents){
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		 return this.code+"  "+ this.title +"  "+ this.maxStudents +"  "+ this.numCredits;
		
	}
}