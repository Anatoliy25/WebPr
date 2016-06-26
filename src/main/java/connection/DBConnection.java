package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private String host;
	private String root;
	private String password;
	private String nameDb;
	private String url;
	
	private Properties properties = new Properties();
	private Connection mysqlConnect;
	
	public DBConnection(String host, String root, String password, String nameDb){
		this.host = host;
		this.root = root;
		this.password = password;
		this.nameDb = nameDb;
	}
	
	public void initProperties(){
		
		url = "jdbc:mysql://" + host +"/" + nameDb;
		properties.setProperty("user", root);
		properties.setProperty("password", root);
		properties.setProperty("characterEncoding", "UTF-8");
		properties.setProperty("useUnicode", "true");
		
		System.out.print("URL: " + url);
		
	}
	
	public void init(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			mysqlConnect = DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}

