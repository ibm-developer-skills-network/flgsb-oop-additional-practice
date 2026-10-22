// Step 1: Create an abstract class Instrument
// This should include:
// - private String name
// - protected int year (year of manufacture)
// - constructor that initializes both fields
// - abstract method play() that returns a String
// - concrete method getInstrumentDetails() that returns information about the instrument
abstract class Instrument{
    private String name;
    protected int year;

    public Instrument(String name, int year){
        this.name = name;
        this.year = year;
    }

    public abstract String play();
    public String getInstrumentDetails(){
        return "Name: " + name + ", Year: " + year;
    }

    public String getName(){
        return name;
    }
}
// Step 2: Create an interface Tunable
// This should include:
// - abstract method tune() that returns a String
// - abstract method adjustPitch(boolean up) that returns a String (up means increase pitch)
interface Tunable{
    String tune();
    String adjustPitch(boolean up);
}
// Step 3: Create an interface Maintainable
// This should include:
// - abstract method clean() that returns a String
// - abstract method inspect() that returns a String
interface Maintainable{
    String clean();
    String inspect();
}
// Step 4: Create a concrete class StringedInstrument that extends Instrument
// This should include:
// - private int numberOfStrings
// - constructor that initializes name, year, and numberOfStrings
// - implementation of the abstract play() method
// - override getInstrumentDetails() to include number of strings
class StringedInstrument extends Instrument{
    private int numberOfStrings;

    public StringedInstrument(String name, int year, int numberOfStrings){
        super(name, year);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play(){
        return "Playing the stringed instrument";
    }

    @Override
    public String getInstrumentDetails(){
        return super.getInstrumentDetails() + ", Number of Strings: " + numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }
}


// Step 5: Create a concrete class Guitar that extends StringedInstrument 
// and implements Tunable and Maintainable
// This should include:
// - private String guitarType (acoustic, electric, etc.)
// - constructor that initializes all fields
// - implementation of all required interface methods
class Guitar extends StringedInstrument implements Tunable,Maintainable{
    private String guitarType;

    public Guitar(String name, int year, int numberOfStrings, String guitarType){
        super(name, year, numberOfStrings);
        this.guitarType = guitarType;
    }

    @Override
    public String play(){
        return "Playing the " + guitarType + " guitar with " + getNumberOfStrings() + " strings";
    }

    @Override
    public String getInstrumentDetails(){
        return super.getInstrumentDetails() + ", Type: " + guitarType;
    }

    @Override
    public String tune(){
        return "Tuning the " + guitarType + " guitar.";
    }

    @Override
    public String adjustPitch(boolean up){
        return up ? "Increasing pitch of the guitar" : "Decreasing pitch of the guitar";
    }

    @Override
    public String clean(){
        return "Cleaning the " + guitarType + " guitar";
    }

    @Override 
    public String inspect(){
        return "Inspecting the " + guitarType + " guitar from " + year;
    }
}
// Step 6: Create a concrete class Piano that extends Instrument
// and implements Tunable and Maintainable
// This should include:
// - private boolean isGrand
// - constructor that initializes all fields
// - implementation of the abstract play() method
// - implementation of all required interface methods
class Piano extends Instrument implements Tunable,Maintainable{
    private boolean isGrand;

    public Piano(String name, int year, boolean isGrand){
        super(name, year);
        this.isGrand = isGrand;
    }
    @Override
    public String play(){
        return "Playing the " + (isGrand ? "grand " : "upright ") + " Piano"; 
    }

    @Override
    public String getInstrumentDetails(){
        return super.getInstrumentDetails() + ", Type: " + (isGrand ? "grand " : "upright ");
    }

    @Override
    public String tune(){
        return "Tuning the Piano";
    }

    @Override
    public String adjustPitch(boolean up){
        return up ? "Increasing pitch of the piano" : "Decreasing pitch of the piano";
    }

    @Override
    public String clean(){
        return "Cleaning the Piano";
    }

    @Override 
    public String inspect(){
        return "Inspecting the " + (isGrand ? "grand " : "upright ") + " Piano from " + year;
    }
}

// Step 7: Create a public class MusicShop to test the classes
// This should include:
// - main method that:
//   1. Creates an array of Instrument objects including Guitar and Piano instances
//   2. Iterates through the array calling play() for each instrument
//   3. Demonstrates polymorphism by testing if each instrument is Tunable or Maintainable
//      and if so, calls the appropriate methods 
public class MusicShop {
    public static void main(String[] args) {
        // Create an array of Instrument objects
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar("Fender Stratocaster", 2020, 6, "electric");
        instruments[1] = new Piano("Steinway", 2015, true);
        instruments[2] = new Guitar("Martin", 2018, 12, "acoustic");
        
        // Demonstrate polymorphism by calling play() for each instrument
        System.out.println("===== PLAYING INSTRUMENTS =====");
        for (Instrument instrument : instruments) {
            System.out.println(instrument.play());
            System.out.println(instrument.getInstrumentDetails());
        }
        
        // Demonstrate interface type checking and method calling
        System.out.println("\n===== MAINTAINING INSTRUMENTS =====");
        for (Instrument instrument : instruments) {
            System.out.println("Working with: " + instrument.getName());
            
            // Check if this instrument is Tunable
            if (instrument instanceof Tunable) {
                Tunable tunableInstrument = (Tunable) instrument;
                System.out.println(tunableInstrument.tune());
                System.out.println(tunableInstrument.adjustPitch(true));
            }
            
            // Check if this instrument is Maintainable
            if (instrument instanceof Maintainable) {
                Maintainable maintainableInstrument = (Maintainable) instrument;
                System.out.println(maintainableInstrument.clean());
                System.out.println(maintainableInstrument.inspect());
            }
            
            System.out.println("-----");
        }
    }
}
