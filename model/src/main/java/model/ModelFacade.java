package model;

import java.awt.Point;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import controller.Order;
import model.dao.LevelDAO;
import model.pawns.*;
import showboard.IPawn;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade extends Observable implements IModel {
	
	Player lorann;
	Monster1 mon1;
	Monster2 mon2;
	Monster3 mon3;
	Monster4 mon4;
	Thibault boss;
	Spell spell;
	
    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }
    
    @Override
    public List<Level> getLevel1() throws SQLException {
        return LevelDAO.getLevel1();
    }
    
    @Override
    public List<Level> getLevel2() throws SQLException {
        return LevelDAO.getLevel2();
    }
    
    @Override
    public List<Level> getLevel3() throws SQLException {
        return LevelDAO.getLevel3();
    }
    
    @Override
    public List<Level> getLevel4() throws SQLException {
        return LevelDAO.getLevel4();
    }
    
    @Override
    public List<Level> getLevel5() throws SQLException {
        return LevelDAO.getLevel5();
    }
    
    @Override
    public ArrayList<IPawn> setPawns(List<Level> level) {
    	ArrayList<IPawn> list = new ArrayList<>();
    	try {
	    	for (int i = 0; i < level.size(); i++) {
	    		for (int j = 0; j < level.get(0).getLine().size(); j++) {
	    			switch (level.get(i).getLine().get(j)) {
	    			case 3:
	    				lorann = new Player(Direction.NEUTRAL, new Point(j, i));
	    				list.add(lorann);
	    				break;
	    			case 9:
	    				mon1 = new Monster1(Direction.NEUTRAL, new Point(j, i));
	    				list.add(mon1);
	    				break;
	    			case 10:
	    				mon2 = new Monster2(Direction.NEUTRAL, new Point(j, i));
	    				list.add(mon2);
	    				break;
	    			case 11:
	    				mon3 = new Monster3(Direction.NEUTRAL, new Point(j, i));
	    				list.add(mon3);
	    				break;
	    			case 12:
	    				mon4 = new Monster4(Direction.NEUTRAL, new Point(j, i));
	    				list.add(mon4);
	    				break;
	    			case 13:
	    				boss = new Thibault(Direction.NEUTRAL, new Point(j, i));
	    				list.add(boss);
	    				break;
	    			default:
	    				break;
	    			}
	    		}
	    	}
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	return list;
    }
    
    public void move(Order order) {
    	switch(order) {
    	case UP:
    		this.lorann.moveUp();
    		break;
    	case DOWN:
    		this.lorann.moveDown();
    		break;
    	case RIGHT:
    		this.lorann.moveRight();
    		break;
    	case LEFT:
    		this.lorann.moveLeft();
    		break;
    	}
    }
}
