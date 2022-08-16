package classes.auto;

public class Auto {
   private String model;
   private String brand;
   private int numberOfPassengerSeats;
   private String transmissionType;

   public Auto(String model, String brand, int numberOfPassengerSeats, String transmissionType) {
      this.model = model;
      this.brand = brand;
      this.numberOfPassengerSeats = numberOfPassengerSeats;
      this.transmissionType = transmissionType;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public int getNumberOfPassengerSeats() {
      return numberOfPassengerSeats;
   }

   public void setNumberOfPassengerSeats(int numberOfPassengerSeats) {
      this.numberOfPassengerSeats = numberOfPassengerSeats;
   }

   public String getTransmissionType() {
      return transmissionType;
   }

   public void setTransmissionType(String transmissionType) {
      this.transmissionType = transmissionType;
   }

   @Override
   public String toString() {
      return "Auto{" +
              "model='" + model + '\'' +
              ", brand='" + brand + '\'' +
              ", numberOfPassengerSeats=" + numberOfPassengerSeats +
              ", transmissionType='" + transmissionType + '\'' +
              '}';
   }
}
