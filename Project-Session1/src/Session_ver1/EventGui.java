package Session_ver1;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EventGui extends JFrame{

	private static final long serialVersionUID = -711163588504124217L;
	
	public EventGui() {
		super(" 미정 "); // 상단바 Title 제목
	
		setSize(600,400);
		setLocationRelativeTo(null);
	// 가로,세로 길이 , null 은 중앙에서 시작 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// 닫기 버튼 누를때 어떻게 할지 설정 
	
	Container content = this.getContentPane();
	JPanel panel = new JPanel();
	JButton button = new JButton("시작");
	JTextField textfield = new JTextField(10); // 10글자 길이
	JLabel labelPeriod = new JLabel("5~10자 입력: ");
	JCheckBox checkBox = new JCheckBox("어떤 이벤트 ? ");
	
	checkBox.addChangeListener(new ChangeListener() {
		// 상태가 변하면 처리할 리스너
		
		@Override
		public void stateChanged(ChangeEvent e) {
			if(((JCheckBox)e.getSource()).isSelected()) {
				// 체크박스가 체크 되었다면. 이벤트 리턴,
				textfield.setText("랜덤");
				textfield.setEnabled(false);
			} else {
				textfield.setText("");
				textfield.setEnabled(true);
			}
		}
	});
	button.setMnemonic('S');  // 단축키 설정 s누르면 시작

	panel.add(button);
	panel.add(labelPeriod);
	panel.add(textfield);
	panel.add(checkBox);
	content.add(panel);
	
	setVisible(true); // 보이기 허용 
	
	
	}
}
