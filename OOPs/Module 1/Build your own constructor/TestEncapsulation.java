// TestEncapsulation class to test the Employee class
public class TestEncapsulation {
    public static void main(String[] args) {
        // Step 1: Create two instances of the Employee class
        // One using the parameterized constructor and one using default constructor with setters
        System.out.println("Creating first Employee using Parameterized Constructor");
        Employee employee1 = new Employee("Minidu Sathsara", 24, 45000.0);
        
        System.out.println("\nCreating second Employee using Setters");
        Employee employee2 = new Employee();
        employee2.setName("Divya Thathsarani");
        employee2.setAge(26);
        employee2.setSalary(55000.0);

        // Step 2: Print details of both employees
        System.out.println("\nInitial Display Employee Details:");
        employee1.displayDetails();
        employee2.displayDetails();

        // Step 3: Try setting invalid values (null name, age outside range, negative salary)
        // and see if your validation works
        System.out.println("\nValidate invalid values (null name, age outside range, negative salary)");
        employee1.setName("");
        employee2.setAge(70);
        employee1.setSalary(-15000.9);

        System.out.println("\nEmployee Details After invalid Values");
        employee1.displayDetails();
        employee2.displayDetails(); 
        
        // Step 4: Give both employees a 10% raise and display their details again
        System.out.println("\nGive both Employee 10% raise");
        employee1.giveRaise(10);
        employee2.giveRaise(10);

        System.out.println("\nDisplay details after raise");
        employee1.displayDetails();
        employee2.displayDetails(); 
        
        // Step 5: Clone the first employee and display the cloned employee details
        // Hint: Use try-catch block to handle CloneNotSupportedException
        // Employee clonedEmployee = (Employee) employee1.clone();
        System.out.println("\nCloning the First Employee..");
        try {
            Employee clonedEmployee = (Employee) employee1.clone();
            System.out.println("Cloned Employee Details: ");
            clonedEmployee.displayDetails();

            // Step 6: Modify the original employee and verify that the clone remains unchanged
            // This demonstrates that cloning creates a separate object
            System.out.println("Modifing original Employee Salary..");
            employee1.setSalary(25000.25);

            System.out.println("\nDisplaying Modified Employee Details");
            employee1.displayDetails();

            System.out.println("Cloned Employee Details after Modifing original Employee...");
            clonedEmployee.displayDetails();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }

        String result = compareSalaries(employee1, employee2);
        System.out.println("Salary Comparison: " + result);

        
    }
    // Step 7: Create a method that compares the salaries of two employees
    // and returns the name of the employee with the higher salary
    // If salaries are equal, return "Equal salaries"
    public static String compareSalaries(Employee emp1, Employee emp2){
        if(emp1.getSalary() < emp2.getSalary()){
            return emp1.getName() + " Has a Higher Salary";
        } else if (emp1.getSalary() > emp2.getSalary()){
            return emp2.getName() + " Has a Higher Salary";
        } else {
            return "Equal salaries";
        }
    }
}
