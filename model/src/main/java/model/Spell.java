package model;

import java.awt.Image;

public class Spell extends Mobile {
	private static int SPEED = 2;
	private static int WIDTH = 1;
	private static int HEIGHT = 1;
	
	public Spell(Direction direction, Position position, Dimension dimension, Image[] images) {
		super(direction, position, SPEED, images);
	}
}
