package model;

import java.sql.SQLException;
import java.util.List;
import java.util.Observable;

import controller.Order;
import model.dao.LevelDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade extends Observable implements IModel {
	
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
    
    public void move(Order order) {
    	// TODO
    	
    }
}
