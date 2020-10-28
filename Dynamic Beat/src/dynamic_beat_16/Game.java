package dynamic_beat_16;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import dynamic_beat_3.Main;

public class Game extends Thread {

	private static final String String = null;
	private Image noteRouteLineImage = new ImageIcon(Main.class.getResource("../images/noteRouteLine.png")).getImage();
	private Image judgementLineImage = new ImageIcon(Main.class.getResource("../images/judgementLine.png")).getImage();
	private Image gameInfoImage = new ImageIcon(Main.class.getResource("../images/gameInfo.png")).getImage();
	private Image noteRouteAImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteNum1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteNum2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteNum3Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	
	private Image blueFlareImage;
	private Image judgeImage;
	
	private Image keyPadAImage = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	private Image keyPadSImage = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	private Image keyPadDImage = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	private Image keyPadSpace1Image = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	private Image keyPadSpace2Image = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	private Image keyPadNum1Image = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	private Image keyPadNum2Image = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	private Image keyPadNum3Image = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	
	private String titleName;
	private String difficulty;
	private String musicTitle;
	private Music gameMusic;

	ArrayList<Note> noteList = new ArrayList<Note>();

	public Game(String titleName, String difficulty, String musicTitle) {
		this.titleName = titleName;
		this.difficulty = difficulty;
		this.musicTitle = musicTitle;
		gameMusic = new Music(this.musicTitle, false);

	}

	public void screenDraw(Graphics2D g) {
		g.drawImage(noteRouteAImage, 228, 30, null);
		g.drawImage(noteRouteSImage, 332, 30, null);
		g.drawImage(noteRouteDImage, 436, 30, null);
		g.drawImage(noteRouteSpace1Image, 540, 30, null);
		g.drawImage(noteRouteSpace2Image, 640, 30, null);
		g.drawImage(noteRouteNum1Image, 744, 30, null);
		g.drawImage(noteRouteNum2Image, 848, 30, null);
		g.drawImage(noteRouteNum3Image, 952, 30, null);
		g.drawImage(noteRouteLineImage, 224, 30, null);
		g.drawImage(noteRouteLineImage, 328, 30, null);
		g.drawImage(noteRouteLineImage, 432, 30, null);
		g.drawImage(noteRouteLineImage, 536, 30, null);
		g.drawImage(noteRouteLineImage, 740, 30, null);
		g.drawImage(noteRouteLineImage, 844, 30, null);
		g.drawImage(noteRouteLineImage, 948, 30, null);
		g.drawImage(noteRouteLineImage, 1052, 30, null);

		g.drawImage(gameInfoImage, 0, 660, null);
		g.drawImage(judgementLineImage, 0, 580, null);
		for (int i = 0; i < noteList.size(); i++) {
			Note note = noteList.get(i);
			if(note.getY() > 620 ) {
				judgeImage = new ImageIcon(Main.class.getResource("../images/judgeMiss.png")).getImage();
			}
			if(!note.isProceeded()) {
				noteList.remove(i);
				i--;
			} else {
				note.screenDraw(g);
			}
		}
		g.setColor(Color.white);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString(titleName, 20, 702); // 곡에 대한 정보
		g.drawString(difficulty, 1190, 702);
		g.setColor(Color.DARK_GRAY);
		g.drawString("A", 270, 609);
		g.drawString("S", 374, 609);
		g.drawString("D", 478, 609);
		g.drawString("Space Bar", 580, 609);
		g.drawString("NUM1", 755, 609);
		g.drawString("NUM2", 860, 609);
		g.drawString("NUM3", 960, 609);
		g.setColor(Color.LIGHT_GRAY);
		g.setFont(new Font("Elephant", Font.BOLD, 30));
		g.drawString("000000", 565, 702);
		g.drawImage(blueFlareImage, 150, 430, null);
		g.drawImage(judgeImage, 460, 420, null);
		g.drawImage(keyPadAImage, 228, 580, null);
		g.drawImage(keyPadSImage, 332, 580, null);
		g.drawImage(keyPadDImage, 436, 580, null);
		g.drawImage(keyPadSpace1Image, 540, 580, null);
		g.drawImage(keyPadSpace2Image, 640, 580, null);
		g.drawImage(keyPadNum1Image, 744, 580, null);
		g.drawImage(keyPadNum2Image, 848, 580, null);
		g.drawImage(keyPadNum3Image, 952, 580, null);

	}

	public void pressA() {
		judge("A");
		noteRouteAImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		keyPadAImage = new ImageIcon(Main.class.getResource("../images/keyPadPressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}

	public void releaseA() {
		noteRouteAImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		keyPadAImage = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	}

	public void pressS() {
		judge("S");
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		keyPadSImage = new ImageIcon(Main.class.getResource("../images/keyPadPressed.png")).getImage();
		new Music("drumSmall2.mp3", false).start();
	}

	public void releaseS() {
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		keyPadSImage = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	}

	public void pressD() {
		judge("D");
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		keyPadDImage = new ImageIcon(Main.class.getResource("../images/keyPadPressed.png")).getImage();
		new Music("drumSmall3.mp3", false).start();
	}

	public void releaseD() {
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		keyPadDImage = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	}

	public void pressSpace() {
		judge("Space");
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		keyPadSpace1Image = new ImageIcon(Main.class.getResource("../images/keyPadPressed.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		keyPadSpace2Image = new ImageIcon(Main.class.getResource("../images/keyPadPressed.png")).getImage();
		// new Music("drum kick.mp3", false).start();
	}

	public void releaseSpace() {
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		keyPadSpace1Image = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		keyPadSpace2Image = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	}

	public void pressNum1() {
		judge("1");
		noteRouteNum1Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		keyPadNum1Image = new ImageIcon(Main.class.getResource("../images/keyPadPressed.png")).getImage();
//		new Music("drumBig1.mp3", false).start();
	}

	public void releaseNum1() {
		noteRouteNum1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		keyPadNum1Image = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	}

	public void pressNum2() {
		judge("2");
		noteRouteNum2Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		keyPadNum2Image = new ImageIcon(Main.class.getResource("../images/keyPadPressed.png")).getImage();
//		new Music("drumBig2.mp3", false).start();
	}

	public void releaseNum2() {
		noteRouteNum2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		keyPadNum2Image = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	}

	public void pressNum3() {
		judge("3");
		noteRouteNum3Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		keyPadNum3Image = new ImageIcon(Main.class.getResource("../images/keyPadPressed.png")).getImage();
//		new Music("drumBig3.mp3", false).start();
	}

	public void releaseNum3() {
		noteRouteNum3Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		keyPadNum3Image = new ImageIcon(Main.class.getResource("../images/keyPadBasic.png")).getImage();
	}

	@Override
	public void run() {
		dropNotes(this.titleName);
	}

	public void close() {
		gameMusic.close();
		this.interrupt();
	}

	public void dropNotes(String titleName) {
		Beat[] beats = null;
		if (titleName.equals("Avenged Sevenfold - Afterlife") && difficulty.equals("Easy")) {
			int startTime = 15460 - Main.REACH_TIME * 1000;
			int gap = 110; // 박자의 간격
			beats = new Beat[] { new Beat(startTime + gap * 2, "D"), new Beat(startTime + gap * 4, "S"),
					new Beat(startTime + gap * 6, "D"), new Beat(startTime + gap * 8, "S"),
					new Beat(startTime + gap * 8, "A"), new Beat(startTime + gap * 10, "1"),
					new Beat(startTime + gap * 12, "2"), new Beat(startTime + gap * 14, "1"),
					new Beat(startTime + gap * 18, "3"), new Beat(startTime + gap * 20, "1"),
					new Beat(startTime + gap * 22, "D"), new Beat(startTime + gap * 22, "3"),
					new Beat(startTime + gap * 24, "S") };
		} else if (titleName.equals("Avenged Sevenfold - Afterlife") && difficulty.equals("Hard")) {
			int startTime = 4460 - Main.REACH_TIME * 1000;
			int gap = 125; // 박자의 간격
			beats = new Beat[] { new Beat(startTime + gap * 2, "D"), new Beat(startTime + gap * 4, "S"),
					new Beat(startTime + gap * 6, "D"), new Beat(startTime + gap * 8, "S"),
					new Beat(startTime + gap * 8, "A"), new Beat(startTime + gap * 10, "1"),
					new Beat(startTime + gap * 12, "2"), new Beat(startTime + gap * 14, "1"),
					new Beat(startTime + gap * 18, "3"), new Beat(startTime + gap * 20, "1"),
					new Beat(startTime + gap * 22, "D"), new Beat(startTime + gap * 22, "3"),
					new Beat(startTime + gap * 24, "S") };
		} else if (titleName.equals("Avenged Sevenfold - Hail To The King") && difficulty.equals("Easy")) {
			int startTime = 11000 - Main.REACH_TIME * 1000;
			int gap = 115; // 박자의 간격
			beats = new Beat[] { 
					new Beat(startTime + gap, "D"),
					new Beat(startTime + gap * 9, "D"), 
					new Beat(startTime + gap * 18, "D"),
					new Beat(startTime + gap * 27, "D"),
					new Beat(startTime + gap * 36, "D"),
					new Beat(startTime + gap * 45, "D"),
					new Beat(startTime + gap * 54, "D"),
					new Beat(startTime + gap * 63, "D"),
					new Beat(startTime + gap * 72, "D"),
					new Beat(startTime + gap * 72, "Space"),
					new Beat(startTime + gap * 81, "D"), 
					new Beat(startTime + gap * 81, "Space"),
					new Beat(startTime + gap * 90, "D"), 
					new Beat(startTime + gap * 90, "Space"),
					new Beat(startTime + gap * 99, "D"), 
					new Beat(startTime + gap * 99, "Space"),
					new Beat(startTime + gap * 108, "D"), 
					new Beat(startTime + gap * 108, "Space"),
					new Beat(startTime + gap * 117, "D"), 
					new Beat(startTime + gap * 117, "Space"),
					new Beat(startTime + gap * 126, "D"), 
					new Beat(startTime + gap * 126, "Space"),
					new Beat(startTime + gap * 135, "D"), 
					new Beat(startTime + gap * 135, "Space"),
					new Beat(startTime + gap * 143, "D"), 
					new Beat(startTime + gap * 143, "Space"),
					new Beat(startTime + gap * 152, "D"), 
					new Beat(startTime + gap * 152, "Space"),
					new Beat(startTime + gap * 161, "D"), 
					new Beat(startTime + gap * 161, "Space"),
					new Beat(startTime + gap * 169, "D"), 
					new Beat(startTime + gap * 169, "Space"),
					new Beat(startTime + gap * 177, "D"), 
					new Beat(startTime + gap * 177, "Space"),
					new Beat(startTime + gap * 187, "D"), 
					new Beat(startTime + gap * 187, "Space"),
					new Beat(startTime + gap * 196, "D"), 
					new Beat(startTime + gap * 196, "Space"), // 15회 
					new Beat(startTime + gap * 200, "1"),  // 
					new Beat(startTime + gap * 202, "Space"),
					new Beat(startTime + gap * 204, "2"), 
					new Beat(startTime + gap * 206, "Space"),
					new Beat(startTime + gap * 208, "3"), 
					new Beat(startTime + gap * 210, "Space"),
					new Beat(startTime + gap * 212, "2"), 
					new Beat(startTime + gap * 214, "Space"),
					new Beat(startTime + gap * 216, "1"), 
					new Beat(startTime + gap * 218, "Space"),
					new Beat(startTime + gap * 220, "3"), 
					new Beat(startTime + gap * 224, "Space"),
					new Beat(startTime + gap * 226, "3"), 
					new Beat(startTime + gap * 228, "Space"),
					new Beat(startTime + gap * 230, "3"), 
					new Beat(startTime + gap * 232, "Space"),
					new Beat(startTime + gap * 234, "3"), 
					new Beat(startTime + gap * 236, "A"),
					new Beat(startTime + gap * 238, "Space"), 
					new Beat(startTime + gap * 240, "S"),
					new Beat(startTime + gap * 242, "Space"), 
					new Beat(startTime + gap * 244, "D"),
					new Beat(startTime + gap * 246, "Space"), 
					new Beat(startTime + gap * 248, "2"),
					new Beat(startTime + gap * 250, "Space"), 
					new Beat(startTime + gap * 252, "2"),
					new Beat(startTime + gap * 254, "Space"), 
					new Beat(startTime + gap * 256, "D"),
					new Beat(startTime + gap * 258, "3"),
					new Beat(startTime + gap * 258, "D"),
					new Beat(startTime + gap * 260, "3"),
					new Beat(startTime + gap * 260, "Space"),
					new Beat(startTime + gap * 262, "D"),
					new Beat(startTime + gap * 264, "D"),
					new Beat(startTime + gap * 264, "2"),
					new Beat(startTime + gap * 266, "D"),
					new Beat(startTime + gap * 268, "D"),
					new Beat(startTime + gap * 268, "Space"),
					new Beat(startTime + gap * 270, "D"),
					new Beat(startTime + gap * 272, "D"),
					new Beat(startTime + gap * 272, "Space"),
					new Beat(startTime + gap * 274, "D"),
					new Beat(startTime + gap * 276, "D"),
					new Beat(startTime + gap * 276, "Space"),
					new Beat(startTime + gap * 278, "D"),
					new Beat(startTime + gap * 280, "D"),
					new Beat(startTime + gap * 280, "Space"),
					new Beat(startTime + gap * 282, "D"),
					new Beat(startTime + gap * 284, "D"),
					new Beat(startTime + gap * 286, "Space"),
					new Beat(startTime + gap * 288, "D"),
					new Beat(startTime + gap * 288, "Space"),
					new Beat(startTime + gap * 290, "D"),
					new Beat(startTime + gap * 290, "Space"),
					new Beat(startTime + gap * 292, "D"),
					new Beat(startTime + gap * 292, "Space"),
					new Beat(startTime + gap * 294, "D"),
					new Beat(startTime + gap * 294, "Space"),
					
					
			};  
		}else if (titleName.equals("Avenged Sevenfold - Hail To The King") && difficulty.equals("Hard")) {
			int startTime = 4460 - Main.REACH_TIME * 1000;
			int gap = 125; // 박자의 간격
			beats = new Beat[] { 	
					new Beat(startTime + gap, "D"),
					new Beat(startTime + gap * 9, "D"), 
					new Beat(startTime + gap * 18, "D"),
					new Beat(startTime + gap * 27, "D"),
					new Beat(startTime + gap * 36, "D"),
					new Beat(startTime + gap * 45, "D"),
					new Beat(startTime + gap * 54, "D"),
					new Beat(startTime + gap * 63, "D"),
					new Beat(startTime + gap * 72, "D"),
					new Beat(startTime + gap * 72, "Space"),
					new Beat(startTime + gap * 81, "D"), 
					new Beat(startTime + gap * 81, "Space"),
					new Beat(startTime + gap * 90, "D"), 
					new Beat(startTime + gap * 90, "Space"),
					new Beat(startTime + gap * 99, "D"), 
					new Beat(startTime + gap * 99, "Space"),
					new Beat(startTime + gap * 108, "D"), 
					new Beat(startTime + gap * 108, "Space"),
					new Beat(startTime + gap * 117, "D"), 
					new Beat(startTime + gap * 117, "Space"),
					new Beat(startTime + gap * 126, "D"), 
					new Beat(startTime + gap * 126, "Space"),
					new Beat(startTime + gap * 135, "D"), 
					new Beat(startTime + gap * 135, "Space"),
					new Beat(startTime + gap * 144, "D"), 
					new Beat(startTime + gap * 144, "Space"),
					new Beat(startTime + gap * 153, "D"), 
					new Beat(startTime + gap * 153, "Space"),
					new Beat(startTime + gap * 162, "D"), 
					new Beat(startTime + gap * 162, "Space"),
					new Beat(startTime + gap * 170, "D"), 
					new Beat(startTime + gap * 170, "Space"),
					new Beat(startTime + gap * 179, "D"), 
					new Beat(startTime + gap * 179, "Space"),
					new Beat(startTime + gap * 187, "D"), 
					new Beat(startTime + gap * 187, "Space"),
					new Beat(startTime + gap * 198, "D"), 
					new Beat(startTime + gap * 198, "Space"),
					new Beat(startTime + gap * 207, "D"), 
					new Beat(startTime + gap * 207, "Space"),
			};
		}
		else if (titleName.equals("Sum41 - Still Waiting") && difficulty.equals("Easy")) {
			int startTime = 4460 - Main.REACH_TIME * 1000;
			int gap = 125; // 박자의 간격
			beats = new Beat[] { new Beat(startTime + gap * 2, "D"), new Beat(startTime + gap * 4, "S"),
					new Beat(startTime + gap * 6, "D"), new Beat(startTime + gap * 8, "S"),
					new Beat(startTime + gap * 8, "A"), new Beat(startTime + gap * 10, "1"),
					new Beat(startTime + gap * 12, "2"), new Beat(startTime + gap * 14, "1"),
					new Beat(startTime + gap * 18, "3"), new Beat(startTime + gap * 20, "1"),
					new Beat(startTime + gap * 22, "D"), new Beat(startTime + gap * 22, "3"),
					new Beat(startTime + gap * 24, "S") };
		} else if (titleName.equals("Sum41 - Still Waiting") && difficulty.equals("Hard")) {
			int startTime = 4460 - Main.REACH_TIME * 1000;
			int gap = 125; // 박자의 간격
			beats = new Beat[] { new Beat(startTime + gap * 2, "D"), new Beat(startTime + gap * 4, "S"),
					new Beat(startTime + gap * 6, "D"), new Beat(startTime + gap * 8, "S"),
					new Beat(startTime + gap * 8, "A"), new Beat(startTime + gap * 10, "1"),
					new Beat(startTime + gap * 12, "2"), new Beat(startTime + gap * 14, "1"),
					new Beat(startTime + gap * 18, "3"), new Beat(startTime + gap * 20, "1"),
					new Beat(startTime + gap * 22, "D"), new Beat(startTime + gap * 22, "3"),
					new Beat(startTime + gap * 24, "S") };
		}
		int i = 0;
		gameMusic.start();
		while (i < beats.length && !isInterrupted()) 
		{
			boolean dropped = false;
			if (beats[i].getTime() <= gameMusic.getTime()) {
				Note note = new Note(beats[i].getNoteName());
				note.start();
				noteList.add(note);
				i++;
				dropped = true;
			}
			if(!dropped) {
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					
				}
			}
		}
	}
	
	public void judge(String input) {
		for(int i= 0; i< noteList.size(); i++) {
			Note note = noteList.get(i);
			if(input.equals(note.getNoteType())) {
				judgeEvent(note.judge());
				break;
			}
		}
	}
	
	public void judgeEvent(String judge) {
		if(!judge.equals("None")) {
			blueFlareImage = new ImageIcon(Main.class.getResource("../images/blueFlare.png")).getImage();
		}
		if(judge.equals("Miss")) {
			judgeImage = new ImageIcon(Main.class.getResource("../images/judgeMiss.png")).getImage();
		}
		else if(judge.equals("Late")) {
			judgeImage = new ImageIcon(Main.class.getResource("../images/judgeLate.png")).getImage();
		}
		else if(judge.equals("Good")) {
			judgeImage = new ImageIcon(Main.class.getResource("../images/judgeGood.png")).getImage();
		}
		else if(judge.equals("Great")) {
			judgeImage = new ImageIcon(Main.class.getResource("../images/judgeGreat.png")).getImage();
		}
		else if(judge.equals("Perfect")) {
			judgeImage = new ImageIcon(Main.class.getResource("../images/judgePerfect.png")).getImage();
		}
		else if(judge.equals("Early")) {
			judgeImage = new ImageIcon(Main.class.getResource("../images/judgeEarly.png")).getImage();
		}
	}

}

