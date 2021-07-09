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
package bridgelabz.services;

import bridgelabz.exception.AddressBookException;
import bridgelabz.model.Contact;

import java.util.*;

public class AddressBookService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String,List<Contact>> addressBookMap = new HashMap<>();

    private static AddressBookService addressBookService;

    private AddressBookService() {

    }

    public static AddressBookService getInstance() {
        if (addressBookService == null)
            addressBookService = new AddressBookService();
        return addressBookService;
    }

    /**
     * Method for taking person details and store them into local storage.
     */
    public  Map<String,List<Contact>> addPersonDetail(int id, String firstName,String lastName, String address, String city,String state,String zip, String phone, String email) throws AddressBookException {
        try {
            Contact contact = new Contact();
            contact.setId(id);
            contact.setFirstName(firstName);
            contact.setLastName(lastName);
            contact.setAddress(address);
            contact.setCity(city);
            contact.setState(state);
            contact.setZip(zip);
            contact.setPhone(phone);
            contact.setEmail(email);
            List<Contact> contactList = new ArrayList<>();
            contactList.add(contact);
            addressBookMap.put(contact.getCity(),contactList);
            return addressBookMap;
        } catch (Exception e) {
            throw new AddressBookException(e.getMessage());
        }
    }
}
