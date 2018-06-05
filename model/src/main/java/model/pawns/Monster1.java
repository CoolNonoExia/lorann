package model.pawns;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Direction;
import model.Position;

public class Monster1 extends Mobile {
	private static int SPEED = 2;
	
	public Monster1(Direction direction, Position position) throws IOException {
		super(direction, position, SPEED, new Image[] {ImageIO.read(new File("../sprites/monster_1.png"))});
		this.nbrImages = 1;
	}
}