package branchoperators.movie;

import Arrays.SecondArrayTask;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieAccessServiceTest {
    @Test
    public void accessVerification(){
        int age=30;
        String expected = "Rating F. Access is allowed.";
        String result = MovieAccessService.accessMovie(age);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void accessVerificationFirst(){
        int age=10;
        String expected = "Access is denied";
        String result = MovieAccessService.accessMovie(age);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void accessVerificationSecond(){
        int age=-3;
        String expected = "Incorrect age, check the user with this age.";
        String result = MovieAccessService.accessMovie(age);
        Assert.assertEquals(expected, result);

}
    @Test
    public void accessVerificationThird() {
        int age = 20;
        String expected = "Rating R. Access is allowed.";
        String result = MovieAccessService.accessMovie(age);
        Assert.assertEquals(expected, result);
    }}