package model;

public class Position {

	private double x;
	private double y;
	private double MaxX;
	private double MaxY;
	
	
	public Position(double x, double y, double MaxX, double MaxY) {
		// TODO Auto-generated constructor stub
	}
	
	
	public Position(Position position) {
		// TODO Auto-generated constructor stub
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getMaxX() {
		return MaxX;
	}
	
	public double getMaxY() {
		return MaxY;
	}
	
	protected void setMaxX(double maxX) {
		MaxX = maxX;
	}
	
	protected void setMaxY(double maxY) {
		MaxY = maxY;
	}
	
	
	
	
}
