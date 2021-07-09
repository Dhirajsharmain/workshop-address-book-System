package bridgelabz;

import bridgelabz.exception.AddressBookException;
import bridgelabz.model.Contact;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class AddressBookTest {

    AddressBookMain addressBookMain;

    @Before
    public void setUp() throws Exception {
        addressBookMain = new AddressBookMain();
    }

    @Test
    public void givenContactDetails_whenAdded_shouldReturnContactCount() throws AddressBookException {
        Map<String, List<Contact>> result = addressBookMain.addContact(1, "Dhiraj", "Sharma", "101 Hisar", "Hisar", "Haryana", "125555", "7989844645", "dhirajsharma@gmail.com");
        Assert.assertEquals(1, result.size());
    }
}
