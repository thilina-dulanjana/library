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
public class MemberDTO {    
    private String memberName;
    private String address;
    private String father;
    private String mother;
    private String fContact;
    private String mContact;

    public MemberDTO(String memberName, String address, String father, String mother, String fContact, String mContact) {
        this.memberName = memberName;
        this.address = address;
        this.father = father;
        this.mother = mother;
        this.fContact = fContact;
        this.mContact = mContact;
    }
    
    

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getfContact() {
        return fContact;
    }

    public void setfContact(String fContact) {
        this.fContact = fContact;
    }

    public String getmContact() {
        return mContact;
    }

    public void setmContact(String mContact) {
        this.mContact = mContact;
    }
    
}
