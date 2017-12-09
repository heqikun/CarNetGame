package edu.xatu.car.net.game.model;

public class CarNetGame {
	/**
	 * ��Ϸ�Ŀ�
	 */
	public static final int WIDTH = 800;
	/**
	 * ��Ϸ�ĸ�
	 */
	public static final int HEIGHT = 600;
	/**
	 * ��Ϸ��״̬
	 *    1 STARTING
	 *    2 PAUSE
	 *    3 STOP
	 */
	private GameStatus status = GameStatus.STARTING;
	private Player[] players = new Player[5];
	private Road road;
}
