package edu.lp1.sistemagestaoacademica.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import edu.lp1.sistemagestaoacademica.controller.Control;
import edu.lp1.sistemagestaoacademica.model.vo.PostGraduateStudent;
import edu.lp1.sistemagestaoacademica.model.vo.UnderGraduateStudent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CRUDUnderGraduate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	Control c = new Control();
	/**
	 * Launch the application.
	 */
	public void startUnder() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUDUnderGraduate frame = new CRUDUnderGraduate();
					frame.setVisible(true);
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
	public CRUDUnderGraduate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CRUDStudent a = new CRUDStudent();
				a.start3();
				dispose();
				
			}
		});
		button.setBounds(102, 494, 199, 56);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Register");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				c.getUni().addUnderGraduateStudent(new UnderGraduateStudent(Long.parseLong(textField_3.getText()),textField_2.getText(),textField_1.getText(),textField.getText(),textField_5.getText(),textField_6.getText(),textField_7.getText()));
				JOptionPane.showMessageDialog(null,"Aluno de graduação adicionado");
				
			}
		});
		button_1.setBounds(480, 494, 216, 56);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Update");
		button_2.setBounds(304, 494, 175, 56);
		contentPane.add(button_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(272, 289, 240, 39);
		contentPane.add(textField);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPhone.setBounds(196, 289, 115, 39);
		contentPane.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setFont(new Font("Dialog", Font.BOLD, 15));
		lblAddress.setBounds(169, 243, 86, 35);
		contentPane.add(lblAddress);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(272, 239, 240, 39);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(272, 188, 240, 40);
		contentPane.add(textField_2);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Dialog", Font.BOLD, 15));
		lblName.setBounds(196, 188, 49, 35);
		contentPane.add(lblName);
		
		final JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Dialog", Font.BOLD, 15));
		lblId.setBounds(196, 138, 70, 35);
		contentPane.add(lblId);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(272, 138, 240, 40);
		contentPane.add(textField_3);
		
		JButton button_3 = new JButton("Search");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			textField_3.setText(String.valueOf(c.getUni().getStudent(Long.parseLong(textField_4.getText())).getID()));
			textField_2.setText(c.getUni().getStudent(Long.parseLong(textField_4.getText())).getName());
			textField_1.setText(c.getUni().getStudent(Long.parseLong(textField_4.getText())).getAddress());
			textField.setText(c.getUni().getStudent(Long.parseLong(textField_4.getText())).getPhone());
			textField_5.setText(c.getUni().getStudent(Long.parseLong(textField_4.getText())).getEmail());
			textField_6.setText(c.getUni().getStudent(Long.parseLong(textField_4.getText())).getMajor());
			textField_7.setText(c.getUni().getStudent(Long.parseLong(textField_4.getText())).getMinor());
		
			}
		});
		button_3.setBounds(330, 87, 117, 25);
		contentPane.add(button_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(304, 37, 175, 39);
		contentPane.add(textField_4);
		
		JLabel lblEnterStudentId = new JLabel("Enter Student ID");
		lblEnterStudentId.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEnterStudentId.setBounds(330, 11, 137, 15);
		contentPane.add(lblEnterStudentId);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(272, 339, 240, 39);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(272, 389, 240, 39);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(272, 439, 240, 39);
		contentPane.add(textField_7);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 15));
		lblEmail.setBounds(196, 346, 115, 39);
		contentPane.add(lblEmail);
		
		JLabel lblMajor = new JLabel("Major");
		lblMajor.setFont(new Font("Dialog", Font.BOLD, 15));
		lblMajor.setBounds(196, 396, 115, 39);
		contentPane.add(lblMajor);
		
		JLabel lblMnor = new JLabel("Minor");
		lblMnor.setFont(new Font("Dialog", Font.BOLD, 15));
		lblMnor.setBounds(196, 444, 115, 39);
		contentPane.add(lblMnor);
	}
}
