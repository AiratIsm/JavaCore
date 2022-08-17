package Zoo;

public class ZooService {
    public double getAveryPriceByZoos(Zoo[] zoos) {

        double allPrice = 0;
        for (Zoo zoo : zoos) {
            allPrice = allPrice + zoo.getPrice();

        }
        return Math.round(allPrice/zoos.length);
    }

    public String getNameByTheBiggestZoos(Zoo[] zoos){

        String  name ="";
        int countAnimalByZoo=0;
        for (Zoo zoo : zoos){
            int animalSize=zoo.getAnimals().length;
            if (countAnimalByZoo < animalSize){
                countAnimalByZoo = animalSize;
                name=zoo.getName();
            }

        }
        return name;
    }
}
