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

public class CRUDCourse extends JFrame {

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
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50, 180, 20, 180));
		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(40, 492, 199, 56);
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
		searchCourseTxt.setBounds(243, 26, 175, 39);
		contentPane.add(searchCourseTxt);
		searchCourseTxt.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
						textFieldName.setText(c.getDamnCourse(Integer.parseInt(searchCourseTxt.getText())).getTitle());

						textFieldCod.setText(String.valueOf(c.getDamnCourse(Integer.parseInt(searchCourseTxt.getText())).getCode()));
	
						textFieldCred.setText(String.valueOf(c.getDamnCourse(Integer.parseInt(searchCourseTxt.getText())).getNumCredits()));
						
						textFieldMaxStu.setText(String.valueOf(c.getDamnCourse(Integer.parseInt(searchCourseTxt.getText())).getMaxStudents()));


				} catch (Exception e2) {
					System.out.println("not found");
				}
	
				//Buscar Curso
			}
		});
		btnNewButton.setBounds(275, 70, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				c.addCourse1(Integer.parseInt(textFieldCod.getText()),textFieldName.getText(),Integer.parseInt(textFieldCred.getText()),Integer.parseInt(textFieldMaxStu.getText()));
				
				JOptionPane.showMessageDialog(null,"add com sucesso");
			}
		});
		btnNewButton_1.setBounds(443, 493, 216, 56);
		contentPane.add(btnNewButton_1);
		
		JLabel lblDigiteOCdigo = new JLabel("Digite o Código do Curso");
		lblDigiteOCdigo.setBounds(243, -1, 216, 15);
		contentPane.add(lblDigiteOCdigo);
		
		textFieldCod = new JTextField();
		textFieldCod.setBounds(262, 157, 156, 26);
		contentPane.add(textFieldCod);
		textFieldCod.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(262, 195, 156, 26);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldCred = new JTextField();
		textFieldCred.setBounds(262, 233, 156, 26);
		contentPane.add(textFieldCred);
		textFieldCred.setColumns(10);
		
		textFieldMaxStu = new JTextField();
		textFieldMaxStu.setBounds(262, 271, 156, 26);
		contentPane.add(textFieldMaxStu);
		textFieldMaxStu.setColumns(10);
		
		JLabel lblCdigo = new JLabel("Código");
		lblCdigo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblCdigo.setBounds(169, 162, 70, 15);
		contentPane.add(lblCdigo);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(169, 199, 49, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Créditos");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(132, 232, 86, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Max Aluno");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_2.setBounds(137, 276, 115, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(262, 343, 156, 56);
		contentPane.add(btnAtualizar);
	}
}
