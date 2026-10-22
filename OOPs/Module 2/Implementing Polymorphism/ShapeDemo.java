import java.util.Scanner;

// ShapeDemo class to demonstrate polymorphism with Shapes
public class ShapeDemo {
    public static void main(String[] args) {
        // Step 1: Create an array of Shape objects with size 5
        // Hint: Shape[] shapes = new Shape[5];
        Shape[] shapes = new Shape[5];

        // Step 2: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 3: Create an interactive menu to add shapes to the array
        int count = 0;

        while (true) {
            System.out.println("\n--- Shape Menu ---");
            System.out.println("1. Add a Circle");
            System.out.println("2. Add a Rectangle");
            System.out.println("3. Add a Triangle");
            System.out.println("4. Display all shapes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                if (count >= shapes.length) {
                    System.out.println("Array is full! Cannot add more shapes.");
                } else {
                    // Step 4: Prompt for Circle attributes
                    System.out.print("Enter name: ");
                    String cName = scanner.nextLine();
                    System.out.print("Enter color: ");
                    String cColor = scanner.nextLine();
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shapes[count] = new Circle(cName, cColor, radius);
                    // Step 5: Display details after adding
                    System.out.println("Shape added: " + shapes[count]);
                    System.out.println("Area: " + shapes[count].area());
                    System.out.println("Perimeter: " + shapes[count].perimeter());
                    count++;
                }
            } else if (choice == 2) {
                if (count >= shapes.length) {
                    System.out.println("Array is full! Cannot add more shapes.");
                } else {
                    System.out.print("Enter name: ");
                    String rName = scanner.nextLine();
                    System.out.print("Enter color: ");
                    String rColor = scanner.nextLine();
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    shapes[count] = new Rectangle(rName, rColor, length, width);
                    System.out.println("Shape added: " + shapes[count]);
                    System.out.println("Area: " + shapes[count].area());
                    System.out.println("Perimeter: " + shapes[count].perimeter());
                    count++;
                }
            } else if (choice == 3) {
                if (count >= shapes.length) {
                    System.out.println("Array is full! Cannot add more shapes.");
                } else {
                    System.out.print("Enter name: ");
                    String tName = scanner.nextLine();
                    System.out.print("Enter color: ");
                    String tColor = scanner.nextLine();
                    System.out.print("Enter side 1: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter side 2: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter side 3: ");
                    double side3 = scanner.nextDouble();
                    shapes[count] = new Triangle(tName, tColor, side1, side2, side3);
                    System.out.println("Shape added: " + shapes[count]);
                    System.out.println("Area: " + shapes[count].area());
                    System.out.println("Perimeter: " + shapes[count].perimeter());
                    count++;
                }
            } else if (choice == 4) {
                // Step 6: Display all shapes using polymorphism
                if (count == 0) {
                    System.out.println("No shapes added yet.");
                } else {
                    System.out.println("\n--- All Shapes ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println(shapes[i].toString());
                        System.out.println("Area: " + shapes[i].area());
                        System.out.println("Perimeter: " + shapes[i].perimeter());
                        System.out.println();
                    }
                }
            } else if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
