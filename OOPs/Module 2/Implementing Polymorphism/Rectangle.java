// Rectangle class - a subclass of Shape
public class Rectangle extends Shape {
    // Step 1: Declare private variables for length and width
    // Hint: Use double for both attributes
    private double length;
    private double width;
    
    // Step 2: Create a constructor that takes name, color, length, and width as parameters
    // Hint: Use super() to call the parent constructor and then initialize length and width
    public Rectangle(String name, String color, double length, double width){
        super(name, color);
        this.length=length;
        this.width=width;
    }
    // Step 3: Create getter methods for length and width
    // Hint: public double getLength() and public double getWidth()
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    // Step 4: Override the area() method to calculate the area of a rectangle
    // Hint: Area of a rectangle = length * width
    @Override
    public double area(){
        return length*width;
    }
    // Step 5: Override the perimeter() method to calculate the perimeter of a rectangle
    // Hint: Perimeter of a rectangle = 2 * (length + width)
    @Override
    public double perimeter(){
        return 2*(length+width);
    }
    // Step 6: Override toString() method to include rectangle-specific information
    // Hint: Call the parent's toString() method and append rectangle-specific details
    @Override
    public String toString(){
        return super.toString()+" Shape Type: Rectangle, Length: "+ length+ ", Width: "+width;
    }
}

