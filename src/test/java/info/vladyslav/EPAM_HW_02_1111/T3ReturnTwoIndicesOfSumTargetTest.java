package info.vladyslav.EPAM_HW_02_1111;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class T3ReturnTwoIndicesOfSumTargetTest {
    private T3ReturnTwoIndicesOfSumTarget t3 = new T3ReturnTwoIndicesOfSumTarget();

    @Test
    public void testT3n1() {
        assertEquals(Arrays.toString(t3.run(new int[]{2, 7, 11, 15},9)), "[0, 1]");
    }

    @Test
    public void testT3n2() {
        assertEquals(Arrays.toString(t3.run(new int[]{2, 9, 15, 20},29)), "[1, 3]");
    }
}
