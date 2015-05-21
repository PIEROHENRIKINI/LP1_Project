package edu.lp1.sistemagestaoacademica.controller;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

import edu.lp1.sistemagestaoacademica.model.vo.Course;
import edu.lp1.sistemagestaoacademica.model.vo.University;

public class Control {
	
	private static University uni;
	
	
	 public Course getDamnCourse(String code){
		 
		return uni.getCourse(code);
	}
	
	
	public void createUniversity(String name){
		
		uni = new University(name);
		
		
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
