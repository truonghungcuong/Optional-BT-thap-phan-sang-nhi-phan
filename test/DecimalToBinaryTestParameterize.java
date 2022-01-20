import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToBinaryTestParameterize {
    @DisplayName("Convert decimal to binary")
    @ParameterizedTest(name = "test#{index}. convert({0}) ==> {1}")
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 10",
            "5, 101",
            "1991, 11111000111",
            "2022, 11111100110"
    })
    public void testConvert(int inputNumber, String expected){
        String actual = DecimalToBinary.convert(inputNumber);
        assertEquals(expected, actual);
    }
}