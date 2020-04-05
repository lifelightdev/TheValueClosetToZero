import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheValueClosetToZeroTest {

    @Test
    public void negativeClosetToZeroTest () {
        int[] tab = {-8, 3, 6, -5, 14, -6, -2, -4, 25, 12};
        assertEquals(TheValueClosetToZero.find(tab), -2);
    }

    @Test
    public void positiveClosetToZeroTest () {
        int[] tab = {-8, 3, 6, -5, 14, -6, 1, -2, -4, 25, 12};
        assertEquals(TheValueClosetToZero.find(tab), 1);
    }

    @Test
    public void zeroClosetToZeroTest () {
        int[] tab = {-8, 3, 6, -5, 0, 14, -6, 1, -2, -4, 25, 12};
        assertEquals(TheValueClosetToZero.find(tab), 0);
    }

}
