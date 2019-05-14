package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class UIAdvancedSearchClient extends JFrame {

	private JPanel contentPane;
	private JTextField artistField;
	private JTextField albumTitleField;
	private JTextField genreField;
	private JTextField publicationDateField;
	private JTextField priceField;
	private JButton btnBuySelected;
	private JButton btnGoToCart;
	private JButton btnReturnToMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIAdvancedSearchClient frame = new UIAdvancedSearchClient();
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
	public UIAdvancedSearchClient() {
		setTitle("Advanced search");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1126, 689);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblByArtist = new JLabel("By artist:");
		lblByArtist.setBounds(84, 45, 75, 14);
		contentPane.add(lblByArtist);
		
		JLabel lblByAlbumTitle = new JLabel("By album title:");
		lblByAlbumTitle.setBounds(84, 87, 147, 14);
		contentPane.add(lblByAlbumTitle);
		
		JLabel lblByGenre = new JLabel("By genre:");
		lblByGenre.setBounds(781, 45, 58, 14);
		contentPane.add(lblByGenre);
		
		JLabel lblByPublicationDate = new JLabel("By publication date:");
		lblByPublicationDate.setBounds(781, 87, 116, 14);
		contentPane.add(lblByPublicationDate);
		
		JLabel lblByPrice = new JLabel("By price: ");
		lblByPrice.setBounds(781, 130, 58, 14);
		contentPane.add(lblByPrice);
		
		artistField = new JTextField();
		artistField.setBounds(179, 42, 107, 20);
		contentPane.add(artistField);
		artistField.setColumns(10);
		
		albumTitleField = new JTextField();
		albumTitleField.setBounds(179, 84, 107, 20);
		contentPane.add(albumTitleField);
		albumTitleField.setColumns(10);
		
		genreField = new JTextField();
		genreField.setBounds(907, 42, 107, 20);
		contentPane.add(genreField);
		genreField.setColumns(10);
		
		publicationDateField = new JTextField();
		publicationDateField.setBounds(907, 84, 107, 20);
		contentPane.add(publicationDateField);
		publicationDateField.setColumns(10);
		
		priceField = new JTextField();
		priceField.setBounds(907, 127, 107, 20);
		contentPane.add(priceField);
		priceField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(44, 194, 1056, 2);
		contentPane.add(separator);
		
		btnBuySelected = new JButton("Add to cart");
		btnBuySelected.setBounds(494, 573, 116, 42);
		contentPane.add(btnBuySelected);
		
		btnGoToCart = new JButton("Go to cart");
		btnGoToCart.setBounds(326, 573, 123, 42);
		contentPane.add(btnGoToCart);
		
		btnReturnToMenu = new JButton("Return to menu");
		btnReturnToMenu.setBounds(649, 573, 137, 42);
		contentPane.add(btnReturnToMenu);
		
		String[] columnNames = {"Album Title",
                "Arrtist",
                "Genre",
                "Price",
                "On sale:"};

Object[][] data = {
{"The Dark Side of the Moon'", "Pink Floyd",
"Rock psicodélico", new Integer(5), new Boolean(false)},
{"London Calling", "The Clash",
"New wave", new Integer(3), new Boolean(true)},
{"Shilling the Rubes", "David Bowie",
"New wave", new Integer(2), new Boolean(false)},
{"Back in Black", "AC/DC",
"Hard rock", new Integer(20), new Boolean(true)},
{"Nevermind", "Nirvana",
"Grunge", new Integer(10), new Boolean(false)}
};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(84, 236, 930, 277);
		contentPane.add(scrollPane);
		
		JTable table_1 = new JTable(data,columnNames);
		scrollPane.setViewportView(table_1);
	}
}
