package bridgelabz.model;

import java.util.List;

public class AddressBook {
    private String name;
    private List<Contact> bookMap;

    public AddressBook(String name, List<Contact> bookMap) {
        this.name = name;
        this.bookMap = bookMap;
    }
}
