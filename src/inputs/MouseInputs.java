package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.GamePanel;

public class MouseInputs implements MouseListener, MouseMotionListener{
	
	private GamePanel gamepanel;
	public MouseInputs(GamePanel gamepanel) {
		this.gamepanel = gamepanel;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		gamepanel.setReactPos(e.getX(), e.getY());
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("clicando");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	

}
