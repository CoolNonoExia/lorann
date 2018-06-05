package view;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Level;
import showboard.*;

public class ViewFacade implements IView {
	private BoardFrame gameFrame;
	
    public BoardFrame getGameFrame() {
		return gameFrame;
	}

	public ViewFacade() {
        super();
    }
    
	@Override
	public void setLevel(KeyListener controller, List<Level> level) {
		int[][] tab = new int[level.size()][level.get(0).getLine().size()];
		for (int i=0; i<level.size(); i++) {
			for (int j=0; j<level.get(i).getLine().size(); j++) {
				tab[i][j] = level.get(i).getLine().get(j);
			}
		}
		gameFrame = new BoardFrame("Lorann VS Thibault ULTIMATE BATTLE", false, controller, tab);
        ((JPanel) gameFrame.getObserver()).setBackground(Color.BLACK);
	}
	
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
