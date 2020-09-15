import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostDigitsTest {
    @Test
    public void exampleTest1() {
        assertEquals(100, MostDigits.mostDigits(new int[] {1, 10, 100}));
    }

    @Test
    public void exampleTest2() {
        assertEquals(9000, MostDigits.mostDigits(new int[] {9000, 8, 800}));
    }

    @Test
    public void exampleTest3() {
        assertEquals(900, MostDigits.mostDigits(new int[]  {8, 900, 500}));
    }

    @Test
    public void exampleTest4() {
        assertEquals(40000, MostDigits.mostDigits(new int[] {3, 40000, 100}));
    }

    @Test
    public void exampleTest5() {
        assertEquals(100000, MostDigits.mostDigits(new int[] {1, 200, 100000}));
    }

    @Test
    public void exampleTest6() {
        assertEquals(-10, MostDigits.mostDigits(new int[] {-10, 1, 0, 1, 10}));
    }

    @Test
    public void exampleTest7(){
        assertEquals(-1258841096, MostDigits.mostDigits(new int[]{-1258841096,100000, 3, 1284873115}));
    }

    @Test
    public void exampleTest8(){
        assertEquals(1258841096, MostDigits.mostDigits(new int[]{1258841096,100000, 3, -1284873115}));
    }

    @Test
    public void exampleTest9(){
        assertEquals(-1258841096, MostDigits.mostDigits(new int[]{-1258841096,100000, 3, -1284873115}));
    }
}
