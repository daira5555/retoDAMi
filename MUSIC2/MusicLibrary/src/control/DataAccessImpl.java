package control;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DataAccessImpl implements DataAccess {
	private Connection con;
	private PreparedStatement stmt;
	private String dbHost;
	private String dbName;
	private String dbUser;
	private String dbPassword;
	
	private void connect() throws ClassNotFoundException, SQLException, IOException {
		if (dbHost == null) {
			Properties config = new Properties();
			FileInputStream input = null;
			try {
				input = new FileInputStream("./resources/db.properties");
				config.load(input);
				dbHost = config.getProperty("ip");
				dbName = config.getProperty("dbname");
				dbUser = config.getProperty("username");
				dbPassword = config.getProperty("password");
			} finally {
				if (input != null)
					input.close();
			}
		}
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://" + dbHost + "/" + dbName + "?serverTimezone=Europe/Madrid";
		con = DriverManager.getConnection(url, dbUser, dbPassword);
	}
	
	private void disconnect() throws SQLException {
		if (stmt != null)
			stmt.close();
		if (con != null)
			con.close();
	}
	
	public void userType (String username) throws ClassNotFoundException, SQLException, IOException{
		try {
			connect();
			String sql = "insert into users values (?,'C')";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, username);
			stmt.executeUpdate();
		}finally {
			disconnect();
		}
	}
	
	public void registerClient (String username, String password, String name, String surname, String email, int phonenumber, String address, long accountnumber) throws ClassNotFoundException, SQLException, IOException{
		try {
			userType(username);
			connect();
			String sql = "insert into clients values (?,?,?,?,?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setString(3, name);
			stmt.setString(4, surname);
			stmt.setString(5, email);
			stmt.setInt(6, phonenumber);
			stmt.setString(7, address);
			stmt.setLong(8, accountnumber);
			stmt.executeUpdate();
		}finally {
			
			disconnect();
		}
	}
	
	public void modifyClientData (String username, String password, String name, String surname, String email, int phonenumber, String address, long accountnumber) throws ClassNotFoundException, SQLException, IOException{
		try {
			connect();
			String sql = "update clients set password=?, name=?, surname=?, email=?, phonenumber=?, address=?, accountnumber=? where username=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, password);
			stmt.setString(2, name);
			stmt.setString(3, surname);
			stmt.setString(4, email);
			stmt.setInt(5, phonenumber);
			stmt.setString(6, address);
			stmt.setLong(7, accountnumber);
			stmt.setString(8, username);
			stmt.executeUpdate();
		}finally {
			disconnect();
		}
	}
	
	public void insertNewVinyl(String title, int artistcode, int genrecode, double price, Date publicationdate, String description, boolean onsale, double salepercentage, int stock, String cover) throws ClassNotFoundException, SQLException, IOException{
		try {
			connect();
			String sql = "insert into vinyls (title,artiscode,genrecode,price,publicationdate,description,onsale,salepercentage,stock,amountsold,cover) values (?,?,?,?,?,?,?,?,?,0,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, title);
			stmt.setInt(2, artistcode);
			stmt.setInt(3, genrecode);
			stmt.setDouble(4, price);
			stmt.setDate(5, publicationdate);
			stmt.setString(6, description);
			stmt.setBoolean(7, onsale);
			stmt.setDouble(8, salepercentage);
			stmt.setInt(9, stock);
			stmt.setString(10, cover);
			stmt.executeUpdate();
		}finally {
			disconnect();
		}
	}
	
	public void insertNewArtist(String name) throws ClassNotFoundException, SQLException, IOException{
		
	}
	
	public void insertNewGenre(String genre) throws Exception{
		
		
	}
	
	public int artistExists(String name) throws Exception {
		int n=1;
		
		return n;
	}
	
	public int genreExists(String name) throws Exception{
		int n=1;
		
		return n;
	}
	
}
