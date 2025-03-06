package com.bridgelabz.addressbook.dto;
import lombok.*;
import jakarta.validation.*;
import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookDTO {

	
	private int id;
	
	@NotEmpty(message = "Name cannot be null")
	 @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid Name")
    private String name;
	
	 @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
    private String phoneNumber;
	 
	 @NotNull
    private String city;

}


   
   

