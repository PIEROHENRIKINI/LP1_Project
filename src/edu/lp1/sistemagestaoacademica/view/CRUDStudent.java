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
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class CRUDStudent extends JFrame {

	private JPanel contentPane;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\LP1_Project\\graduated.png"));
		setTitle("Student Type");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50, 180, 20, 180));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("UnderGraduate");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(122, 199, 210, 79);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PostGraduate");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(392, 199, 210, 79);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("Back");
		button.setBounds(258, 452, 199, 56);
		contentPane.add(button);
		
		
		
		
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
