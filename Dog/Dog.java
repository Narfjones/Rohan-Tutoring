package Rohan;
// ****************************************************************
// Dog.java
//
// An abstract class that holds a dog's name and can make it speak.
//
// ****************************************************************
public abstract class Dog
   {
   private String name;

    // ------------------------------------------------------------
    // Constructor 
    // @param name    The dog's name.
    // ------------------------------------------------------------
   public Dog(String name)
      {
      this.name = name;
      }


    // ------------------------------------------------------------
    // accessor method
    // @return   The dog's name.
    // ------------------------------------------------------------
   public String getName()
      {
      return name;
      }

    // ------------------------------------------------------------
    // speak method
    // @return  The dog's "bark".
    // ------------------------------------------------------------
   public String speak()
      {
      return "Woof";
      }

    // ------------------------------------------------------------
    // dogYears method
    // @return  The dog's age in dog-years.
    // ------------------------------------------------------------
   public abstract int dogYears();
   }