package edu.lp1.sistemagestaoacademica.controller;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.ArrayList;

import edu.lp1.sistemagestaoacademica.model.vo.Course;
import edu.lp1.sistemagestaoacademica.model.vo.University;

public class Control {
	
	private static University uni; // Cria a variavel do tipo University para acessar os metodos da classe university
	
	
	public void addCourse1(int code,String title,int numCredits,int maxStudents){
		
		uni.addCourse(new Course(code, title, numCredits, maxStudents)); // usado para add curso
		
	}
	
	
	 public Course getDamnCourse(int i){
		 
		 System.out.print(uni.getCourse(100)); //pega o curso
		return uni.getCourse(i);
		
	}
	 
	 public void updateCourse1(int code,Course coursex){
		 uni.updateCourse(code, coursex);
		
	 }
	
	
	public void createUniversity(String name){
		
		uni = new University(name); // cria universidade
		
		
	}
	
	
	
	public University getUni() {
		return uni;
	}



	public void setUni(University uni) {
		this.uni = uni;
	}



	public void centerCode(Window frame){
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
	}


	
}
