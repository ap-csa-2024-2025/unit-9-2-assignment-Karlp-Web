import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Coffee c = new Coffee("large", true, 10, "latte");
    SpecialityCoffee sp = new SpecialityCoffee("small", false, 30, "machiatto", "matcha");

    System.out.println(c); //implicity calls c.toString();
    System.out.println(sp); //implicity calls sp.toString();





    
    // Uncomment to test the Car classes
    // CarTester.run();

    // Uncomment to test the Company classes
    // CompanyTester.run();
  }
}
