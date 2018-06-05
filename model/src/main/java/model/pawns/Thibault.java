package model.pawns;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Direction;
import model.Position;

public class Thibault extends Mobile {
	private static int SPEED = 2;
	
	public Thibault(Direction direction, Position position) throws IOException {
		super(direction, position, SPEED, new Image[] {ImageIO.read(new File("sprite/thibault.png")),
													   ImageIO.read(new File("sprite/thibault_mouth.png"))});
		this.nbrImages = 2;
	}
}