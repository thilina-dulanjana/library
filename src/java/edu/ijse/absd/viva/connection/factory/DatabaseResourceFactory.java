/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.absd.viva.connection.factory;

import edu.ijse.absd.viva.connection.database.DatabaseResourceConnection;
import edu.ijse.absd.viva.connection.database.impl.MySQLDatabaseResourceConnectionImpl;

public class DatabaseResourceFactory {
    public DatabaseResourceConnection getResourceConnection(){
        return new MySQLDatabaseResourceConnectionImpl();
    }    
}
