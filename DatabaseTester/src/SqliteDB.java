import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class SqliteDB {
	Connection c = null;
	Statement stmt = null;
	
	SqliteDB(){
		
		//try to connect to database
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:AaronDB.sqlite");
		    System.out.println("Connection Successful!");		    
		
	}catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	}
	
 }
	
	public void printDb() {
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("Select * FROM table_data");
			
			while(rs.next()) {				
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String home = rs.getString("home");
				
				System.out.println(first_name + " " + last_name + " " + home);
			}
			
		}catch (Exception e) {
			
			System.out.println("Error: " + e.getMessage());
			
		}
	}//close printDb
	
	public void closeConnection(){
		try {
			c.close();
			
		} catch (Exception e) {
			
		}
	}

}
