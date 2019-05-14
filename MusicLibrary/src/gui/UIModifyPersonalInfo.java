package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;

public class UIModifyPersonalInfo extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField surnameField;
	private JTextField numberField;
	private JTextField emailField;
	private JTextField bankNumberField;
	private JButton btnCancel;
	private JButton btnSubmit;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIModifyPersonalInfo frame = new UIModifyPersonalInfo();
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
	public UIModifyPersonalInfo() {
		setTitle("Modify personal info");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 454);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(20, 40, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(20, 82, 104, 14);
		contentPane.add(lblSurname);
		
		JLabel lblPhoneNumber = new JLabel("Phone number:");
		lblPhoneNumber.setBounds(20, 125, 104, 14);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("e-mail:");
		lblEmail.setBounds(20, 162, 65, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNewBankAccount = new JLabel("New bank account number:");
		lblNewBankAccount.setBounds(20, 201, 199, 14);
		contentPane.add(lblNewBankAccount);
		
		JLabel lblInsertNewPassword = new JLabel("Insert new password:");
		lblInsertNewPassword.setBounds(20, 243, 153, 14);
		contentPane.add(lblInsertNewPassword);
		
		nameField = new JTextField();
		nameField.setBounds(189, 37, 133, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		surnameField = new JTextField();
		surnameField.setBounds(189, 79, 133, 20);
		contentPane.add(surnameField);
		surnameField.setColumns(10);
		
		numberField = new JTextField();
		numberField.setBounds(188, 122, 134, 20);
		contentPane.add(numberField);
		numberField.setColumns(10);
		
		emailField = new JTextField();
		emailField.setBounds(188, 159, 134, 20);
		contentPane.add(emailField);
		emailField.setColumns(10);
		
		bankNumberField = new JTextField();
		bankNumberField.setBounds(188, 198, 134, 20);
		contentPane.add(bankNumberField);
		bankNumberField.setColumns(10);
		
		btnSubmit = new JButton("Save changes");
		btnSubmit.setBackground(new Color(255, 228, 196));
		btnSubmit.setBounds(28, 307, 115, 33);
		contentPane.add(btnSubmit);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(255, 228, 196));
		btnCancel.setBounds(188, 307, 115, 33);
		contentPane.add(btnCancel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(189, 240, 133, 20);
		contentPane.add(passwordField);
	}
}
