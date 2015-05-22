package edu.lp1.sistemagestaoacademica.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultCourse extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public void startConsultCourse(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultCourse frame = new ConsultCourse();
					frame.setVisible(true);
					frame.setResizable(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultCourse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCourseData = new JLabel("Course Data");
		lblCourseData.setBounds(209, 11, 89, 24);
		contentPane.add(lblCourseData);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setBounds(111, 41, 46, 14);
		contentPane.add(lblCode);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(167, 35, 156, 26);
		contentPane.add(textField);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(111, 79, 46, 14);
		contentPane.add(lblTitle);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(167, 73, 156, 26);
		contentPane.add(textField_1);
		
		JLabel lblCreditsNumber = new JLabel("Credits Number");
		lblCreditsNumber.setBounds(83, 117, 81, 14);
		contentPane.add(lblCreditsNumber);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(167, 111, 156, 26);
		contentPane.add(textField_2);
		
		JLabel lblMax = new JLabel("Max Students");
		lblMax.setBounds(83, 155, 74, 14);
		contentPane.add(lblMax);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(167, 149, 156, 26);
		contentPane.add(textField_3);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CRUDRegistration a = new CRUDRegistration();
				setVisible(false);
				a.setVisible(true);
			}
		});
		button.setBounds(111, 227, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Confirm");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CRUDRegistration a = new CRUDRegistration();
				JOptionPane.showMessageDialog(null,"Clique em OK para continuar");
				setVisible(false);
				a.setVisible(true);
			}
		});
		button_1.setBounds(234, 227, 89, 23);
		contentPane.add(button_1);
	}
}
