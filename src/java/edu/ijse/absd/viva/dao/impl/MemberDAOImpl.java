/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.viva.dao.impl;

import edu.ijse.absd.viva.dao.MemberDAO;
import edu.ijse.absd.viva.dto.MemberDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author thilina
 */
public class MemberDAOImpl implements MemberDAO{

    public int saveMember(Connection connection, String name, String address) throws SQLException{
        PreparedStatement prepareStatement = connection.prepareStatement("INSERT INTO member(name, address) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
        prepareStatement.setString(1, name);
        prepareStatement.setString(2, address);
        int i = prepareStatement.executeUpdate();  
        
        ResultSet rs = prepareStatement.getGeneratedKeys();
        int key = 0;
        if (rs.next()) {
            key = rs.getInt(1);
        }
        return key;
    }
    
}
