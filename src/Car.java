import java.util.Scanner;

class Car
{

  double startMiles;   // Stating odometer reading
  

  // constructor
  public Car(double odometer){
	  startMiles = odometer;
  }
  
  void fillUp(int miles, double gallons) {
	  System.out.println("filling station visit");
	  System.out.println("odometer");
	  System.out.println(startMiles);
	  System.out.println("gallons to fill tank");
	  System.out.println(gallons);
	  System.out.println("Miles per gallon:" + calculateMPG(miles, gallons));
	  if (gasHog(miles, gallons)) {
		  System.out.println("Gas Hog!");
	  } else if (economyCar(miles, gallons)) {
		  System.out.println("Economy Car!");
	  }
	  startMiles = miles;
  }
  

  // methods
  public double calculateMPG(int miles, double gallons)
  {
    return  (miles - startMiles)/gallons;
  }
  
  public boolean gasHog(int miles, double gallons) {
	 return (15.0 > this.calculateMPG(miles, gallons));
  }
  
  public boolean economyCar(int miles, double gallons) {
	  return (30.0 < this.calculateMPG(miles, gallons));
  }

}