public class SpecialtyCoffee extends Coffee
{
  private String flavor;

  public SpecialtyCoffee()
  {
    super();
    flavor = "vanilla";
  }

  public SpecialtyCoffee(String type, String flavor)
  {
    super("small", false, 1, type);
    this.flavor = flavor;
  }

  public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
  {
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }

  // Method override of Coffee getPrice
  public double getPrice()
  {
    // returns 1.5x the regular coffee price
    return super.getPrice() * 1.5;
  }

  // Method override of Coffee toString
  public String toString()
  {
    // we will edit in class
    return super.toString() + "with" + this.flavor; //cleaer super. = parents stuff, this. = my stuff
  }

  // print a message that compares the prices of a regular Coffee
  // and a SpecialtyCoffee using both getPrice methods
  public void printPriceComparison()
  {
    System.out.println("A regular coffee costs " + super.getPrice()); //like the best
    System.out.println("This coffee costs " + this.getPrice()); //like okay
    System.out.println("This coffee costs " + getPrice());//like the least
  }//use super. or this. to make sure there are no ambiguities when coding
}
