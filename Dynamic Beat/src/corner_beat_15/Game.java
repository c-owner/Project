package corner_beat_15;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import corner_beat_3.Main;

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
		g.drawString(titleName, 20, 702); // � ���� ����
		g.drawString(difficulty, 1190, 702);
		g.setColor(Color.DARK_GRAY);
		g.drawString("A", 270, 609);
		g.drawString("S", 374, 609);
		g.drawString("D", 478, 609);
		g.drawString("Space Bar", 580, 609);
		g.drawString("NUM1", 755, 609);
		g.drawString("NUM2", 860, 609);
		g.drawString("NUM3", 960, 609);

		g.setFont(new Font("Elephant", Font.BOLD, 30));
		g.drawString("000000", 565, 702);

	}

	public void pressA() {
		judge("A");
		noteRouteAImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}

	public void releaseA() {
		noteRouteAImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressS() {
		judge("S");
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}

	public void releaseS() {
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressD() {
		judge("D");
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}

	public void releaseD() {
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressSpace() {
		judge("Space");
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumBig1.mp3", false).start();
	}

	public void releaseSpace() {
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressNum1() {
		judge("1");
		noteRouteNum1Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}

	public void releaseNum1() {
		noteRouteNum1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressNum2() {
		judge("2");
		noteRouteNum2Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}

	public void releaseNum2() {
		noteRouteNum2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressNum3() {
		judge("3");
		noteRouteNum3Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}

	public void releaseNum3() {
		noteRouteNum3Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
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
			int gap = 110; // ������ ����
			beats = new Beat[] { new Beat(startTime + gap * 2, "D"), new Beat(startTime + gap * 4, "S"),
					new Beat(startTime + gap * 6, "D"), new Beat(startTime + gap * 8, "S"),
					new Beat(startTime + gap * 8, "A"), new Beat(startTime + gap * 10, "1"),
					new Beat(startTime + gap * 12, "2"), new Beat(startTime + gap * 14, "1"),
					new Beat(startTime + gap * 18, "3"), new Beat(startTime + gap * 20, "1"),
					new Beat(startTime + gap * 22, "D"), new Beat(startTime + gap * 22, "3"),
					new Beat(startTime + gap * 24, "S") };
		} else if (titleName.equals("Avenged Sevenfold - Afterlife") && difficulty.equals("Hard")) {
			int startTime = 4460 - Main.REACH_TIME * 1000;
			int gap = 125; // ������ ����
			beats = new Beat[] { new Beat(startTime + gap * 2, "D"), new Beat(startTime + gap * 4, "S"),
					new Beat(startTime + gap * 6, "D"), new Beat(startTime + gap * 8, "S"),
					new Beat(startTime + gap * 8, "A"), new Beat(startTime + gap * 10, "1"),
					new Beat(startTime + gap * 12, "2"), new Beat(startTime + gap * 14, "1"),
					new Beat(startTime + gap * 18, "3"), new Beat(startTime + gap * 20, "1"),
					new Beat(startTime + gap * 22, "D"), new Beat(startTime + gap * 22, "3"),
					new Beat(startTime + gap * 24, "S") };
		} else if (titleName.equals("Avenged Sevenfold - Hail To The King") && difficulty.equals("Easy")) {
			int startTime = 4460 - Main.REACH_TIME * 1000;
			int gap = 125; // ������ ����
			beats = new Beat[] { new Beat(startTime + gap * 1, "A"), new Beat(startTime + gap * 3, "D"),
					new Beat(startTime + gap * 5, "A"), new Beat(startTime + gap * 7, "S"),
					new Beat(startTime + gap * 9, "A"), new Beat(startTime + gap * 11, "1"),
					new Beat(startTime + gap * 13, "2"), new Beat(startTime + gap * 15, "1"),
					new Beat(startTime + gap * 18, "3"), new Beat(startTime + gap * 20, "1"),
					new Beat(startTime + gap * 22, "D"), 
					new Beat(startTime + gap * 24, "2"),
					new Beat(startTime + gap * 26, "1"), 
					new Beat(startTime + gap * 28, "3"),
					new Beat(startTime + gap * 30, "2"),
					new Beat(startTime + gap * 32, "1"),
					new Beat(startTime + gap * 35, "2"),
					new Beat(startTime + gap * 37, "3"),
					new Beat(startTime + gap * 39, "2"),
					new Beat(startTime + gap * 41, "1"),
					new Beat(startTime + gap * 43, "S"),
					new Beat(startTime + gap * 45, "D"),
					new Beat(startTime + gap * 48, "1"),
					new Beat(startTime + gap * 49, "2"),
					new Beat(startTime + gap * 50, "3"),
					new Beat(startTime + gap * 52, "D"),
					new Beat(startTime + gap * 52, "Space"),
					new Beat(startTime + gap * 52, "A"),
					new Beat(startTime + gap * 54, "S"),
					new Beat(startTime + gap * 56, "D"),
					new Beat(startTime + gap * 59, "Space"),
					new Beat(startTime + gap * 59, "D"),
					new Beat(startTime + gap * 59, "1"),
					new Beat(startTime + gap * 61, "3"),
					new Beat(startTime + gap * 63, "2"),
					new Beat(startTime + gap * 65, "Space"),
					new Beat(startTime + gap * 65, "D"),
					new Beat(startTime + gap * 65, "Space"),
					new Beat(startTime + gap * 65, "1"),
					new Beat(startTime + gap * 70, "A"),
					new Beat(startTime + gap * 72, "A"),
					new Beat(startTime + gap * 74, "A"),
					
					
			};  
		}else if (titleName.equals("Avenged Sevenfold - Hail To The King") && difficulty.equals("Hard")) {
			int startTime = 4460 - Main.REACH_TIME * 1000;
			int gap = 125; // ������ ����
			beats = new Beat[] { new Beat(startTime + gap * 2, "D"), new Beat(startTime + gap * 4, "S"),
					new Beat(startTime + gap * 6, "D"), new Beat(startTime + gap * 8, "S"),
					new Beat(startTime + gap * 8, "A"), new Beat(startTime + gap * 10, "1"),
					new Beat(startTime + gap * 12, "2"), new Beat(startTime + gap * 14, "1"),
					new Beat(startTime + gap * 18, "3"), new Beat(startTime + gap * 20, "1"),
					new Beat(startTime + gap * 22, "D"), new Beat(startTime + gap * 22, "3"),
					new Beat(startTime + gap * 24, "S") };
		} 
		else if (titleName.equals("Sum41 - Still Waiting") && difficulty.equals("Easy")) {
			int startTime = 4460 - Main.REACH_TIME * 1000;
			int gap = 125; // ������ ����
			beats = new Beat[] { new Beat(startTime + gap * 2, "D"), new Beat(startTime + gap * 4, "S"),
					new Beat(startTime + gap * 6, "D"), new Beat(startTime + gap * 8, "S"),
					new Beat(startTime + gap * 8, "A"), new Beat(startTime + gap * 10, "1"),
					new Beat(startTime + gap * 12, "2"), new Beat(startTime + gap * 14, "1"),
					new Beat(startTime + gap * 18, "3"), new Beat(startTime + gap * 20, "1"),
					new Beat(startTime + gap * 22, "D"), new Beat(startTime + gap * 22, "3"),
					new Beat(startTime + gap * 24, "S") };
		} else if (titleName.equals("Sum41 - Still Waiting") && difficulty.equals("Hard")) {
			int startTime = 4460 - Main.REACH_TIME * 1000;
			int gap = 125; // ������ ����
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
				note.judge();
				break;
			}
		}
	}

}

