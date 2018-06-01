package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;
import model.Level;


public abstract class LevelDAO extends AbstractDAO {

    /** The sql load1 */
    private static String sqlLoad1   = "{call load1()}";
    
    /** The sql load2 */
    private static String sqlLoad2   = "{call load2()}";
    
    /** The sql load3 */
    private static String sqlLoad3   = "{call load3()}";
    
    /** The sql load4 */
    private static String sqlLoad4   = "{call load4()}";
    
    /** The sql load5 */
    private static String sqlLoad5   = "{call load5()}";
    

    /** The id column index. */
    private static int    idColumnIndex    = 1;

    /** The name column index. */
    private static int    nameColumnIndex  = 2;

    
    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
    
    public static List<Level> getLevel1() throws SQLException {
        final ArrayList<Level> level1 = new ArrayList<Level>();
        final CallableStatement callStatement = prepareCall(sqlLoad1);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            
            while(result.next()) {
            	
            for (int i=1; i<=26;i++) {
            	
                level1.add(new Level((int) result.getObject(i)));
   
            }
         }
            result.close();
        }
        return level1;
    }
    
    public static List<Level> getLevel2() throws SQLException {
        final ArrayList<Level> level2 = new ArrayList<Level>();
        final CallableStatement callStatement = prepareCall(sqlLoad1);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            while(result.next()) {
            	
                for (int i=1; i<=26;i++) {
                	
                    level2.add(new Level((int) result.getObject(i)));

                }
             }
                result.close();
        }
        return level2;
    }
    
    public static List<Level> getLevel3() throws SQLException {
        final ArrayList<Level> level3 = new ArrayList<Level>();
        final CallableStatement callStatement = prepareCall(sqlLoad1);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            while(result.next()) {
            	
                for (int i=1; i<=26;i++) {
                	
                    level3.add(new Level((int) result.getObject(i)));

                }
             }
                result.close();
        }
        return level3;
    }
    
    public static List<Level> getLevel4() throws SQLException {
        final ArrayList<Level> level4 = new ArrayList<Level>();
        final CallableStatement callStatement = prepareCall(sqlLoad1);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            while(result.next()) {
            	
                for (int i=1; i<=26;i++) {
                	
                    level4.add(new Level((int) result.getObject(i)));

                }
             }
                result.close();
        }
        return level4;
    }
    
    public static List<Level> getLevel5() throws SQLException {
        final ArrayList<Level> level5 = new ArrayList<Level>();
        final CallableStatement callStatement = prepareCall(sqlLoad1);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            while(result.next()) {
            	
                for (int i=1; i<=26;i++) {
                	
                    level5.add(new Level((int) result.getObject(i)));
                   
                }
             }
                result.close();
        }
        return level5;
    }
    
    
}