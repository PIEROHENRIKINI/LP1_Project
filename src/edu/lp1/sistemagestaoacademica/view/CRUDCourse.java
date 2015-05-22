package edu.lp1.sistemagestaoacademica.view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.List;

import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

import edu.lp1.sistemagestaoacademica.controller.Control;
import edu.lp1.sistemagestaoacademica.model.vo.Course;
import edu.lp1.sistemagestaoacademica.model.vo.University;

public class CRUDCourse extends JFrame { // pra baixo rola a putaria de GUI toda

	private JPanel contentPane;
	private JTextField searchCourseTxt = new JTextField();
	private JTextField textFieldCod = new JTextField();
	private JTextField textFieldName = new JTextField();
	private JTextField textFieldCred = new JTextField();
	private JTextField textFieldMaxStu = new JTextField();
	
	Control c = new Control();
	

	/**
	 * Launch the application.
	 */
	public void start2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUDCourse frame = new CRUDCourse();
					frame.setVisible(true);
					frame.setResizable(false);
					//-------------Centraliza Janela--------------------
				    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
				    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
				    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
				    frame.setLocation(x, y);
				    //------------------Fim---------------------
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CRUDCourse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50, 180, 20, 180));
		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Back");
		btnVoltar.setBounds(66, 494, 199, 56); // as propriedades do Botão
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main a = new Main();
				a.menu();
				setVisible(false);
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnVoltar);
		
		searchCourseTxt = new JTextField();
		searchCourseTxt.setHorizontalAlignment(SwingConstants.CENTER);
		searchCourseTxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		searchCourseTxt.setBounds(268, 37, 175, 39);
		contentPane.add(searchCourseTxt);
		searchCourseTxt.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					// busca o Curso no array da classe University e joga nos campos de texto
						textFieldName.setText(c.getDamnCourse(Integer.parseInt(searchCourseTxt.getText())).getTitle());

						textFieldCod.setText(String.valueOf(c.getDamnCourse(Integer.parseInt(searchCourseTxt.getText())).getCode()));
	
						textFieldCred.setText(String.valueOf(c.getDamnCourse(Integer.parseInt(searchCourseTxt.getText())).getNumCredits()));
						
						textFieldMaxStu.setText(String.valueOf(c.getDamnCourse(Integer.parseInt(searchCourseTxt.getText())).getMaxStudents()));

						
				} catch (Exception e2) {
					System.out.println("not found"); // se rolar um erro qualquer da isso
				}
	
				
			}
		});
		btnNewButton.setBounds(294, 87, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
																		// Cadastra um Curso novo no array
				c.addCourse1(Integer.parseInt(textFieldCod.getText()),textFieldName.getText(),Integer.parseInt(textFieldCred.getText()),Integer.parseInt(textFieldMaxStu.getText()));
				
				JOptionPane.showMessageDialog(null,"add com sucesso");
			}
		});
		btnNewButton_1.setBounds(444, 494, 216, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnAtualizar = new JButton("Update");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // tenta atualizar o Curso ((sem sucesso)o problema não é aqui) 
				try {
					c.updateCourse1(Integer.parseInt(textFieldCod.getText()), c.getDamnCourse(Integer.parseInt(textFieldCod.getText())));

				} catch (Exception e2) {
					System.out.println("error");
				}
				
			}
		});
		btnAtualizar.setBounds(268, 347, 175, 56);
		contentPane.add(btnAtualizar);
		
		JLabel lblDigiteOCdigo = new JLabel("Enter Course Code");
		lblDigiteOCdigo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDigiteOCdigo.setBounds(286, 11, 216, 15);
		contentPane.add(lblDigiteOCdigo);
		
		textFieldCod = new JTextField();
		textFieldCod.setBounds(236, 138, 240, 40);
		contentPane.add(textFieldCod);
		textFieldCod.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(236, 188, 240, 40);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldCred = new JTextField();
		textFieldCred.setBounds(236, 239, 240, 39);
		contentPane.add(textFieldCred);
		textFieldCred.setColumns(10);
		
		textFieldMaxStu = new JTextField();
		textFieldMaxStu.setBounds(236, 289, 240, 39);
		contentPane.add(textFieldMaxStu);
		textFieldMaxStu.setColumns(10);
		
		JLabel lblCdigo = new JLabel("Code");
		lblCdigo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblCdigo.setBounds(133, 143, 70, 35);
		contentPane.add(lblCdigo);
		
		JLabel lblNewLabel = new JLabel("Title");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(133, 193, 49, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Credits");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(100, 243, 86, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Max Students");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_2.setBounds(133, 289, 115, 39);
		contentPane.add(lblNewLabel_2);
		
	}
}
