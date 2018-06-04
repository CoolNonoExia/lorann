package model;

import java.awt.Dimension;
import java.awt.Image;

import showboard.ISquare;

public class Entity implements IEntity, ISquare {
	protected Dimension dimension;
	protected Image[] images;
	protected IModel model;
	protected Position position;
	
	public Entity(Position position, Image[] images) {
		this.dimension = new Dimension(32, 32);
		this.position = position;
		this.images = images;
	}

	@Override
	public Image[] getImage() {
		return images;
	}

}
