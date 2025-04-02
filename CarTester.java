public class CarTester
{
	public static void run()
	{
		// Create a Car object
		Car c = new Car("toyota", 80);
		// Print out the model
		System.out.println(c.getModel());
		// Print out the fuelLevel
		System.out.println(c.getFuelLevel());
		// Print how many miles are left with 23 mpg
		System.out.println(c.milesLeft(23));
		// Print the object
		System.out.println(c);
		// Create an ElectricCar object
		ElectricCar ec = new ElectricCar("toyota", 80);
		// Print out the model
		System.out.println(ec.getModel());
		// Print out the fuelLevel
		System.out.println(ec.getFuelLevel());
		// Print how many miles are left with 400 miles per charge
		sysyem.out.println(ec.milesLeft(400));
		// Print the object
		System.out.println(ec);
	}
}
