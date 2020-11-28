package Account_ver1;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemberFrame extends JFrame implements ActionListener{
	JPanel p;
	JTextField tfId, tfName, tfAddr, tfEmail;
	JTextField tfTel1, tfTel2, tfTel3;
	JComboBox cbJob; // 잡
	JPasswordField pfPw; // 비번
	JTextField tfYear,tfMonth,tfDate; //생년월일
	JRadioButton rbMan,rbWoman; // 성별
	JTextArea taIntro; 
	JButton btnInsert,btnCancel,btnUpdate,btnDelete;
	// 가입,취소,수정,탈퇴
	
	GridBagLayout gb;
	GridBagConstraints gbc;
	
	public MemberFrame() { // 가입용생성자
	
	createUI(); // UI 작성해주는 메소드
	
	
	}
	public void createUI() {
		this.setTitle("회원정보");
		gb = new GridBagLayout();
		setLayout(gb);
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		// 아이디 
		JLabel bld = new JLabel("아이디 : ");
		tfId = new JTextField(20);
		
	}
	@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
	public Font getFont() {
		// TODO Auto-generated method stub
		return super.getFont();
	}




}
