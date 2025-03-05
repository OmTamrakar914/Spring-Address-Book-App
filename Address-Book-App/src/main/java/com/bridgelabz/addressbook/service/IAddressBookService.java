package com.bridgelabz.addressbook.service;

import java.util.List;
import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBook;
public interface IAddressBookService {

    List<AddressBook> getAllAddresses();

    AddressBook getAddressById(int id);

    AddressBook createAddress(AddressBookDTO addressBookDTO);

    AddressBook updateAddress(AddressBookDTO addressBookDTO);

    void deleteAddress(int id);
}