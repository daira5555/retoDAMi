package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UIMenuClient extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnModifyPersonalInfo;
	private JButton btnBoughtVinyls;
	private JButton btnBuySelected;
	private JRadioButton rdbtnThisWeek;
	private JRadioButton rdbtnThisMonth;
	private JRadioButton rdbtnThisYear;
	private JRadioButton rdbtnFromTheBegining;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIMenuClient frame = new UIMenuClient();
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
	public UIMenuClient() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 701);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 240, 230));
		contentPane.setForeground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// ImageIcon img= new ImageIcon();

		btnNewButton = new JButton("Advanced search");
		btnNewButton.setBackground(new Color(245, 222, 179));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(62, 23, 161, 37);
		contentPane.add(btnNewButton);

		btnModifyPersonalInfo = new JButton("Modify personal info");
		btnModifyPersonalInfo.setBackground(new Color(245, 222, 179));
		btnModifyPersonalInfo.setFont(new Font("Arial", Font.PLAIN, 13));
		btnModifyPersonalInfo.setBounds(62, 83, 161, 37);
		contentPane.add(btnModifyPersonalInfo);

		btnBoughtVinyls = new JButton("Bought vinyls");
		btnBoughtVinyls.setBackground(new Color(245, 222, 179));
		btnBoughtVinyls.setFont(new Font("Arial", Font.PLAIN, 13));
		btnBoughtVinyls.setBounds(62, 144, 161, 37);
		contentPane.add(btnBoughtVinyls);

		JLabel lblSuggestedVinylsFor = new JLabel("Suggested vinyls for you:");
		lblSuggestedVinylsFor.setForeground(new Color(188, 143, 143));
		lblSuggestedVinylsFor.setFont(new Font("Arial", Font.BOLD, 13));
		lblSuggestedVinylsFor.setBounds(556, 11, 171, 27);
		contentPane.add(lblSuggestedVinylsFor);

		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(281, 11, 2, 270);
		contentPane.add(separator_2);

		btnBuySelected = new JButton("Add to cart");
		btnBuySelected.setBackground(new Color(250, 240, 230));
		btnBuySelected.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBuySelected.setBounds(556, 615, 161, 37);
		contentPane.add(btnBuySelected);

		JSeparator separator = new JSeparator();
		separator.setBounds(38, 291, 228, 2);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(297, 291, 636, 2);
		contentPane.add(separator_1);

		JLabel lblBestSellers = new JLabel("Best sellers:");
		lblBestSellers.setForeground(new Color(188, 143, 143));
		lblBestSellers.setFont(new Font("Arial", Font.BOLD, 15));
		lblBestSellers.setBounds(423, 304, 134, 27);
		contentPane.add(lblBestSellers);

		rdbtnThisWeek = new JRadioButton("This week");
		rdbtnThisWeek.setBackground(new Color(250, 240, 230));
		rdbtnThisWeek.setBounds(62, 364, 109, 23);
		contentPane.add(rdbtnThisWeek);

		rdbtnThisMonth = new JRadioButton("This month");
		rdbtnThisMonth.setBackground(new Color(250, 240, 230));
		rdbtnThisMonth.setBounds(62, 406, 109, 23);
		contentPane.add(rdbtnThisMonth);

		rdbtnThisYear = new JRadioButton("This year");
		rdbtnThisYear.setBackground(new Color(250, 240, 230));
		rdbtnThisYear.setBounds(62, 447, 109, 23);
		contentPane.add(rdbtnThisYear);

		rdbtnFromTheBegining = new JRadioButton("From the begining of the times");
		rdbtnFromTheBegining.setBackground(new Color(250, 240, 230));
		rdbtnFromTheBegining.setBounds(62, 488, 221, 23);
		contentPane.add(rdbtnFromTheBegining);

		// LA PRIMERA

		String[] columnNames = { "Album Title", "Arrtist", "Genre", "Price", "On sale:" };

		Object[][] data = {
				{ "The Dark Side of the Moon'", "Pink Floyd", "Rock psicodélico", new Integer(5), new Boolean(false) },
				{ "London Calling", "The Clash", "New wave", new Integer(3), new Boolean(true) },
				{ "Shilling the Rubes", "David Bowie", "New wave", new Integer(2), new Boolean(false) },
				{ "Back in Black", "AC/DC", "Hard rock", new Integer(20), new Boolean(true) },
				{ "Nevermind", "Nirvana", "Grunge", new Integer(10), new Boolean(false) } };

		scrollPane = new JScrollPane();
		scrollPane.setBounds(302, 55, 605, 193);
		contentPane.add(scrollPane);

		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);

		// SEGUNDA

		String[] columnNames1 = { "Album Title", "Arrtist", "Genre", "Price", "On sale:" };

		Object[][] data1 = {
				{ "The Dark Side of the Moon'", "Pink Floyd", "Rock psicodélico", new Integer(5), new Boolean(false) },
				{ "London Calling", "The Clash", "New wave", new Integer(3), new Boolean(true) },
				{ "Shilling the Rubes", "David Bowie", "New wave", new Integer(2), new Boolean(false) },
				{ "Back in Black", "AC/DC", "Hard rock", new Integer(20), new Boolean(true) },
				{ "Nevermind", "Nirvana", "Grunge", new Integer(10), new Boolean(false) } };

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(302, 364, 610, 206);
		contentPane.add(scrollPane_1);

		table_1 = new JTable(data, columnNames);
		scrollPane_1.setViewportView(table_1);

	}
}
