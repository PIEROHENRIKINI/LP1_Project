package edu.lp1.sistemagestaoacademica.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import edu.lp1.sistemagestaoacademica.controller.Control;
import edu.lp1.sistemagestaoacademica.model.vo.Course;
import edu.lp1.sistemagestaoacademica.model.vo.University;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;

public class Main extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	
	
	public static Control c = new Control();
	public static void main(String[] args) {
		
		
		c.createUniversity("Default_name");
		c.getUni().addCourse(new Course(100,"Test",12,13));
		menu();
		
	}
	
	public static void menu(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setFont(new Font("Times New Roman", Font.BOLD, 16));
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\LP1_Project\\graduated.png"));
		setTitle("Sistema de Gest\u00E3o Acad\u00EAmica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    setLocation(x, y);
		
		JButton btnUniversity = new JButton("University");
		btnUniversity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CRUDUniversity a = new CRUDUniversity();
				a.start1();
				setVisible(false);
				
			}
		});
		btnUniversity.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnUniversity.setForeground(Color.BLUE);
		
		JButton btnCourses = new JButton("Course");
		btnCourses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CRUDCourse b = new CRUDCourse();
				b.start2();
				setVisible(false);
			}
		});
		btnCourses.setForeground(Color.BLUE);
		btnCourses.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JButton btnStudent = new JButton("Student");
		btnStudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnStudent.setForeground(Color.BLUE);
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CRUDStudent c = new CRUDStudent();
				c.start3();
				setVisible(false);
			}
		});
		
		JButton btnRegistration = new JButton("Registration");
		btnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CRUDRegistration d = new CRUDRegistration();
				d.start4();
				setVisible(false);
			}
		});
		btnRegistration.setForeground(Color.BLUE);
		btnRegistration.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.setLayout(new GridLayout(0, 4, 0, 0));
		contentPane.add(btnUniversity);
		contentPane.add(btnCourses);
		contentPane.add(btnStudent);
		contentPane.add(btnRegistration);
	}
}
