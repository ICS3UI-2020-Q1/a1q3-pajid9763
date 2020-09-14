import java.util.Scanner;
/**
 * a program to find the total cost of chromebook parts
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user how many chromebook chargers
  System.out.println("How many chromebook chargers?");
  double charger = input.nextInt();
  // ask the user how many motherboards
  System.out.println("How many motherboards?");
  double motherboard = input.nextInt();
  // ask the user how many mice
  System.out.println("How many mice?");
  double mice = input.nextInt();

  // calculate the costs for each part
  double charger_sum = (charger * 34.99);
  double motherboard_sum = (motherboard * 127.50);
  double mice_sum = (mice * 18.00);
  double total = (charger_sum + motherboard_sum + mice_sum);
  double tax = (total * 0.13);
  double final_total = (total + tax);

  // tell the user their total costs
  System.out.println("Subtotal = " + "$" + total);
  System.out.println("Taxes = " + "$" + tax);
  System.out.println("Total = " + "$" + final_total);
  }
}
