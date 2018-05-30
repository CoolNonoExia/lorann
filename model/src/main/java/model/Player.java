package model;

import java.awt.Image;

public class Player extends Mobile {
	private static int SPEED = 4;
	private static int WIDTH = 2;
	private static int HEIGHT = 2;
	
	public Player(Direction direction, Position position, Image[] images) {
		super(direction, position, SPEED, images);
	}
}
