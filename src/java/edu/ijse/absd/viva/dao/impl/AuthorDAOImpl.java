/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.viva.dao.impl;

import edu.ijse.absd.viva.connection.factory.DatabaseResourceFactory;
import edu.ijse.absd.viva.dao.AuthorDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thilina
 */
public class AuthorDAOImpl implements AuthorDAO{

    public Map<String, String> getAuthors(Connection connection) {
        try {
            String query = "SELECT * FROM author";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            Map<String, String> result = new HashMap();
            while(resultSet.next()){
                result.put(resultSet.getString(1), resultSet.getString(2));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(AuthorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
    
}
