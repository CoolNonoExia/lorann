package model.pawns;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

import model.Direction;
import model.Entity;
import model.IModel;
import model.Position;
import showboard.IPawn;

public /*abstract*/ class Mobile extends Entity implements IPawn {
	protected int speed;
	protected Direction direction;
	protected int nbrImages;
	
	public Mobile(Direction direction, Position position, int speed, Image[] images) {
		super(position, images);
		this.direction = direction;
		this.speed = speed;
		this.position = position;
		this.images = images;
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
	
	public int getSpeed() {
		return this.speed;
		
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
	
	public IModel getLorannModel() {
		return this.model;
	}
	
	public void setLorannModel (IModel model) {
		this.model = model;
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
		return new Point((int)position.getX(), (int)position.getY());
	}

	@Override
	public int getNbrImages() {
		return nbrImages;
	}
}
