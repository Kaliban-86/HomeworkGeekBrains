package Homework14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Homework14Test {

    @Test
    void afterFourArrayWithOneFour() {
        int[] inputArr = new int[]{0, 6, 2, 2, 6, 4, 7, 1};
        int[] expectArray = {7, 1};
        Assertions.assertArrayEquals(expectArray, Homework14.afterFourArray(inputArr));
    }

    @Test
    void afterFourArrayWithTwoFour() {
        int[] inputArr = new int[]{4, 6, 2, 2, 4, 3, 7, 1};
        int[] expectArray = {3, 7, 1};
        Assertions.assertArrayEquals(expectArray, Homework14.afterFourArray(inputArr));
    }

    @Test
    void afterFourArrayException() {
        int[] inputArr = new int[]{2, 6, 2, 2, 2, 3, 7, 8};
        Assertions.assertThrows(
                RuntimeException.class,
                () -> Homework14.afterFourArray(inputArr)
        );
    }
}