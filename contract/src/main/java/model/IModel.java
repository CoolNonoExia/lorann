package model;

import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    Example getExampleById(int id) throws SQLException;

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    Example getExampleByName(String name) throws SQLException;

    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */

    
    /* Real code from here */
    List<Example> getAllExamples() throws SQLException;
    
    public IArea getArea();
	
	public void buildArea(Dimension dimension);
	
	public void addMobile(Mobile mobile);
	
	public void removeMobile(Mobile mobile);
	
	public ArrayList<Mobile> getMobiles();
	
	public void setMobilesHasMoved();
}
