
package edu.lp1.sistemagestaoacademica.view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JLabel;

import edu.lp1.sistemagestaoacademica.controller.Control;
import javax.swing.JTable;

public class CRUDUniversity extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblDigiteONome;
	Control c = new Control();
	private JTable table;
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
		textField.setBounds(301, 12, 160, 28);
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
		btnSalvar.setBounds(301, 45, 160, 28);
		contentPane.add(btnSalvar);
		
		lblDigiteONome = new JLabel("Nome da Universidade");
		lblDigiteONome.setBounds(301, 0, 166, 15);
		contentPane.add(lblDigiteONome);
		
		table = new JTable();
		table.setBounds(95, 80, 565, 339);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(321, 431, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(105, 431, 117, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(543, 431, 117, 25);
		contentPane.add(btnNewButton_2);
	}
}
