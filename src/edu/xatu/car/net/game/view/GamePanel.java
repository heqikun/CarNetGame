package edu.xatu.car.net.game.view;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private CarNetGameFrame frame = null;
	public GamePanel(CarNetGameFrame f) {
		this.frame = f;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		g.drawString("�����Ŀ�" + this.getWidth() + 
					 ",�����ĸߣ�" + this.getHeight() + 
					 "����Ŀ�" + frame.getWidth() + 
					 "����ĸߣ�" + frame.getHeight(), 30, 30);
	}
	
}
