package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;

@SuppressWarnings("serial")
public class UIBoughtVinyls extends JFrame {

	private JPanel contentPane;
	private JButton btnVolverAlMen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIBoughtVinyls frame = new UIBoughtVinyls();
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
	public UIBoughtVinyls() {
		setTitle("Bought vinyls");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1028, 663);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBoughtVinyls = new JLabel("Bought vinyls:");
		lblBoughtVinyls.setForeground(new Color(160, 82, 45));
		lblBoughtVinyls.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBoughtVinyls.setBounds(451, 40, 134, 26);
		contentPane.add(lblBoughtVinyls);
		
		btnVolverAlMen = new JButton("Volver al men\u00FA");
		btnVolverAlMen.setBounds(451, 577, 134, 37);
		contentPane.add(btnVolverAlMen);
		
		String[] columnNames = { "Album Title", "Arrtist", "Genre", "Price", "On sale:" };

		Object[][] data = {
				{ "The Dark Side of the Moon'", "Pink Floyd", "Rock psicodélico", new Integer(5), new Boolean(false) },
				{ "London Calling", "The Clash", "New wave", new Integer(3), new Boolean(true) },
				{ "Shilling the Rubes", "David Bowie", "New wave", new Integer(2), new Boolean(false) },
				{ "Back in Black", "AC/DC", "Hard rock", new Integer(20), new Boolean(true) },
				{ "Nevermind", "Nirvana", "Grunge", new Integer(10), new Boolean(false) } };

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 91, 969, 444);
		contentPane.add(scrollPane);

		JTable table_1 = new JTable(data, columnNames);
		scrollPane.setViewportView(table_1);
	}
}
