package model;

import java.awt.Dimension;
import java.awt.Image;

import showboard.ISquare;

public class Entity implements IEntity, ISquare {
	protected Dimension dimension;
	protected Image[] images;
	
	public Entity(Image[] images) {
		this.dimension = new Dimension(32, 32);
		this.images = images;
	}

	@Override
	public Image[] getImage() {
		return images;
	}

}
