/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.viva.service.impl;

import edu.ijse.absd.viva.dao.AuthorDAO;
import edu.ijse.absd.viva.dao.impl.AuthorDAOImpl;
import edu.ijse.absd.viva.service.AuthorService;
import java.sql.Connection;
import java.util.Map;

/**
 *
 * @author thilina
 */
public class AuthorServiceImpl implements AuthorService{

    public Map<String, String> getAuthors(Connection connection) {
        AuthorDAO authorDAO = new AuthorDAOImpl();
        return authorDAO.getAuthors(connection);
    }
    
}
