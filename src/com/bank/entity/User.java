package com.bank.entity;

import java.util.Date;

public class User {
    private int userId;
    private String type;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date dateOfBirth;
    private String panCardNo;
    private String aadharCardNo;

    public User(String type,String firstName,String lastName, String panCardNo){
        this.type = type;
        this.firstName = firstName;
        this.lastName = lastName;
        this.panCardNo = panCardNo;
    }

    public int getUserId() {
        return userId;
    }

    public String getType() {
        return type;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPanCardNo() {
        return panCardNo;
    }

    public String getAadharCardNo() {
        return aadharCardNo;
    }

    public void setAadharCardNo(String aadharCardNo){
        this.aadharCardNo = aadharCardNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", type='" + type + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", panCardNo='" + panCardNo + '\'' +
                ", aadharCardNo='" + aadharCardNo + '\'' +
                '}';
    }
}
