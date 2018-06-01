package model;

import java.awt.Dimension;
import java.awt.Image;

public class Entity implements IEntity {
	protected static Dimension DIMENSION;
	protected Image[] images;
	protected IModel model;
	protected Position position;
	
	public Entity(Position position, Image[] images) {
		this.position = position;
		this.images = images;
	}

	@Override
	public boolean hit() {
		return false;
	}
}
