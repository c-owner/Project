package MovieManager_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Movie extends JFrame{

	private Image screenImage;
	private Graphics screenGraphic;
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
//	private Image introBackground;
	private int mouseX, mouseY;
	
	private String userId;
	private int userPassword;
	private String adminId = "corner";
	private final String adminPW = "rodtmxj123";
	
	public Movie (){
//		setUndecorated(true); // 상태바인데 없앨지 말지 고민중 없애면 포토샵 또 해야함
		setTitle("Movie_Manager");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
//		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
//		Image introBackground = new ImageIcon(Main.class.getResource("../images/bg.jpg")).getImage();
		
	}
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}	
	// return = get
	public void setUserPW(int userPassword) { this.userPassword = userPassword; }
	public int getUserPW() { return userPassword; }
	
	
	
}

