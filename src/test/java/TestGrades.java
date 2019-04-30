import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Sigute on 4/30/2019.
 */
@RunWith(JUnit4.class)
public class TestGrades {

    @Test
    public void testConversionFromDKto10() {
        int x = 12;
        int[] y = Converter.convertDKto10(x);
        assertTrue(Arrays.equals(new int[]{10}, y));

        assertTrue(Arrays.equals(new int[]{9}, Converter.convertDKto10(10)));
        assertTrue(Arrays.equals(new int[]{8}, Converter.convertDKto10(7)));
        assertTrue(Arrays.equals(new int[]{7}, Converter.convertDKto10(4)));
        assertTrue(Arrays.equals(new int[]{6, 5}, Converter.convertDKto10(2)));
        assertTrue(Arrays.equals(new int[]{4}, Converter.convertDKto10(0)));
        assertTrue(Arrays.equals(new int[]{3, 2, 1}, Converter.convertDKto10(-3)));

        assertNull(Converter.convertDKto10(15));
    }

    @Test
    public void testConversionFrom10toDK() {
        int x = 10;
        int y = Converter.convert10toDK(x);
        assertEquals(12, y);
        assertEquals(10, Converter.convert10toDK(9));
        assertEquals(7, Converter.convert10toDK(8));
        assertEquals(4, Converter.convert10toDK(7));
        assertEquals(2, Converter.convert10toDK(6));
        assertEquals(2, Converter.convert10toDK(5));
        assertEquals(0, Converter.convert10toDK(4));
        assertEquals(-3, Converter.convert10toDK(3));
        assertEquals(-3, Converter.convert10toDK(2));
        assertEquals(-3, Converter.convert10toDK(1));
    }
}
