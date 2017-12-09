package edu.xatu.car.net.game.model;

public class CarNetGame {
	/**
	 * 游戏的宽
	 */
	public static final int WIDTH = 800;
	/**
	 * 游戏的高
	 */
	public static final int HEIGHT = 600;
	/**
	 * 游戏的状态
	 *    1 STARTING
	 *    2 PAUSE
	 *    3 STOP
	 */
	private GameStatus status = GameStatus.STARTING;
	private Player[] players = new Player[5];
	private Road road;
}
