/**
 * ****************************************************************************
 * Purpose: The purpose of this class to create Address Book System and add
 * multiple persons details in database.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 09-07-2021
 * ****************************************************************************
 */
package bridgelabz;

import bridgelabz.exception.AddressBookException;
import bridgelabz.model.Contact;
import bridgelabz.services.AddressBookService;

import java.util.List;
import java.util.Map;

public class AddressBookMain {

    AddressBookService addressBookService;

    /**
     * Constructor
     */
    public AddressBookMain() {
        addressBookService = AddressBookService.getInstance();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
    }

    /**
     * Method for adding contact details in address book.
     * @return
     */
    public Map<String,List<Contact>> addContact(int id, String firstName,String lastName, String address, String city,String state,String zip, String phone, String email) throws AddressBookException {
        return addressBookService.addPersonDetail(id,  firstName, lastName, address, city, state, zip, phone, email);
    }
}
