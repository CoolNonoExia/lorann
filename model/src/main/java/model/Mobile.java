package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

public class Mobile extends Entity {
	protected int speed;
	protected Direction direction;
	
	public Mobile(Direction direction, Position position, int Speed, Image[] images) {
		super(position, images);
		this.direction = direction;
	}
	
	public Direction getDirection() {
		return this.direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public Dimension getDimension() {
		return this.DIMENSION;
	}
	
	public int getSpeed() {
		return this.speed;
		
	}
	
	public int getWidth() {
		return (int)this.DIMENSION.getWidth();
		
	}
	
	public int getHeight() {
		return (int)this.DIMENSION.getHeight();
		
	}
	
	public void move() {
		
	}
	
	public void placeInArea(IArea area) {
		
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
	
	public Image[] getImage() {
		return images;
	}
}
