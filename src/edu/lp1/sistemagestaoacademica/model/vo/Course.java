/**
 * 
 */
package edu.lp1.sistemagestaoacademica.model.vo;

/**
 * @author Brendoon Ryos
 *
 */
public class Course {
	
	private String code = new String();
	private String title = new String();
	private Integer numCredits;
	private Integer maxStudents;
	
	public Course() {
		
	}
	
	public Course(String code, String title, Integer numCredits,
			Integer maxStudents) {
		this.code = code;
		this.title = title;
		this.numCredits = numCredits;
		this.maxStudents = maxStudents;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getNumCredits() {
		return numCredits;
	}
	public void setNumCredits(Integer numCredits) {
		this.numCredits = numCredits;
	}
	public Integer getMaxStudents() {
		return maxStudents;
	}
	public void setMaxStudents(Integer maxStudents) {
		this.maxStudents = maxStudents;
	}
	
	@Override
	public String toString(){
		return " \n|Código: "+code+" \n|Titulo: "+title+" \n|Número de Créditos: "+numCredits+" \n|Máximo de Estudantes: "+maxStudents;
	}
	
	
}
