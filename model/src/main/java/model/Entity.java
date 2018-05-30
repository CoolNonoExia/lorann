package model;

import java.awt.Image;

public class Entity {
	protected static Dimension DIMENSION;
	protected Image[] images;
	protected IModel model;
	protected Position position;
	
	public Entity(Position position, Image[] images) {
		this.position = position;
		this.images = images;
	}
}
