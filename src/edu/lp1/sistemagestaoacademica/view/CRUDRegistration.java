package edu.lp1.sistemagestaoacademica.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import edu.lp1.sistemagestaoacademica.controller.Control;

import java.awt.Toolkit;

public class CRUDRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	Control c = new Control();
	/**
	 * Launch the application.
	 */
	public void start4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUDRegistration frame = new CRUDRegistration();
					frame.setVisible(true);
					frame.setResizable(false);
					c.centerCode(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CRUDRegistration() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\LP1_Project\\graduated.png"));
		setTitle("Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50, 180, 20, 180));
		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(96, 342, 162, 49);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main a = new Main();
				a.menu();
				setVisible(false);
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnVoltar);
		
		textField = new JTextField();
		textField.setBounds(198, 54, 176, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(198, 117, 176, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(198, 173, 176, 33);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(198, 224, 176, 33);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID Student");
		lblNewLabel.setBounds(119, 55, 100, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblCodeCourse = new JLabel("Code Course");
		lblCodeCourse.setBounds(119, 117, 73, 33);
		contentPane.add(lblCodeCourse);
		
		JLabel lblAcademicSemester = new JLabel("Academic Year");
		lblAcademicSemester.setBounds(96, 173, 107, 33);
		contentPane.add(lblAcademicSemester);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setBounds(117, 224, 79, 33);
		contentPane.add(lblSemester);
		
		JButton btnNewButton = new JButton("Consult");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(383, 53, 89, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Consult");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(383, 117, 89, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(310, 342, 162, 49);
		contentPane.add(btnRegistrar);
	}
}
