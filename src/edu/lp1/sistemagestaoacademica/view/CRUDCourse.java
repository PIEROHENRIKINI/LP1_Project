package edu.lp1.sistemagestaoacademica.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CRUDCourse extends JFrame {

	private JPanel contentPane;
	private JTextField txtMackenzie;

	/**
	 * Launch the application.
	 */
	public void start2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUDCourse frame = new CRUDCourse();
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
	public CRUDCourse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50, 180, 20, 180));
		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(180, 218, 74, 23);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main a = new Main();
				a.menu();
				setVisible(false);
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnVoltar);
		
		txtMackenzie = new JTextField();
		txtMackenzie.setHorizontalAlignment(SwingConstants.CENTER);
		txtMackenzie.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtMackenzie.setText("Mackenzie");
		txtMackenzie.setBounds(129, 29, 175, 39);
		contentPane.add(txtMackenzie);
		txtMackenzie.setColumns(10);
	}
}
