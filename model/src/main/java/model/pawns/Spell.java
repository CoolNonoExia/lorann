package model.pawns;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Direction;
import model.Position;

public class Spell extends Mobile {
	private static int SPEED = 2;
	
	public Spell(Direction direction, Position position) throws IOException {
		super(direction, position, SPEED, new Image[] {ImageIO.read(new File("../sprites/fireball_1.png")),
													   ImageIO.read(new File("../sprites/fireball_2.png")),
													   ImageIO.read(new File("../sprites/fireball_3.png")),
													   ImageIO.read(new File("../sprites/fireball_4.png")),
													   ImageIO.read(new File("../sprites/fireball_5.png"))});
		this.nbrImages = 5;
	}
}