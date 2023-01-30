package Rohan;

public class DogTest {
    public static void main(String[] args) {
        Yorkshire yorkie = new Yorkshire("Daisy", 5);
        System.out.println(yorkie.getName() + " is " + yorkie.getAge() + " years old, which is " + yorkie.dogYears() + " in dog-years, and says " + yorkie.speak());
    

        Labrador labby = new Labrador("Rosie", 10, "black");
        System.out.println(labby.getName() + " is " + labby.getAge() + " years old, which is " + labby.dogYears() + " in dog-years. She is " + labby.getColor() + " and says " + labby.speak());
        
    }
}
