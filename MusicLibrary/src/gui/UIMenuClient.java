package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import model.Vinyl;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.Component;

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
	 * @throws SQLException 
	 */
	public UIMenuClient() throws SQLException {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 705);
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
		btnNewButton.setBounds(62, 60, 161, 37);
		contentPane.add(btnNewButton);

		btnModifyPersonalInfo = new JButton("Modify personal info");
		btnModifyPersonalInfo.setBackground(new Color(245, 222, 179));
		btnModifyPersonalInfo.setFont(new Font("Arial", Font.PLAIN, 13));
		btnModifyPersonalInfo.setBounds(62, 127, 161, 37);
		contentPane.add(btnModifyPersonalInfo);

		btnBoughtVinyls = new JButton("Bought vinyls");
		btnBoughtVinyls.setBackground(new Color(245, 222, 179));
		btnBoughtVinyls.setFont(new Font("Arial", Font.PLAIN, 13));
		btnBoughtVinyls.setBounds(62, 196, 161, 37);
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
		btnBuySelected.setBackground(new Color(255, 218, 185));
		btnBuySelected.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBuySelected.setBounds(526, 594, 161, 37);
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
		lblBestSellers.setBounds(564, 326, 134, 27);
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
		ArrayList <Vinyl> vinilos = new ArrayList<Vinyl>();
		
		
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://" + "192.168.20.119" + "/" + "music_library" + "?serverTimezone=Europe/Madrid";
			con = DriverManager.getConnection(url, "Daira&Co", "abcd*1234");
		} catch (Exception e) {
			e.printStackTrace();
		}

		PreparedStatement stmt = null;
		ResultSet rs = null;
		int cont=0;
		try {
			String sqlString = "select * from vinyls, artists where artists.artistcode=vinyls.artistcode";
		//	stmt = con.createStatement();
			stmt = con.prepareStatement(sqlString);
			rs = stmt.executeQuery();
			while(rs.next()) {
				// route=rs.getString("COVER");
				Vinyl temp = new Vinyl();
				temp.setVinylCode(rs.getInt("vinylcode"));
				temp.setTitle(rs.getString("title"));
				temp.setArtistCode(rs.getInt("artistcode"));
				temp.setArtistName(rs.getString("name"));
				temp.setGenreCode(rs.getInt("genrecode"));
				temp.setPrice(rs.getDouble("price"));
				temp.setPublicationDate(rs.getDate("publicationdate"));
				temp.setDescription(rs.getString("description"));
				temp.setOnSale(rs.getBoolean("onsale"));
				temp.setSalePercentage(rs.getDouble("salepercentage"));
				temp.setStock(rs.getInt("stock"));
				temp.setAmountSold(rs.getInt("amountsold"));
				temp.setCover(rs.getString("cover"));
				vinilos.add(temp);
				cont++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
		}
		
		for (Vinyl vinyl : vinilos) {
			System.out.println(vinyl.getVinylCode()+" "+vinyl.getCover()+" "+vinyl.isOnSale()+" "+vinyl.getPublicationDate());
		}
//		JLabel label = new JLabel();
//
//		Image imagen = new ImageIcon(route).getImage();
//		ImageIcon imagen2 = new ImageIcon(imagen.getScaledInstance(100, 100, imagen.SCALE_SMOOTH));
//
//		label.setIcon(imagen2);
//		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setVerticalAlignment(JLabel.CENTER);

		String[] columnNames = { "image", "Album Title", "Artist", "Genre", "Price", "On sale:", "Sale percentage:" };

		Object[][] data = new Object[cont][7];
		
		for(int i=0; i<cont; i++) {
			
			JLabel label = new JLabel();

			Image imagen = new ImageIcon(vinilos.get(i).getCover()).getImage();
			ImageIcon imagen2 = new ImageIcon(imagen.getScaledInstance(100, 100, imagen.SCALE_SMOOTH));

			label.setIcon(imagen2);
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setVerticalAlignment(JLabel.CENTER);
			
			data[i][0] =label;
			
			data[i][1] =vinilos.get(i).getTitle();
			data[i][2] =vinilos.get(i).getArtistName();
			data[i][3] =vinilos.get(i).getGenreCode();
			data[i][4] =vinilos.get(i).getPrice();
			data[i][5] =vinilos.get(i).isOnSale();
			data[i][6] =vinilos.get(i).getSalePercentage();
			
		}

		scrollPane = new JScrollPane();
		scrollPane.setBounds(302, 55, 718, 206);
		contentPane.add(scrollPane);

		table = new JTable(data, columnNames);
	



		table.getColumn("image").setCellRenderer(new LabelRenderer());

		scrollPane.setViewportView(table);

		// SEGUNDA

		String[] columnNames1 = { "image", "Album Title", "Arrtist", "Genre", "Price", "On sale:", "Sale percentage:" };

//		Object[][] data1 = {
//				{ label, "The Dark Side of the Moon'", "Pink Floyd", "Rock psicodélico", new Integer(20),
//						new Boolean(false), new Integer(20) },
//				{ label, "London Calling", "The Clash", "New wave", new Integer(22), new Boolean(true),
//						new Integer(20) },
//				{ label, "Shilling the Rubes", "David Bowie", "New wave", new Integer(21), new Boolean(false),
//						new Integer(20) },
//				{ label, "Back in Black", "AC/DC", "Hard rock", new Integer(20), new Boolean(true), new Integer(20) },
//				{ label, "Nevermind", "Nirvana", "Grunge", new Integer(21), new Boolean(false), new Integer(20) } };

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(302, 364, 718, 219);
		contentPane.add(scrollPane_1);

		table_1 = new JTable(data, columnNames);
		table_1.getColumn("image").setCellRenderer(new LabelRenderer());

		scrollPane_1.setViewportView(table_1);

	}

	class LabelRenderer implements TableCellRenderer {
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			TableColumn tc = table.getColumn("image");
			tc.setMinWidth(100);
			tc.setMaxWidth(100);
			table.setRowHeight(100);

			return (Component) value;
		}

	}
}
