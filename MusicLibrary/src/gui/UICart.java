package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class UICart extends JFrame {

	private JPanel contentPane;
	private JButton btnConfirm;
	private JButton btnReturnToMenu;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnClearCart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UICart frame = new UICart();
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
	public UICart() {
		setTitle("Cart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1036, 658);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.setBackground(new Color(255, 250, 250));
		btnConfirm.setBounds(632, 557, 89, 23);
		contentPane.add(btnConfirm);
		
		btnReturnToMenu = new JButton("Return to menu");
		btnReturnToMenu.setBackground(new Color(255, 250, 250));
		btnReturnToMenu.setBounds(858, 557, 129, 23);
		contentPane.add(btnReturnToMenu);
		
		btnClearCart = new JButton("Clear cart");
		btnClearCart.setBackground(new Color(255, 250, 250));
		btnClearCart.setBounds(467, 557, 111, 23);
		contentPane.add(btnClearCart);
		
		JLabel lblNewLabel = new JLabel("Vinyls in your cart:");
		lblNewLabel.setForeground(new Color(160, 82, 45));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(430, 24, 148, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(88, 536, 46, 14);
		contentPane.add(lblPrice);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(88, 561, 46, 14);
		contentPane.add(lblDate);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(144, 533, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(144, 558, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		String[] columnNames = { "Album Title", "Arrtist", "Genre", "Price", "On sale:" };

		Object[][] data = {
				{ "The Dark Side of the Moon'", "Pink Floyd", "Rock psicodélico", new Integer(5), new Boolean(false) },
				{ "London Calling", "The Clash", "New wave", new Integer(3), new Boolean(true) },
				{ "Shilling the Rubes", "David Bowie", "New wave", new Integer(2), new Boolean(false) },
				{ "Back in Black", "AC/DC", "Hard rock", new Integer(20), new Boolean(true) },
				{ "Nevermind", "Nirvana", "Grunge", new Integer(10), new Boolean(false) } };

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 78, 960, 427);
		contentPane.add(scrollPane);

		JTable table_1 = new JTable(data, columnNames);
		scrollPane.setViewportView(table_1);
		
		JList list = new JList();
		scrollPane.setColumnHeaderView(list);
	}

}
