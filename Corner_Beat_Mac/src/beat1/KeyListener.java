package beat1;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter{

	@Override
	public void keyPressed(KeyEvent e) {
		if(DynamicBeat.game == null ) {
			return;
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			DynamicBeat.game.pressA();
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			DynamicBeat.game.pressS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			DynamicBeat.game.pressD();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			DynamicBeat.game.pressSpace();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
			DynamicBeat.game.pressNum1();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
			DynamicBeat.game.pressNum2();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
			DynamicBeat.game.pressNum3();
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		if(DynamicBeat.game == null ) {
			return;
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			DynamicBeat.game.releaseA();
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			DynamicBeat.game.releaseS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			DynamicBeat.game.releaseD();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			DynamicBeat.game.releaseSpace();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
			DynamicBeat.game.releaseNum1();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
			DynamicBeat.game.releaseNum2();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
			DynamicBeat.game.releaseNum3();
		}
	}

}
