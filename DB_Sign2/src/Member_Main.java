



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Member_Main extends JFrame implements MouseListener,ActionListener{
	Vector v;
	Vector cols;
	DefaultTableModel model;
	JTable jTable;
	JScrollPane pane;
	JPanel pbtn;
	JButton btnInsert; 
	
	public Member_Main() {
		super("피트니스 회원 관리 0.1c");
		MemberDBDAO dao = new MemberDBDAO();
		v = dao.getMember_Main();
		System.out.println("v="+v);
		cols = getColumn();
		
		model = new DefaultTableModel(v,cols);
		jTable = new JTable(model);
		pane = new JScrollPane(jTable);
		add(pane);
		
		pbtn = new JPanel();
		btnInsert = new JButton("회원가입");
		pbtn.add(btnInsert);
		add(pbtn,BorderLayout.NORTH);
 		
		jTable.addMouseListener(this);//listener등록
		btnInsert.addActionListener(this);//회원가입 버튼 등록

		setSize(600,200);
		setVisible(true);
		setLocationRelativeTo(null); // 중앙에서 시작
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public Vector getColumn() { // 테이블 칼럼
		Vector col = new Vector();
		col.add("아이디");
		col.add("비밀번호");
		col.add("이름");
		col.add("전화번호");
		col.add("주소");
		col.add("생일");
		col.add("직업");
		col.add("성별");
		col.add("이메일");
		col.add("등록 날짜");
		col.add("만료 기간");
		
		return col;
	}
	public void jTableRefresh() { // 테이블 내용 갱신
		MemberDBDAO dao = new MemberDBDAO();
		DefaultTableModel model = new DefaultTableModel(dao.getMember_Main(),getColumn());
		jTable.setModel(model);

	}

	public static void main(String[] args) {
		new Member_Main();
		
	} // main
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int r = jTable.getSelectedRow();
		String id = (String) jTable.getValueAt(r, 0);
		MemberFrame mem = new MemberFrame(id,this); // 아이디 인자로 수정창 만들기
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 클릭
		if(e.getSource() == btnInsert) new MemberFrame(this);
		
		
	}

}