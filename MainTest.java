package Factorymethod;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions.*;
class MainTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Discounts are equal")
    void addsTwoNumbers() {
        Main calculator = new Main();
        assertEquals(2100000, calculator.discount(2100000), "Discount should be equal");
    }
}