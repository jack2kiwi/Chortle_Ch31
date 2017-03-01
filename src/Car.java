import java.util.Scanner;

class Car
{
  // instance variables
  double startMiles;   // Stating odometer reading
  double endMiles;     // Ending odometer reading
  double gallons;      // Gallons of gas used between the readings

  // constructor
  public Car(){
	  Scanner reader = new Scanner(System.in);
	  System.out.println("Enter first reading:");
	  startMiles = reader.nextDouble();
	  System.out.println("Enter second reading:");
	  endMiles = reader.nextDouble();
	  System.out.println("Enter gallons:");
	  gallons = reader.nextDouble();
  }
  

  // methods
  double calculateMPG()
  {
    return  (endMiles - startMiles)/gallons;
  }
  
  boolean gasHog() {
	 return (15.0 > this.calculateMPG());
  }
  
  boolean economyCar() {
	  return (30.0 < this.calculateMPG());
  }

}