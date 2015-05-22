package edu.lp1.sistemagestaoacademica.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;

import edu.lp1.sistemagestaoacademica.controller.Control;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIDStudent;
	private JTextField textFieldName;
	private JTextField textFieldAddress;
	private JTextField textFieldPhone;
	
	Control c = new Control();

	/**
	 * Launch the application.
	 */
	public void start4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultStudent frame = new ConsultStudent();
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
	public ConsultStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldIDStudent = new JTextField();
		textFieldIDStudent.setColumns(10);
		textFieldIDStudent.setBounds(249, 84, 156, 26);
		contentPane.add(textFieldIDStudent);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(249, 122, 156, 26);
		contentPane.add(textFieldName);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(249, 160, 156, 26);
		contentPane.add(textFieldAddress);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(249, 198, 156, 26);
		contentPane.add(textFieldPhone);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CRUDRegistration a = new CRUDRegistration();
				JOptionPane.showMessageDialog(null,"Clique em OK para continuar");
				setVisible(false);
				a.setVisible(true);
			}
		});
		btnConfirm.setBounds(316, 276, 89, 23);
		contentPane.add(btnConfirm);
		
		JLabel lblStudentData = new JLabel("Student Data");
		lblStudentData.setBounds(291, 60, 89, 24);
		contentPane.add(lblStudentData);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(193, 90, 46, 14);
		contentPane.add(lblID);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(193, 128, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(193, 166, 58, 14);
		contentPane.add(lblAddress);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(193, 204, 46, 14);
		contentPane.add(lblPhone);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CRUDRegistration a = new CRUDRegistration();
				setVisible(false);
				a.setVisible(true);
				
			}
		});
		btnCancel.setBounds(193, 276, 89, 23);
		contentPane.add(btnCancel);
	}

}
