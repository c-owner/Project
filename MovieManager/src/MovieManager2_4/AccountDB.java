package MovieManager2_4;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.db.DBConn;

public class AccountDB {
	
	public int insertData(AccountDB dto) {
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		
	}
}
