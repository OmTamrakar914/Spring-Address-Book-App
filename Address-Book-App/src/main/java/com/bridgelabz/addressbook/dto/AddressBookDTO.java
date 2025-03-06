package com.bridgelabz.addressbook.dto;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookDTO {

	private int id;
    private String name;
    private String phoneNumber;
    private String city;

}