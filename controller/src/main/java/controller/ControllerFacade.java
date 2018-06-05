package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.List;

import model.IModel;
import model.Level;
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
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
        final List<Level> level1 = this.getModel().getLevel1();
        
//        for (int i=0; i<level1.size(); i++) {
//        	for (int j = 0; j<level1.get(i).getLine().size(); j++)
//        	System.out.println("j'ai bouclé : " + i + " et " + j +" avec la valeur : " + level1.get(i).getLine().get(j));
//        }
        
        this.getView().setLevel(this, level1);
        
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
    		if (order == Order.SPELL) {
    			this.launchSpell();
    		} else {
    			this.getModel().move(order);
    		}
    	}
    }
    
    public void launchSpell() {
    	// TODO
    }

    public void mainLoop() {
    	while(true) {
    		// TODO
    		this.getView().getGameFrame().repaint();
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
