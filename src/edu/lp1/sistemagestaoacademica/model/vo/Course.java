package edu.lp1.sistemagestaoacademica.model.vo;

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

	public Course() {
		// TODO Auto-generated constructor stub
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

	public boolean equals(Object obj) {
		return false;
	}
	
	@Override
	public String toString() {
		 return this.code+"  "+ this.title +"  "+ this.maxStudents +"  "+ this.numCredits;
		
		
	}
	

}