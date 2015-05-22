/**
 * 
 */
package edu.lp1.sistemagestaoacademica.model.vo;

import java.util.ArrayList;
import java.util.List;

public class University {
	
	private String name = new String();
	private List<Course> courses = new ArrayList<Course>();
	private List<Student> students = new ArrayList<Student>();
	private List<Registration> registrations = new ArrayList<Registration>();
	
	public University() {
		
	}
	
	public University(String name){
		this.name = name;
	}

	public University(String name, List<Course> courses, List<Student> students,
			List<Registration> registrations) {
		this.name = name;
		this.courses = courses;
		this.students = students;
		this.registrations = registrations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public List<Course> getCourses() {
		return courses;
	}
	
	public void getCourseS(){
		for (Course course : courses) {
			System.out.println("|Código: "+course.getCode()+" |Titulo: "+course.getTitle()+" |Número de Créditos: "+course.getNumCredits()+" |Máximo de Estudantes: "+course.getMaxStudents()+"\n");
		}
	}
	
	public Course getCourse(int i) {
		for(Course a: courses){
			if(a.getCode()==i){         // done
				return a;
			}
		}
		return null;
	}
	
	public ArrayList<Course> getCourses(long studentID){
		ArrayList<Course> courses = new ArrayList<Course>();
		for (Registration registration : registrations) {
			if(registration.getStudent().getID()==studentID){
				courses.add(registration.getCourse());
			}
		}
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public  boolean addCourse(Course course){
		try {
			this.courses.add(course);
			return true;
		} catch (Exception e) {
			return false;
		} finally{
			System.out.println("Curso adicionado com sucesso.");
		}
		
	}
	
	public boolean updateCourse(int i,Course coursex){
		try {
			 
			for (Course a : courses) {
				if(a.getCode()==i){         // done
					courses.remove(a);
					courses.add(coursex);
				}
			}
			 
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<Student> getStudents() {
		return students;
	}

	public Student getStudent(long ID){
		for (Student student : students) {
			if(student.getID()==ID){
				return student;
			}
		}
		return null;
	}
	
	public ArrayList<Student> getStudents(int courseCode){
		ArrayList<Student> students = new ArrayList<Student>();
		for (Registration registration : registrations) {
			if(registration.getCourse().getCode()==courseCode){
				students.add(registration.getStudent());
			}
		}
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public boolean addUnderGraduateStudent(UnderGraduateStudent UnderGraduateStudent){
		try {
				this.students.add(UnderGraduateStudent);
				return true;
		} catch (Exception e) {
			System.out.println("Erro ao adicionar estudante de graduação.");
			return false;
		} finally{
			System.out.println("Estudante de graduação adicionado com sucesso.");
		}
	}
	
	public boolean updateUnderGraduateStudent(long ID,UnderGraduateStudent UnderGraduateStudent){
		try {
			for (Student student : students) {
				if((student instanceof UnderGraduateStudent)&&(student.getID()==ID)){
					students.remove(student);
					students.add(UnderGraduateStudent);
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean addPostGraduateStudent(PostGraduateStudent PostGraduateStudent){
		try {
				this.students.add(PostGraduateStudent);
				return true;
		} catch (Exception e) {
			System.out.println("Erro ao adicionar estudante de pós-graduação.");
			return false;
		} finally{
			System.out.println("Estudante de pós-graduação adicionado com sucesso.");
		}
	}
	
	public boolean updatePostGraduateStudent(long ID,PostGraduateStudent PostGraduateStudent){
		try {
			for (Student student : students) {
				if((student instanceof PostGraduateStudent)&&(student.getID()==ID)){
					students.remove(student);
					students.add(PostGraduateStudent);
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<Registration> getRegistrations() {
		return registrations;
	}
	
	public Registration getRegistration(long studentID, int courseCode){
		for (Registration registration : registrations) {
			if((registration.getStudent().getID()==studentID)&&(registration.getCourse().getCode()==courseCode)){
				return registration;
			}
		}
		return null;
	}

	public void setRegistrations(List<Registration> registrations) {
		this.registrations = registrations;
	}
	
	public boolean registerStudent(long studentID, int codeCourse){
		Course coursex = null;
		Student studentx = null;
		for (Course course : courses) {
			if(course.getCode()==codeCourse){
				coursex = course;
			}
		}
		
		for (Student student : students) {
			if(student.getID()==studentID){
				studentx = student;
			}
		}
		registrations.add(new Registration(studentx,coursex,2015,2));
		if((coursex!=null)&&(studentx!=null)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean deRegisterStudent(long studentID, int codeCourse){
		for (Registration registration : registrations) {
			if((registration.getCourse().getCode()==codeCourse)&&(registration.getStudent().getID()==studentID)){
				registrations.remove(registration);
				return true;
			}
		}
		
		return false;
	}

}
