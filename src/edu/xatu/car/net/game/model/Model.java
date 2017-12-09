package edu.xatu.car.net.game.model;

public class Model {
	private int x , y;
	private int width;
	public int getX() {
		return x;
	}
	public Model(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}
	public Model() {
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
