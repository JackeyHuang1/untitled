// Cat class definition
public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;

    private String oldAge;

    // constructor
    public Cat(String catName, int catAge, double catWeight) {
        name = catName;
        age = catAge;
        weight = catWeight;
        oldAge = "";
    }

    // method that introduces the Cat
    public void introduce() {
        if (age >= 7) {
            oldAge = "an older";
        } else {
            oldAge = "a younger";
        }
        System.out.println("Hello my name is " + name + " and i am " + oldAge + " cat");
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}



