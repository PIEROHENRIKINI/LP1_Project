package edu.lp1.sistemagestaoacademica.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JSplitPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTabbedPane;
import javax.swing.JMenuItem;
import javax.swing.JTable;

import edu.lp1.sistemagestaoacademica.controller.Control;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JRadioButtonMenuItem;

public class CRUDStudent extends JFrame {

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
	public void start3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUDStudent frame = new CRUDStudent();
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
	public CRUDStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50, 180, 20, 180));
		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(40, 492, 199, 56); // as propriedades do Botão
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main a = new Main();
				a.menu();
				setVisible(false);
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnVoltar);
		
		JButton btnNewButton = new JButton("Graduação");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(428, 122, 125, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pós Graduação");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNewButton_1.setBounds(563, 122, 118, 25);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(551, 182, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(551, 224, 114, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(551, 266, 114, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(551, 309, 114, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(551, 354, 114, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(469, 184, 70, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(469, 226, 70, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(469, 268, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(469, 311, 70, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(469, 356, 70, 15);
		contentPane.add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(551, 398, 114, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(551, 441, 114, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(469, 400, 70, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(469, 443, 70, 15);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.setBounds(579, 484, 102, 25);
		contentPane.add(btnNewButton_2);
		
		textField_7 = new JTextField();
		textField_7.setBounds(525, 39, 114, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Pesquisar");
		lblNewLabel_7.setBounds(452, 41, 87, 15);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(653, 33, 28, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(452, 484, 117, 25);
		contentPane.add(btnUpdate);
		
		
		
		
		/*
		 * long iD, String name, String address, String phone,
			String email) {
			
			
		 * 		String colunames[] = {"name","test","test","test"};
		Object[][] data = {
				
				{"bill","haha","hehe","lala"},
				{"marry","lol","hehe","lala"}
		};
		
		table = new JTable(data,colunames);
		 */
		
		
	}
}
