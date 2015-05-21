package edu.lp1.sistemagestaoacademica.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setBounds(100, 100, 529, 399);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnUniversity.setBounds(61, 11, 400, 70);
		contentPane.add(btnUniversity);
		
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
		btnCourses.setBounds(61, 92, 400, 70);
		contentPane.add(btnCourses);
		
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
		btnStudent.setBounds(61, 173, 400, 70);
		contentPane.add(btnStudent);
		
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
		btnRegistration.setBounds(61, 254, 400, 70);
		contentPane.add(btnRegistration);
	}
}
