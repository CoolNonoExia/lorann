package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import model.Level;
import view.IView;


/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
        this.getView().displayMessage(this.getModel().getExampleById(1).toString());

        this.getView().displayMessage(this.getModel().getExampleByName("Example 2").toString());

        final List<Example> examples = this.getModel().getAllExamples();
        final StringBuilder message = new StringBuilder();
        for (final Example example : examples) {
            message.append(example);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());
        final List<Level> level1 = this.getModel().getLevel1();
        for (int i=0; i<level1.size();i++) {
        	for (int j = 0; j<level1.get(i).getLine().size(); j++)
        	System.out.println("j'ai bouclé : " + i + " et " + j +" avec la valeur : " + level1.get(i).getLine().get(j));
        }
       
        /**
        final List<Level> level2 = this.getModel().getLevel2();
        for (int i=0; i<level2.size();i++) System.out.println("j'ai bouclé : " + i +" avec la valeur : " + level2.get(i).getList());
        
        final List<Level> level3 = this.getModel().getLevel3();
        for (int i=0; i<level3.size();i++) System.out.println("j'ai bouclé : " + i +" avec la valeur : " + level3.get(i).getList());
       
        final List<Level> level4 = this.getModel().getLevel4();
        for (int i=0; i<level4.size();i++) System.out.println("j'ai bouclé : " + i +" avec la valeur : " + level4.get(i).getList());
        
        final List<Level> level5 = this.getModel().getLevel5();
        for (int i=0; i<level5.size();i++) System.out.println("j'ai bouclé : " + i +" avec la valeur : " + level5.get(i).getList());
		*/
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
    
    public void orderPerform(Order order) {
    	// TODO
    	// this.getModel().move(order);
    	
    }
}
