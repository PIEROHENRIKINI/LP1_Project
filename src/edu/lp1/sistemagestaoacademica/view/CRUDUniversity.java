
package edu.lp1.sistemagestaoacademica.view;


import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.JLabel;

import edu.lp1.sistemagestaoacademica.controller.Control;
import edu.lp1.sistemagestaoacademica.model.vo.Course;

import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class CRUDUniversity extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblDigiteONome;
	JTextArea textArea = new JTextArea();

	Control c = new Control();
	
	
	/**
	 * Launch the application.
	 */
	public void start1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUDUniversity frame = new CRUDUniversity();
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
	public CRUDUniversity() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\LP1_Project\\graduated.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50, 180, 20, 180));
		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(27, 507, 166, 41);
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
		textField.setText(c.getUni().getName());
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(307, 34, 160, 28);
		contentPane.add(textField);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					Main a = new Main();
					
					c.createUniversity(textField.getText());
					JOptionPane.showMessageDialog(null,"Alterações efetuadas com sucesso");
					
				} catch (Exception e) {
					System.out.println("Pardim passou por aqui");
				}

				
			}
		});
		btnSalvar.setBounds(307, 63, 160, 28);
		contentPane.add(btnSalvar);
		
		lblDigiteONome = new JLabel("Nome da Universidade");
		lblDigiteONome.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDigiteONome.setBounds(311, 11, 166, 15);
		contentPane.add(lblDigiteONome);
		
        
		
		    
		
		JButton btnNewButton = new JButton("Alunos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(324, 453, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Courses");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
			
				List<Course> courses = new ArrayList<Course>();
				
				for(Course a: courses){
				textArea.append(a.getTitle()+"\n");
				}
				
				
			}
		});
		btnNewButton_1.setBounds(108, 453, 117, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Registrations");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(546, 453, 117, 25);
		contentPane.add(btnNewButton_2);
		
		textArea.setBounds(103, 96, 560, 328);
		contentPane.add(textArea);
		

		


		
	}
}
