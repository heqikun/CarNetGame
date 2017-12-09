package edu.xatu.car.net.game.view;

import javax.swing.JFrame;

public class CarNetGameFrame extends JFrame {
	private GamePanel panel = new GamePanel(this);
	
	public CarNetGameFrame() {
		super("ÍøÂç·É³µ");
		
		this.add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(818, 647);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CarNetGameFrame();
	}

}
