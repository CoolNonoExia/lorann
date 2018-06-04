package model.squares;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Entity;
import model.Position;

public class Bone extends Entity {
	
	public Bone(Position position) throws IOException {
		super(position, new Image[] {ImageIO.read(new File("sprite/bone.png"))});
	}
}