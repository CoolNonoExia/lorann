package model.pawns;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

import model.Direction;
import showboard.IPawn;

public abstract class Mobile implements IPawn {
	protected Direction direction;
	protected int nbrImages;
	protected Point position;
	protected Dimension dimension;
	protected Image[] images;
	
	public Mobile(Direction direction, Point position, Image[] images) {
		this.direction = direction;
		this.position = position;
		this.images = images;
		this.dimension = new Dimension(32, 32);
		this.nbrImages = 1;
	}
	
	public Direction getDirection() {
		return this.direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public Dimension getDimension() {
		return dimension;
	}
	
	public int getWidth() {
		return (int)this.dimension.getWidth();
		
	}
	
	public int getHeight() {
		return (int)this.dimension.getHeight();
		
	}
	
	public void move() {
		
	}
	
	public void moveUp() {
		
	}
	
	public void moveDown() {
		
	}
	
	public void moveRight() {
		
	}
	
	public void moveLeft() {
		
	}

	@Override
	public Image[] getImage() {
		return images;
	}

	@Override
	public int getX() {
		return (int) position.getX();
	}

	@Override
	public int getY() {
		return (int) position.getY();
	}

	@Override
	public Point getPosition() {
		return position;
	}

	@Override
	public int getNbrImages() {
		return nbrImages;
	}
}
