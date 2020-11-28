package Account_ver1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class MemberDAO {
	private static final String DRIVER = "ORACLE.JDBC.DRIVER.OracleDriver";
	private static final String URL = "jdbc.oracle:thin:@192.168.0.3:1521:ORCL";

	private static final String USER = "corner"; // DB ID
	private static final String PASS = "corner"; // DB PW

	Member_Main mMain;

	public MemberDAO() {	}
	public MemberDAO(Member_Main mMain) {
		this.mMain=mMain;
		System.out.println("DAO => "+mMain);
	}
	/* DB연결 메소드 */
	public Connection getConn() {
		Connection con = null;

		try {
			Class.forName(DRIVER); //드라이버 로딩
			con = DriverManager.getConnection(URL, USER, PASS);// 드라이버 연결!
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	// 회원 정보를 불러올 메소드 
	public MemberDTO getMemberDTO(String id) {
		MemberDTO dto = new MemberDTO();

		Connection con = null; // 연결
		PreparedStatement ps = null; // 명령 
		ResultSet rs = null; 	// 결과
		try {
			con = getConn();
			String sql = "select * from tb_member where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();

			if(rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setTel(rs.getString("tel"));
				dto.setAddr(rs.getString("Addr"));
				dto.setBirth(rs.getString("Birth"));
				dto.setJob(rs.getString("Job"));
				dto.setGender(rs.getString("Gender"));
				dto.setEmail(rs.getString("Email"));
				dto.setIntro(rs.getString("Intro"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

	// 출력 
	public Vector getMember_Main() {
		Vector data = new Vector(); // table
		Connection con = null; // 연결
		PreparedStatement ps = null; // 명령
		ResultSet rs = null; // 결 과 
		try {
			con = getConn();
			String sql = "select * from tb_member order by name sec ";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String addr = rs.getString("addr");
				String birth = rs.getString("birth");
				String gender = rs.getString("gender");
				String job = rs.getString("job");
				String email = rs.getString("eamil");
				String intro = rs.getString("Intro");
				
				Vector row = new Vector();
				row.add(id);
				row.add(pw);
				row.add(name);
				row.add(tel);
				row.add(addr);
				row.add(birth);
				row.add(gender);
				row.add(job);
				row.add(email);
				row.add(intro);
				
				data.add(row);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	// 회원가입 
	public boolean insertMember(MemberDTO dto) {
		boolean ok = false;
		
		Connection con = null; // 배열
		PreparedStatement ps = null; //명령
		try {
			con = getConn();
			String sql = "insert into tb_member("+
			"id,pw,name,tel,addr,birth,"+
			"job,gender,email,intro"+
			"values(?,?,?,?,?,?,?,?,?,?)";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getTel());
			ps.setString(5, dto.getAddr());
			ps.setString(6, dto.getBirth());
			ps.setString(7, dto.getGender());
			ps.setString(8, dto.getJob());
			ps.setString(9, dto.getEmail());
			ps.setString(10, dto.getIntro());
			int r = ps.executeUpdate(); // 실행한걸 저장!
			if ( r > 0 ) {
				System.out.println("성공");
				ok = true;
			} else { 
				System.out.println("가입 실패");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}
	// 회원정보 삭제 
	
	//  회원정보 삭제는,,delete하지말고 탈퇴여부만 체크하도록.
	public boolean deleteMember(String id,String pw) {
		boolean ok = false;
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConn();
			String sql = "delete from tb_member where id = ? and pw = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			int r = ps.executeUpdate(); 
			
			if ( r > 0 ) ok = true; 
			
		}catch (Exception e) {
			System.out.println(e + "-> 오류 발생 ");
		}
		return ok;
	}
	
	public void userSelectAll(DefaultTableModel model) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = getConn();
			String sql = "select * from tb_member order by name asc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
		// tableModel에 있는 데이터 지우기
		for (int i = 0; i < model.getRowCount();) {
			model.removeRow(0);
		}
		while(rs.next()) {
			Object data[] = {rs.getString(1),rs.getString(2),
					rs.getString(3),rs.getString(4),
					rs.getString(5),rs.getString(6),
					rs.getString(7),rs.getString(8),
					rs.getString(9),rs.getString(10)};
				model.addRow(data);
			}
		}catch (SQLException e) {
			System.out.println(e +"=> 실패");
		} finally {
			if (rs != null )
				try {
					rs.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			if (ps != null ) 
				try {
					ps.close();
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			if (con != null )
				try {
					con.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}


}
