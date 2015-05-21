
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

public class CRUDUniversity extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblDigiteONome;
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
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50, 180, 20, 180));
		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(92, 198, 121, 23);
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
		textField.setText("Mackenzie");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(127, 39, 175, 39);
		contentPane.add(textField);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					Main a = new Main();
					
					c.createUniversity(textField.getText());
					JOptionPane.showMessageDialog(null,"Alterações efetuadas com sucesso");
					a.menu();
					setVisible(false);
					
				} catch (Exception e) {
					System.out.println("Pardim passou por aqui");
				}

				
			}
		});
		btnSalvar.setBounds(225, 198, 129, 23);
		contentPane.add(btnSalvar);
		
		lblDigiteONome = new JLabel("Digite o Nome da universidade");
		lblDigiteONome.setBounds(101, 12, 226, 15);
		contentPane.add(lblDigiteONome);
	}
}
