/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.viva.listner;

import edu.ijse.absd.viva.connection.database.DatabaseResourceConnection;
import edu.ijse.absd.viva.connection.database.impl.MySQLDatabaseResourceConnectionImpl;
import edu.ijse.absd.viva.connection.factory.DatabaseResourceFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 *
 * @author thilina
 */
public class RequestListner implements ServletRequestListener{
    
    public Connection connection;

    public void requestDestroyed(ServletRequestEvent sre) {
        try {
            System.out.println("Destroy : "+connection.toString());
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(RequestListner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void requestInitialized(ServletRequestEvent sre) {            
        try {
            DatabaseResourceConnection mySQLDatabaseResourceConnectionImpl = new DatabaseResourceFactory().getResourceConnection();
            connection = mySQLDatabaseResourceConnectionImpl.getConnection();
            connection = new DatabaseResourceFactory().getResourceConnection().getConnection();
            connection.setAutoCommit(false);
            System.out.println("Create : "+connection.toString());
            sre.getServletRequest().setAttribute("connection", connection);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RequestListner.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RequestListner.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
}
