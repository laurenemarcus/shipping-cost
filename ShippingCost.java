import java.io.Console;

public class ShippingCost {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is the weight of the package?");
    String stringPackageWeight = myConsole.readLine();
    Integer packageWeight = Integer.parseInt(stringPackageWeight);

    System.out.println("What is the distance the package will travel?");
    String stringDistanceToTravel = myConsole.readLine();
    Integer distanceToTravel = Integer.parseInt(stringDistanceToTravel);


    Integer cost = costCalculator(packageWeight, distanceToTravel);
    System.out.println("The total cost is: " + cost);
  }

  public static Integer costCalculator( Integer packageWeight, Integer distanceToTravel) {
    Integer priceModifier = 2;
    return ( packageWeight / 10 ) + (distanceToTravel / 5 ) * priceModifier;
  }
}
