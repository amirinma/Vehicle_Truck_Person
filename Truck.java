import java.lang.*;
public class Truck extends Vehicle {
   private double towingCapacity;
   private double loadCapacity;
   public Truck(){
      super();
      towingCapacity = 7000;
      loadCapacity = 1000;
   }
   public Truck(Truck other){
      if(other == null){
         throw new NullPointerException();
      }
   }
   public Truck(String manufacturer, int cylinders, Person owner, double theTowCap, double theLoadCap){
      super(manufacturer, cylinders, owner);
      if(theTowCap >= 0 && theLoadCap >= 0){
         towingCapacity = theTowCap;
         loadCapacity = theLoadCap;
      }else {
         System.out.println("Negative input.");
         System.exit(0);
      }

   }
   public double getLoadCap(){
      return loadCapacity;
   }
   public double getTowingCap(){
      return towingCapacity;
   }
   public void setLoadCap(double theLoadCap){
      loadCapacity = theLoadCap;
   }
   public void setTowingCap(double theTowCap){
      towingCapacity = theTowCap;
   }
   

}