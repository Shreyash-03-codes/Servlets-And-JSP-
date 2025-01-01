package servlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Users {
	
	private final String url="jdbc:mysql://localhost:3306/signuplogin";
	private final String user="root";
	private final String pass="shreyash@2005";
	
	 Connection connection=null;
	
	Users(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		
		catch(ClassNotFoundException e){
			
		}
		try{
			connection=DriverManager.getConnection(url,user,pass);
		}
		catch(SQLException e) {
			
		}
	}
	
	public int insert(String name,String email,String pass,String gender,String mobile) {
		
		String query="INSERT INTO users(email,name,pass,gender,mobile) VALUES (?,?,?,?,?);";
		try {
			PreparedStatement pt=connection.prepareStatement(query);
			pt.setString(1, email);
			pt.setString(2, name);
			pt.setString(3, pass);
			pt.setString(4, gender);
			pt.setString(5, mobile);
			int re=pt.executeUpdate();
			return re>0?1:0;
			
		}
		catch(SQLException e) {
			return 0;
		}
		
	}
	
public boolean checkUser(String email,String pass) {
		
		String query="SELECT * FROM users WHERE email=? AND pass=?;";
		try {
			PreparedStatement pt=connection.prepareStatement(query);
			pt.setString(1, email);
			pt.setString(2, pass);
			
			
			ResultSet rs=pt.executeQuery();
			if(rs.next()) {
				return true;
			}
			else {
				return false;
			}
			
		}
		catch(SQLException e) {
			return false;
		}
		
	}
}
