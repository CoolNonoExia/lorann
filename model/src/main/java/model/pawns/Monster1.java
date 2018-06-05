package model.pawns;

import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Direction;

public class Monster1 extends Mobile {
	
	public Monster1(Direction direction, Point position) throws IOException {
		super(direction, position, new Image[] {ImageIO.read(new File("../sprites/monster_1.png"))});
		this.nbrImages = 1;
	}
}