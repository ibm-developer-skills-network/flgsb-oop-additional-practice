
public class Shape {
    // Step 1: Declare private variables for name and color
    // Hint: Use String for both attributes
    private String name;
    private String color;

    // Step 2: Create a constructor that takes name and color as parameters
    // Hint: Initialize the instance variables with the parameter values
    public Shape(String name, String color){
        this.name=name;
        this.color=color;
    }

    // Step 3: Create getter methods for the attributes
    // Hint: Use the format: public returnType getAttributeName()
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    // Step 4: Create a method called area() that will be overridden by subclasses
    // Hint: Return 0.0 in the superclass version
    public double area(){
        return 0.0;
    }
    // Step 5: Create a method called perimeter() that will be overridden by subclasses
    // Hint: Return 0.0 in the superclass version
    public double perimeter(){
        return 0.0;
    }

    // Step 6: Create a toString() method that returns information about the shape
    // Hint: Include the name and color in the returned string
    public String toString(){
        return "Name: " + name + ", Color: " + color;
    }
}
