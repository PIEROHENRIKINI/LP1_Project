/**
 * 
 */
package edu.lp1.sistemagestaoacademica.view;

import edu.lp1.sistemagestaoacademica.model.vo.Course;
import edu.lp1.sistemagestaoacademica.model.vo.UnderGraduateStudent;
import edu.lp1.sistemagestaoacademica.model.vo.University;

/**
 * @author Brendoon Ryos
 *
 */
public class Main1 {
	
	public static void main(String[] args){
		University mackenzie = new University("Mackenzie");
		
		mackenzie.addCourse(new Course("1","Ci�ncia da Computa��o",10,40));
		mackenzie.addCourse(new Course("2","Engenharia Aeroespacial",10,40));
		mackenzie.addCourse(new Course("3","Engenharia da Computa��o",10,40));
		mackenzie.addCourse(new Course("4","Engenharia Eletr�nica",10,40));
		
		mackenzie.addUnderGraduateStudent(new UnderGraduateStudent(41485718,"Brendoon Ryos","Rua Cardeal Arcoverde 2205","(11)94608-7215","brendoon-ryos@live.com","Engenharia","Computa��o"));
		mackenzie.addUnderGraduateStudent(new UnderGraduateStudent(41415478,"Hideki Higuch","Rua Butant�","(11)98485-7452","hideki.higuch@outlook.com","Engenharia","Computa��o"));
		
		mackenzie.registerStudent(41485718,"1");
		mackenzie.registerStudent(41415478,"1");
		
		System.out.println(mackenzie.getName());
		mackenzie.getCourseS();
		
		System.out.println(mackenzie.getStudent(41415478));
		
		System.out.println(mackenzie.getRegistration(41485718,"1"));
		
		System.out.println(mackenzie.getCourses(41485718));
		System.out.println(mackenzie.getStudents("1"));
		
		mackenzie.deRegisterStudent(41485718,"1");
		System.out.println(mackenzie.getStudents("1"));
		
		

	}

}
