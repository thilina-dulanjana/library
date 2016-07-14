/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.viva.dto;

/**
 *
 * @author thilina
 */
public class BookDTO {
    private String name;
    private int authorId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public BookDTO(String name, int authorId) {
        this.name = name;
        this.authorId = authorId;
    }
    
    
}
