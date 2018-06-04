package model.pawns;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Direction;
import model.Position;

public class Player extends Mobile {
	private static int SPEED = 2;
	
	public Player(Direction direction, Position position, Image[] images) throws IOException {
		super(direction, position, SPEED, new Image[] {ImageIO.read(new File("sprite/lorann_u.png")),
													   ImageIO.read(new File("sprite/lorann_ur.png")),
													   ImageIO.read(new File("sprite/lorann_r.png")),
													   ImageIO.read(new File("sprite/lorann_br.png")),
													   ImageIO.read(new File("sprite/lorann_b.png")),
													   ImageIO.read(new File("sprite/lorann_bl.png")),
													   ImageIO.read(new File("sprite/lorann_l.png")),
													   ImageIO.read(new File("sprite/lorann_ul.png"))});
		this.nbrImages = 8;
	}
}
