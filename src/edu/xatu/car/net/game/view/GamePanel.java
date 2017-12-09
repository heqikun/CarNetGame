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
		
		g.drawString("画布的宽：" + this.getWidth() + 
					 ",画布的高：" + this.getHeight() + 
					 "界面的宽：" + frame.getWidth() + 
					 "界面的高：" + frame.getHeight(), 30, 30);
	}
	
}
