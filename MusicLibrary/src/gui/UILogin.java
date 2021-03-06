package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;

public class UILogin extends JFrame {

	private JPanel contentPane;
	private JButton btnLogIn;
	private JButton btnSignUp;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UILogin frame = new UILogin();
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
	public UILogin() {
		setTitle("Log in");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 250);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 235, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.BOLD, 13));
		lblUsername.setBounds(116, 11, 77, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 13));
		lblPassword.setBounds(115, 77, 67, 14);
		contentPane.add(lblPassword);
		
		btnLogIn = new JButton("Log in ");
		btnLogIn.setBackground(new Color(255, 228, 181));
		btnLogIn.setFont(new Font("Arial", Font.BOLD, 11));
		btnLogIn.setBounds(43, 148, 89, 23);
		contentPane.add(btnLogIn);
		
		btnSignUp = new JButton("Sign up");
		btnSignUp.setBackground(new Color(255, 228, 181));
		btnSignUp.setFont(new Font("Arial", Font.BOLD, 11));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignUp.setBounds(152, 148, 89, 23);
		contentPane.add(btnSignUp);
		
		usernameField = new JTextField();
		usernameField.setBounds(48, 36, 193, 23);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(48, 103, 193, 23);
		contentPane.add(passwordField);
	}
}
