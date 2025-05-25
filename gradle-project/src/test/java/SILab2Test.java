import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.SILab2;
import org.example.Item;

public class SILab2Test {

    String cardNumber = "0123456789012345";

    @Test
    void EveryStatement() {
        // 1: Item(null), cardNumber = Anything
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, cardNumber));
        System.out.println("1st test case passed");

        // 2: Item("name", 1, 20, 0.2), cardNumber = "0123456789012345"
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item(null, 1, 20, 0.2)), cardNumber));
        System.out.println("2nd test case passed");

        // 3. Item("name", 1, 20, 0.2), cardNumber = "0123456789012345"
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item(null, 1, 20, 0)), cardNumber));
        System.out.println("3rd test case passed");

        // 4. Item("name", 1, 20, 0), cardNumber = "012"
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item(null, 1, 20, 0)), "012"));
        System.out.println("4th test case passed");

        // 5. Item("name", 1, 20, 0), cardNumber = "0123456ABC012345"
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item(null, 1, 20, 0)), "0123456ABC012345"));
        System.out.println("5th test case passed");
    }
}


