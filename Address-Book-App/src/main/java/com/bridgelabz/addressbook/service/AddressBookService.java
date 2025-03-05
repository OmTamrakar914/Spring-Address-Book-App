package com.bridgelabz.addressbook.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBook;

@Service
public class AddressBookService implements IAddressBookService {

    @Override
    public List<AddressBook> getAllAddresses() {
        List<AddressBook> addressList = new ArrayList<>();
        addressList.add(new AddressBook(1, "John Doe", "1234567890", "New York"));
        return addressList;
    }

    @Override
    public AddressBook getAddressById(int id) {
        AddressBook address = null;
        address = new AddressBook(id, "John Doe", "1234567890", "New York");
        return address;
    }

    @Override
    public AddressBook createAddress(AddressBookDTO addressBookDTO) {
        AddressBook address = new AddressBook(1, addressBookDTO.getName(), addressBookDTO.getPhoneNumber(), addressBookDTO.getCity());
        return address;
    }

    @Override
    public AddressBook updateAddress(AddressBookDTO addressBookDTO) {
        AddressBook address = new AddressBook(1, addressBookDTO.getName(), addressBookDTO.getPhoneNumber(), addressBookDTO.getCity());
        return address;
    }

    @Override
    public void deleteAddress(int id) {
    }

}