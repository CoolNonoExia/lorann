package model.squares;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Entity;
import model.Position;

public class BoneH extends Entity {

	public BoneH(Position position, Image[] images) throws IOException {
		super(position, new Image[] {ImageIO.read(new File("sprite/horizontal_bone.png"))});
	}
}
