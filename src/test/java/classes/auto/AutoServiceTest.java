package classes.auto;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AutoServiceTest {
    private Auto[] autos = {
            new Auto("Kia", "E", 5, "Automat"),
            new Auto("Mers", "E", 3, "Mechanic"),
            new Auto("Bmv", "E", 2, "Mechanic"),
            new Auto("Honda", "X", 5, "Automat"),
            new Auto("Suzuki", "X", 3, "Automat")

    };
    @Test
    public void getOnlyBmvCars()

    {
        AutoService Autoservice = new AutoService();
        Auto[] resultArray = Autoservice.getOnlyBmwCars(autos);
        String modelExpected = "Bmv";

        Assert.assertEquals(resultArray[0].getModel(), modelExpected);

    }
    @Test
    public void getOnlyMersECars()

    {
        AutoService Autoservice = new AutoService();
        Auto[] resultArray = Autoservice.getOnlyMersECars(autos);
        String modelExpected = "Mers";
        

        Assert.assertEquals(resultArray[0].getModel(), modelExpected);

    }


    @Test
    public void getSportCars()

    {
        AutoService Autoservice = new AutoService();
        Auto[] resultArray = Autoservice.getSportCars(autos);
        int numberOfPassengerSeatsExpected = 2;

        Assert.assertEquals(resultArray[0].getNumberOfPassengerSeats(), numberOfPassengerSeatsExpected);

    }


    @Test
    public void getTransmissionType()

    {
        AutoService Autoservice = new AutoService();
        Auto[] resultArray = Autoservice.getTransmissionType(autos);
        String transmissionTypeExpected = "Automat";

        Assert.assertEquals(resultArray[0].getTransmissionType(), transmissionTypeExpected);

    }

}