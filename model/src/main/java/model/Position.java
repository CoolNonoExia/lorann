package model;

public class Position {

	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	public Position(double x, double y) {
		this.x = x;
		this.y = y;
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	
	public Position(Position position) {
		this.x = position.getX();
		this.y = position.getY();
	}

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
}
