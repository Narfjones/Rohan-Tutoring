package Rohan;
// ****************************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// Name:
//
// Date: 
//         
// ****************************************************************

public class Yorkshire extends Dog {
    private int age;

    //-------------------------------------------
    // 1-arg Constructor
    // @param name   The Yorkshire's name.
    //-------------------------------------------
    public Yorkshire(String name, int age) {
        super(name);
        this.age = age;
    }

    // ------------------------------------------------------------
    // Add Required Methods
    // ------------------------------------------------------------
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int dogYears() {
        return age * 5;
    }
}
