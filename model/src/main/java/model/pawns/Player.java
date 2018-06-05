package model.pawns;

import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Direction;

public class Player extends Mobile {
	
	public Player(Direction direction, Point position) throws IOException {
		super(direction, position, new Image[] {ImageIO.read(new File("../sprites/lorann_u.png")),
												ImageIO.read(new File("../sprites/lorann_ur.png")),
												ImageIO.read(new File("../sprites/lorann_r.png")),
												ImageIO.read(new File("../sprites/lorann_br.png")),
												ImageIO.read(new File("../sprites/lorann_b.png")),
												ImageIO.read(new File("../sprites/lorann_bl.png")),
												ImageIO.read(new File("../sprites/lorann_l.png")),
												ImageIO.read(new File("../sprites/lorann_ul.png"))});
		this.nbrImages = 8;
	}
	
	@Override
	public void moveUp() {
		this.position.setLocation(new Point((int) position.getX(), (int) position.getY()-32));
	}
	
	@Override
	public void moveDown() {
		this.position.setLocation(new Point((int) position.getX(), (int) position.getY()+32));
	}
	
	@Override
	public void moveRight() {
		this.position.setLocation(new Point((int) position.getX()+32, (int) position.getY()));
	}
	
	@Override
	public void moveLeft() {
		this.position.setLocation(new Point((int) position.getX()-32, (int) position.getY()));
	}
}
