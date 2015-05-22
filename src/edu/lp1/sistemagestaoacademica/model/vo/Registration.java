/**
 * 
 */
package edu.lp1.sistemagestaoacademica.model.vo;

/**
 * @author Brendoon Ryos 
 *
 */
public class Registration {
	
	private Student student;
	private Course course;
	private Integer acadYear;
	private Integer semester;
	
	
	public Registration() {
		
	}


	public Registration(Student student, Course course, Integer acadYear,
			Integer semester) {
		this.student = student;
		this.course = course;
		this.acadYear = acadYear;
		this.semester = semester;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public Integer getAcadYear() {
		return acadYear;
	}


	public void setAcadYear(Integer acadYear) {
		this.acadYear = acadYear;
	}


	public Integer getSemester() {
		return semester;
	}


	public void setSemester(Integer semester) {
		this.semester = semester;
	}
	
	@Override
	public String toString(){
		return " \n|Estudante: \n"+student+" \n |Curso: "+course+" \n|Ano: "+acadYear+" \n|Semestre: "+semester; 
	}
	

}
