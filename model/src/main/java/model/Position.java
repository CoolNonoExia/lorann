package model;

public class Position {

	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	public Position(double x, double y, double maxX, double maxY) {
		this.x = x;
		this.y = y;
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	
	public Position(Position position) {
		this.x = position.getX();
		this.y = position.getY();
		this.maxX = position.getMaxX();
		this.maxY = position.getMaxY();
	}

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getMaxX() {
		return maxX;
	}


	public double getMaxY() {
		return maxY;
	}
}
