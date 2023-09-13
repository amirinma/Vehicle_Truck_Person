/** Person.java
 *  This class defines a Person's attributes.
 */
public class Person {
   private String name;

   /** Empty constructor 
    */
   public Person () {
	   // ITP 220 - complete this method (hint - it should not be left blank)
      name = "No name";
   }

   /** Argument constructor
    * @param theName (String) - name for this Person
    */
   public Person(String theName) {
      // ITP 220 - complete this method
      name = theName;
   }

   /** Copy constructor 
    * @param other (Person) - object whose attributes will be used to
    *  create this new Person instance
    */
   public Person(Person other) {
	      // ITP 220 - complete this method 
         System.out.println(other);
         System.out.println(name);
         if(other == null){
            name = "No name";
         }  
   }

   /** Method to print the attributes of this Person instance
    * @return (String) - user displayable String describing this Person
    */
   public String toString() {
	      // ITP 220 - complete this method   
         return name; 
   }

   /** Equals method to compare this Person to another Object. 
    *  @param other - Object being compared to 'this'
    *  @return - TRUE if other contains the same information as 'this'
    */
   public boolean equals(Person other) {
	      // ITP 220 - complete this method  
         System.out.println(name);
         System.out.println (name.equals(other.getName()));
         return (getName().equals(other.getName()));
   }
   
   public String getName() {
	      // ITP 220 - complete this method 
         return name;      
   }

   public void setName(String theName) {
	      // ITP 220 - complete this method    
         name = theName;   
   }
}
