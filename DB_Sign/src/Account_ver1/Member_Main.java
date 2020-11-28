package Account_ver1;

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
		super("회원 0.1a");
		MemberDAO dao = new MemberDAO();
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public Vector getColumn() {
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
		col.add("자기소개");
		
		return col;
	}
	public void jTableRefresh() {
		MemberDAO dao = new MemberDAO();
		DefaultTableModel model = new DefaultTableModel(dao.getMember_Main(),getColumn());
		jTable.setModel(model);
	}

	public static void main(String[] args) {
		new Member_Main();
	} // main
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
