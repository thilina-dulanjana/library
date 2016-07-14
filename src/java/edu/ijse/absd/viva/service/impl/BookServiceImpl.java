/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.viva.service.impl;

import edu.ijse.absd.viva.dao.BookDAO;
import edu.ijse.absd.viva.dao.impl.BookDAOImpl;
import edu.ijse.absd.viva.dto.BookDTO;
import edu.ijse.absd.viva.service.BookService;
import java.sql.Connection;

/**
 *
 * @author thilina
 */
public class BookServiceImpl implements BookService{

    public int saveBook(Connection connection, BookDTO bookDTO) {
        BookDAO bookDAO = new BookDAOImpl();
        bookDAO.saveBook(connection, bookDTO);
        return 0;
    }
    
}
