/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.viva.dao;

import edu.ijse.absd.viva.dto.BookDTO;
import java.sql.Connection;

/**
 *
 * @author thilina
 */
public interface BookDAO {
    public int saveBook(Connection connection, BookDTO bookDTO);
}
