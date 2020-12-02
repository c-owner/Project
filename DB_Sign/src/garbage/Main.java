package garbage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/MemberDB";
		String username = "root";
		String password = "0008";
		String DRIVER = "com.mysql.cj.jdbc.Driver";
	try {
		Class.forName(DRIVER);
		conn = (Connection) DriverManager.getConnection(url,username,password);
		
		System.out.println("connected!!");
	}catch (SQLException e) {
		System.out.println("not connected to database");
		throw new Error("Error",e);
	} finally {
		try {
			if ( conn!=null ) {
				conn.close();
			}
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
		

	}

}
