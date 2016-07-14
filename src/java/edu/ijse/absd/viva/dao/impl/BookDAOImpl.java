/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.viva.dao.impl;

import edu.ijse.absd.viva.dao.BookDAO;
import edu.ijse.absd.viva.dto.BookDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class BookDAOImpl implements BookDAO{

    public int saveBook(Connection connection, BookDTO bookDTO) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO book(book_name, author_id) VALUES(?, ?)");
            preparedStatement.setString(1, bookDTO.getName());
            preparedStatement.setInt(2, bookDTO.getAuthorId());
            int result = preparedStatement.executeUpdate();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(BookDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
