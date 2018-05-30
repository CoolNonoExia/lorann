package model;

import java.awt.Dimension;
import java.awt.Image;

public class Background implements IArea {
	private Image image;
	private Dimension dimension;
	
	public Background(Dimension dimension) {
		this.dimension = dimension;
	}

	public Dimension getDimension() {
		return dimension;
	}
	
	public Image getImage() {
		return image;
	}
}
