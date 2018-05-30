package model;

public class Dimension {
	private int width;
	private int height;
	
	public Dimension(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Dimension(Dimension dimension) {
		this.width = dimension.getWidth();
		this.height = dimension.getHeight();
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
}
