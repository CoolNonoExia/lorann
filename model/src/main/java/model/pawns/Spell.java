package model.pawns;

import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Direction;

public class Spell extends Mobile {
	
	public Spell(Direction direction, Point position) throws IOException {
		super(direction, position, new Image[] {ImageIO.read(new File("../sprites/fireball_1.png")),
												ImageIO.read(new File("../sprites/fireball_2.png")),
												ImageIO.read(new File("../sprites/fireball_3.png")),
												ImageIO.read(new File("../sprites/fireball_4.png")),
												ImageIO.read(new File("../sprites/fireball_5.png"))});
		this.nbrImages = 5;
	}
}