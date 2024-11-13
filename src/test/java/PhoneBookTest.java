import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

    @Test
    void testfindByName() {
        String name = "John", number = "89534563212";
        phoneBook.add(name, number);

        String findingNumber = phoneBook.findByName(name);

        Assertions.assertEquals(number, findingNumber);
    }

    @Test
    void testPrintAllNames(){
        String name = "John", number = "89534563212";
        String name1 = "Elis", number1 = "84953468719";
        phoneBook.add(name, number);
        phoneBook.add(name1, number1);
        Set<String> names = new HashSet<>();
        names.add(name);
        names.add(name1);
        Set<String> expectedNames = names.stream().sorted().collect(Collectors.toSet());

        Set<String> actualNames = phoneBook.printAllNames();

        Assertions.assertEquals(expectedNames, actualNames);
    }
}
