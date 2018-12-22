import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {

    @Test
    void arraysAreEqual() {
        int[] arr = new int[] {0, 1, 0, 1, 0, 0, 0};
        int[] arr2 = new int[] {0, 1, 0, 1, 0, 0, 0};
        int[] arr3 = new int[] {0, 1, 1, 1, 0, 0, 0};
        assertTrue(Functions.arraysAreEqual(arr, arr2));
        assertFalse(Functions.arraysAreEqual(arr,arr3));
    }

    @Test
    void arrayIntToString() {
        int[] arr = new int[] {0, 1, 0, 1, 0, 0, 0};

        assertEquals("0101000", Functions.arrayIntToString(arr));
    }

    @Test
    void charToIntArr(){
        String str = "01001";
        char[] charArr = str.toCharArray();

        int[] arr = Functions.charToIntArr(charArr);

        assertEquals(str, Functions.arrayIntToString(arr));
        assertNotEquals("0101", Functions.arrayIntToString(arr));

    }
}