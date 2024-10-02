package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

public class GamePanel extends JPanel{

	private MouseInputs MouseInputs;
	private int xDelta = 100, yDelta = 100;
	//construtor
	public GamePanel() {
		MouseInputs = new MouseInputs(this);
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(MouseInputs);
		addMouseMotionListener(MouseInputs);
	}
	
	public void changXDelta(int value) {
		this.xDelta += value;
		repaint();
	}
	
	public void changYDelta(int value) {
		this.yDelta += value;
		repaint();
	}
	
	public void setReactPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(xDelta,yDelta, 200, 50);
	}
}