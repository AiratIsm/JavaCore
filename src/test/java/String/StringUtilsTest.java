package String;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void getTheBiggestString(){
        String[] strings ={
        "Баклажаны, огурцы, помидоры",
        "Деревья, кустарники, трава",
        "Ягоды, овощи, фрукты",
        "Апельсин, мандарин, киви, груша, лайм"
        };
        BigString bigString=StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertEquals(37, bigString.getLength());
        Assert.assertEquals("Апельсин, мандарин, киви, груша, лайм", bigString.getValues());
    }
@Test
    public void whenEmptyArrayString(){
        String[] strings ={};
        BigString bigString =StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertNull(bigString);
    }


}