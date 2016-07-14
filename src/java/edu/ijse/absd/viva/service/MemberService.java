/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.viva.service;

import edu.ijse.absd.viva.dto.MemberDTO;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author thilina
 */
public interface MemberService {
    public int savemember(Connection connection, MemberDTO memberDTO)  throws SQLException;    
}
