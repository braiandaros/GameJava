package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;

public class KeyboardInputs implements KeyListener{

	private GamePanel gamepanel;
	
	public KeyboardInputs(GamePanel gamepanel) {
		this.gamepanel = gamepanel;
	}
	@Override
	public void keyTyped(KeyEvent e) {	
	}

	@Override
	public void keyReleased(KeyEvent e) {	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_W:
			gamepanel.changYDelta(-5);	
			break;
		case KeyEvent.VK_A:
			gamepanel.changXDelta(-5);
			break;
		case KeyEvent.VK_S:
			gamepanel.changYDelta(5);
			break;
		case KeyEvent.VK_D:
			gamepanel.changXDelta(5);
			break;
		}
	}
}