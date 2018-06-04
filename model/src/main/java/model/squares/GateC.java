package model.squares;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Entity;
import model.Position;

public class GateC extends Entity {

	public GateC(Position position, Image[] images) throws IOException {
		super(position, new Image[] {ImageIO.read(new File("sprite/gate_closed.png"))});
	}
}
