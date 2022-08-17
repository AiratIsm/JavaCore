package Zoo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZooServiceTest {


    @Test
    public void getAveragePriceByZoos() {

        Zoo ZooNumberOne = new Zoo(
                600,
                "ZooNumberOne",
                new Animal[]{
                        new Animal("Жираф"),
                        new Animal("Змея"),
                        new Animal("Крокодил")
                }
        );
        Zoo ZooNumberTwo = new Zoo(
                1000,
                "ZooNumberTwo",
                new Animal[]{
                        new Animal("Попугай"),
                        new Animal("Игуана"),
                        new Animal("Макака"),
                        new Animal("Пеликан")
                }
        );
        Zoo ZooNumberThree = new Zoo(
                2000,
                "ZooNumberThree",
                new Animal[]{
                        new Animal("Белый медведь"),
                        new Animal("Носорог"),
                        new Animal("Зебра"),
                        new Animal("Аллигатор"),
                        new Animal("Мартышкв"),
                        new Animal("Орлан")
                }
        );
        Zoo[] zoos = {ZooNumberOne, ZooNumberTwo, ZooNumberThree};

        ZooService zooService = new ZooService();
        double result = zooService.getAveryPriceByZoos(zoos);
        //600+1000+2000=3600/3=1200.
        Assert.assertEquals(1200, result, 0.01);
        System.out.println(result);

    }

    @Test
    public void getTheBiggestZoo() {

        {
            Zoo ZooNumberOne = new Zoo(
                    600,
                    "ZooNumberOne",
                    new Animal[]{
                            new Animal("Жираф"),
                            new Animal("Змея"),
                            new Animal("Крокодил")
                    }
            );
            Zoo ZooNumberTwo = new Zoo(
                    1000,
                    "ZooNumberTwo",
                    new Animal[]{
                            new Animal("Попугай"),
                            new Animal("Игуана"),
                            new Animal("Макака"),
                            new Animal("Пеликан")
                    }
            );
            Zoo ZooNumberThree = new Zoo(
                    2000,
                    "ZooNumberThree",
                    new Animal[]{
                            new Animal("Белый медведь"),
                            new Animal("Носорог"),
                            new Animal("Зебра"),
                            new Animal("Аллигатор"),
                            new Animal("Мартышкв"),
                            new Animal("Орлан")
                    }
            );
            Zoo[] zoos = {ZooNumberOne, ZooNumberTwo, ZooNumberThree};

            ZooService zooService = new ZooService();
            String resultName = zooService.getNameByTheBiggestZoos(zoos);
            String expected = "ZooNumberThree";
            Assert.assertEquals(resultName, expected);

        }
    }
}