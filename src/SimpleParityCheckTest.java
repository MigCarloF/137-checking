import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleParityCheckTest {

    private SimpleParityCheck parityCheck;
    int[] arr;
    int[] arr2;

    void setup(){
        parityCheck = new SimpleParityCheck();
        arr = new int[] {0, 1, 0, 1, 0, 0, 0};
        arr2 = new int[] { 0, 1, 1, 1, 0, 0, 0};
    }

    @Test
    void checkParityAssignment(){
        setup();

        assertTrue(Functions.arraysAreEqual(parityCheck.assignParityBit(arr), new int[]{0, 1, 0, 1, 0, 0, 0, 0}));
        assertTrue(Functions.arraysAreEqual(parityCheck.assignParityBit(arr), new int[]{0, 1, 1, 1, 0, 0, 0, 1}));

    }

    @Test
    void checkParity(){
        setup();

        arr = parityCheck.assignParityBit(arr);
        arr2 = parityCheck.assignParityBit(arr2);

        int[] arr3 = new int[] {0, 1, 0, 1,  0, 1, 0, 0};

        assertEquals("01010000", parityCheck.validateParity(arr));
        assertEquals("01110001", parityCheck.validateParity(arr2));
        assertEquals("Discarded", parityCheck.validateParity(arr3));

    }
}