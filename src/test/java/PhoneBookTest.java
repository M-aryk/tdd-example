import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();


    @Test
    void testAdding() {
        String name = "John", number = "89534563212";
        int expectedCount = 1;

        int countAdding = phoneBook.add(name, number);

        Assertions.assertEquals(expectedCount, countAdding);
    }

    @Test
    void testfindByNumber() {
        String name = "John", number = "89534563212";
        phoneBook.add(name, number);

        String findingName = phoneBook.findByNumber(number);

        Assertions.assertEquals(name, findingName);
    }
}
