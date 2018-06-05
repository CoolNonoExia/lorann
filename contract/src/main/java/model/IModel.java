package model;

import java.sql.SQLException;
import java.util.List;

import controller.Order;


public interface IModel {

    List<Level> getLevel1() throws SQLException;

    List<Level> getLevel2() throws SQLException;
    
    List<Level> getLevel3() throws SQLException;
    
    List<Level> getLevel4() throws SQLException;
    
    List<Level> getLevel5() throws SQLException;
    
    void move(Order order);
}
