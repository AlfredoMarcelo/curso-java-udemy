import java.util.Scanner;

public class DetalleDeFactura {
  public static void main (String[] args){

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to CSSM, \nEnter the name for the bill");
    String billName = keyboard.nextLine();
    System.out.println("Enter the price of first item");
    double firstPrice = keyboard.nextDouble();
    System.out.println("Enter the price of second item");
    double secondPrice = keyboard.nextDouble();
    double total = firstPrice + secondPrice;
    double taxes = total * 0.19;
    double totalAfterTaxes = taxes + total;
    String message = "The bill " + billName
            + " have a net value to " + total
            + " and it's taxes is " + taxes
            + ".The total value to pay is " + totalAfterTaxes;
    System.out.println(message);

  }
}
