package com.bridgelabz.addressbook.dto;

public class AddressBookDTO {

	private int id;
    private String name;
    private String phoneNumber;
    private String city;

    public AddressBookDTO() {
    }

    public AddressBookDTO(String name, String phoneNumber, String city) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}