package classes.auto;

import java.util.Arrays;
// создаем класс
public class AutoService {

       public Auto[] getOnlyMersECars(Auto[] autos) {
      int count =0;
      for (Auto auto : autos){
          if (auto.getModel().equals("Mers") && auto.getBrand().contains("E")){
              count++;
          }
       }
      Auto[]result=new Auto[count];
      for (Auto auto : autos) {
         if (auto.getModel().equals("Mers") && auto.getBrand().contains("E")){
          count--;
          result[count] = auto;
      }

      }
        return result;
    }
    public Auto[] getOnlyBmwCars(Auto[] autos) {
        int count =0;
        for (Auto auto : autos){
            if (auto.getModel().equals("Bmv")){
                count++;
            }
        }
        Auto[]result=new Auto[count];
        for (Auto auto : autos) {
           if (auto.getModel().equals("Bmv")) {
               count--;
               result[count] = auto;

            }
        }
        return result;
    }
    public Auto[] getSportCars(Auto[] autos) {
        int count =0;
        for (Auto auto : autos){
            if (auto.getNumberOfPassengerSeats()==2){
                count++;
            }
        }
        Auto[]result=new Auto[count];
        for (Auto auto : autos) {
            if (auto.getNumberOfPassengerSeats()==2) {
                count--;
                result[count] = auto;

            }
        }
        return result;
    }

    public Auto[] getTransmissionType(Auto[] autos) {
        int count =0;
        for (Auto auto : autos){
            if (auto.getTransmissionType().equals("Automat")){
                count++;
            }
        }
        Auto[]result=new Auto[count];
        for (Auto auto : autos) {
            if (auto.getTransmissionType().equals("Automat")) {
                count--;
                result[count] = auto;

            }
        }
        return result;
    }
}