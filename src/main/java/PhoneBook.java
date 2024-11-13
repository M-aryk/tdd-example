import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, String> myPhoneBook = new TreeMap<>();

    public int add(String name, String number){
        myPhoneBook.put(name, number);
        return myPhoneBook.size();
    }

    public String findByNumber(String number){
        String findingName = null;
        for (Map.Entry<String, String> phone : myPhoneBook.entrySet()) {
            if (phone.getValue().contains(number)) {
                findingName = phone.getKey();
            }
        }
        return findingName;
    }
}
