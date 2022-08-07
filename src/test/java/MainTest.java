import org.junit.Assert;
import org.junit.Test;

public class MainTest {


    @Test
    public void testMath(){

        int[] number = {10,11,12,13,14,15,16,17,18,19};
        int expectedResult =5;
        int result = Main.getEvenNumbers(number);
        Assert.assertEquals(expectedResult, result);
    }

}