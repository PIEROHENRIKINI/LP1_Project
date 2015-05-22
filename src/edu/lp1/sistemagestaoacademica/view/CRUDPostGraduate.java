package edu.lp1.sistemagestaoacademica.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CRUDPostGraduate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUDPostGraduate frame = new CRUDPostGraduate();
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
	public CRUDPostGraduate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 734, 561);
		contentPane.add(panel);
		
		JButton button = new JButton("Back");
		button.setBounds(102, 494, 199, 56);
		panel.add(button);
		
		JButton button_1 = new JButton("Register");
		button_1.setBounds(480, 494, 216, 56);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Update");
		button_2.setBounds(304, 494, 175, 56);
		panel.add(button_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(272, 289, 240, 39);
		panel.add(textField);
		
		JLabel label = new JLabel("Phone");
		label.setFont(new Font("Dialog", Font.BOLD, 15));
		label.setBounds(183, 289, 115, 39);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Address");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Dialog", Font.BOLD, 15));
		label_1.setBounds(156, 243, 86, 35);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(272, 239, 240, 39);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(272, 188, 240, 40);
		panel.add(textField_2);
		
		JLabel label_2 = new JLabel("Name");
		label_2.setFont(new Font("Dialog", Font.BOLD, 15));
		label_2.setBounds(183, 188, 49, 35);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("ID");
		label_3.setFont(new Font("Dialog", Font.BOLD, 15));
		label_3.setBounds(183, 138, 70, 35);
		panel.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(272, 138, 240, 40);
		panel.add(textField_3);
		
		JButton button_3 = new JButton("Search");
		button_3.setBounds(330, 87, 117, 25);
		panel.add(button_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(304, 37, 175, 39);
		panel.add(textField_4);
		
		JLabel label_4 = new JLabel("Enter Student ID");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_4.setBounds(330, 11, 216, 15);
		panel.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(272, 339, 240, 39);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(272, 389, 240, 39);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(272, 439, 240, 39);
		panel.add(textField_7);
		
		JLabel label_5 = new JLabel("Email");
		label_5.setFont(new Font("Dialog", Font.BOLD, 15));
		label_5.setBounds(183, 346, 115, 39);
		panel.add(label_5);
		
		JLabel lblThesisTitle = new JLabel("Thesis Title");
		lblThesisTitle.setFont(new Font("Dialog", Font.BOLD, 15));
		lblThesisTitle.setBounds(183, 396, 115, 39);
		panel.add(lblThesisTitle);
		
		JLabel lblSupervisor = new JLabel("Supervisor");
		lblSupervisor.setFont(new Font("Dialog", Font.BOLD, 15));
		lblSupervisor.setBounds(183, 444, 115, 39);
		panel.add(lblSupervisor);
	}
}
