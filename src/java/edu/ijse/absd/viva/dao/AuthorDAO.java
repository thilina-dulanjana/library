/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.viva.dao;

import java.sql.Connection;
import java.util.Map;

/**
 *
 * @author thilina
 */
public interface AuthorDAO {
    public Map<String, String> getAuthors(Connection connection);
}
