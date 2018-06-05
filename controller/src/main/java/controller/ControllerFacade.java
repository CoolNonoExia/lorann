package controller;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JPanel;

import model.Direction;
import model.IModel;
import model.Level;
import model.pawns.Player;
import model.pawns.Spell;
import showboard.IPawn;
import view.IView;


/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController, KeyListener {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
    
    private final EventPerformer eventPerformer;
    
    private Order order;
    
    private Spell spell;
    private Player player;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        this.view = view;
        this.model = model;
        this.eventPerformer = new EventPerformer(this);
        this.order = Order.NOPE;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
        final List<Level> level1 = this.getModel().getLevel1();
        List<IPawn> pawns;
        
        pawns = this.getModel().setPawns(level1);
        this.getView().setLevel(this, level1);
        
        for(int i = 0; i < pawns.size(); i++) {
        	if (pawns.get(i) instanceof Player) {
        		player = (Player) pawns.get(i);
        	}
        }

        this.getView().getGameFrame().addPawns(pawns);

        this.mainLoop();
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
    
    public EventPerformer getEventPerformer() {
    	return this.eventPerformer;
    }
    
    public void orderPerform(Order order) {
    	if (order != Order.NOPE) {
    		this.order = order;
    	}
    }
    
    public void launchSpell(Direction dir, Point position) {
    	try {
    		switch(dir) {
    		case NEUTRAL:
    			break;
    		case UP:
    			position.setLocation(new Point((int) position.getX(), (int) position.getY()-32));
    			break;
    		case LEFT:
    			position.setLocation(new Point((int) position.getX()-32, (int) position.getY()));
    			break;
    		case DOWN:
    			position.setLocation(new Point((int) position.getX(), (int) position.getY()+32));
    			break;
    		case RIGHT:
    			position.setLocation(new Point((int) position.getX()+32, (int) position.getY()));
    			break;
    		}
			spell = new Spell(dir, position);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public void mainLoop() {
    	while(true) {
    		switch (this.order) {
    		case SPELL:
    			this.launchSpell(this.player.getDirection(), this.player.getPosition());
    			break;
    		case UP:
    			this.getModel().move(order);
        		this.getView().getGameFrame().repaint();
    			break;
    		case LEFT:
    			this.getModel().move(order);
        		this.getView().getGameFrame().repaint();
    			break;
    		case DOWN:
    			this.getModel().move(order);
        		this.getView().getGameFrame().repaint();
    			break;
    		case RIGHT:
    			this.getModel().move(order);
        		this.getView().getGameFrame().repaint();
    			break;
    		case ESCAPE:
    			break;
    		}
    		this.getView().getGameFrame().repaint();
    		try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    }

	@Override
	public void keyPressed(KeyEvent key) {
		this.getEventPerformer().eventPerform(key);
	}

	@Override
	public void keyReleased(KeyEvent key) {
		// NOTHING
	}

	@Override
	public void keyTyped(KeyEvent key) {
		// NOTHING
	}
}
