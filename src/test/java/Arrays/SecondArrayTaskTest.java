package Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SecondArrayTaskTest {

    @Test
    public void fullSize(){
        int[] firstArray= new int[] {1,2,3,4,5,6,7,8,9};
        int[] secondArray=new int[] {10,11,12,13,14,15,16,17,18,19};
        int expected = 19;
        int result = SecondArrayTask.FullSizeArrays(firstArray, secondArray);
        Assert.assertEquals(expected, result);
    }}

