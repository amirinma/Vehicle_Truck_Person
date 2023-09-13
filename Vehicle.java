/** Vehicle.java
 * This class defines a Vehicle.  It stores information for the
 * manufacturer, number of cylinders, and owner information. 
 */
public class Vehicle { 
   private String manufacturer;
   private int cylinders;
   private Person owner;

   /** Empty constructor 
    */
   public Vehicle () {
	      // ITP 220 - complete this method  (hint - it should not be left blank) 
         manufacturer = " No Manufacturer";
         cylinders = 0;
         owner = new Person();      
   }

   /** Argument constructor 
    *  @param man (String) - manufacturer of this Vehicle
    *  @param cylinders (int) - number of cylinders in this Vehicle
    *  @param owner (Person) - owner of this Vehicle
    */
   public Vehicle(String manufacturer, int cylinders, Person owner) {
	  // ITP 220 - complete this method 
     manufacturer = manufacturer;
     cylinders = cylinders;
     owner = owner;
   }

   /** Copy constructor 
    * @param theObject (Vehicle) - object whose attributes will be used to
    *  create this new Vehicle instance
    */
   public Vehicle(Vehicle other) {
	  // ITP 220 - complete this method  
     manufacturer = other.manufacturer;
     cylinders = other.cylinders;
     owner = other.owner;            
   }

   /** Method to print the attributes of this Vehicle instance
    * @return (String) - user displayable String describing this Vehicle
    */
   public String toString() {
	  // ITP 220 - complete this method    
     return (manufacturer + " " + cylinders  + " " + owner);  
   }

   /** Equals method to compare this Vehicle to another Object. 
    *  @param other - Object being compared to 'this'
    *  @return - TRUE if other contains the same information as 'this'
    */
   public boolean equals(Vehicle other) {
	  // ITP 220 - complete this method  
     return (getManufacturer().equals(other.getManufacturer()));            
   }

   public String getManufacturer() {
       return manufacturer;
   }
   
   public void setManufacturer(String man) {
      
   }
   
   public int getCylinders() {
      return cylinders; 
   }
      
   public void setCylinders(int cylinders) {
       
   }

   public Person getOwner() {
	   // ITP 220 - complete this method
      return owner; 
   }
   
   public void setOwner(Person owner) {
	   // ITP 220 - complete this method  
	   // remember should not maintain a reference to the owner passed in
      owner = owner;
   }
}
