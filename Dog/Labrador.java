package Rohan;

public class Labrador extends Dog {
    private int age;
    private String color;

    //-------------------------------------------
    // 2-arg Constructor
    // @param name   The Labrador's name.
    // @param color  The Labrador's fur color.
    //-------------------------------------------
    public Labrador(String name, int age, String color) {
        super(name);
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String speak() {
        String str = super.speak() + super.speak() + "WOOF";
        return str;
    }

    @Override
    public int dogYears() {
        return age * 7;
    }
}
