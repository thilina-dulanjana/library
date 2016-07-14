/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.viva.service.impl;

import edu.ijse.absd.viva.dao.MemberDAO;
import edu.ijse.absd.viva.dao.ParentDAO;
import edu.ijse.absd.viva.dao.impl.MemberDAOImpl;
import edu.ijse.absd.viva.dao.impl.ParentDAOImpl;
import edu.ijse.absd.viva.dto.MemberDTO;
import edu.ijse.absd.viva.service.MemberService;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author thilina
 */
public class MemberServiceImpl implements MemberService{


    public int savemember(Connection connection, MemberDTO memberDTO)  throws SQLException{
        MemberDAO memberDAO = new MemberDAOImpl();
        int res = memberDAO.saveMember(connection, memberDTO.getMemberName(), memberDTO.getAddress());
        if(0==res){
            connection.rollback();
            return res;
        }
        
        ParentDAO parentDAO = new ParentDAOImpl();
        int fRes = parentDAO.saveParent(connection, memberDTO.getFather(), memberDTO.getfContact(), res);
        if(0==fRes){
            connection.rollback();
            return fRes;
        }
        
        int mRes = parentDAO.saveParent(connection, memberDTO.getMother(), memberDTO.getmContact(), res);
        if(0==mRes){
            connection.rollback();
            return mRes;
        }
        
        connection.commit();
        return 1;
    }
    
}
