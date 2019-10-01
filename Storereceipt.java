import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Storereceipt{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Insert # of books bought:");
    int books = input.nextInt();
    System.out.println("Inert # of movies bought:");
    int movies = input.nextInt();
    System.out.println("Insert pounds of peanuts bought:");
    double peanuts = input.nextDouble();

//Creating variables
    int bookCost = books * 9;
    double movieCost = movies * 13.97;
    double peanutCost = peanuts * 1.72;
    double shippingBook = books * .95;
    double shippingMovies = movieCost * .04;
    double shippingPeanuts = peanuts * .3;
    final double TAX = .072;


  //Setting up Decimal Format
  DecimalFormat fmt = new DecimalFormat("0.00");

  //Readout

    System.out.println("==============================================");
    System.out.println("----------------------------------------------");
    System.out.println("            Date:" + (int)(Math.random()*12 + 1) + "/" + (int)(Math.random()*28 +1) +"/19");
    System.out.println("     Thank you for Shopping at          ");
    System.out.println("            Steve's S-Mart                ");
    System.out.println("            Cashier: Dave       ");
    System.out.println("----------------------------------------------");
    System.out.println("SUBTOTAL:");
    System.out.println("  Books:                              $" + fmt.format(bookCost));
    System.out.println("  Movies:                             $" + fmt.format(movieCost));
    System.out.println("  Peanuts:                            $" + fmt.format(peanutCost));
    System.out.println("SHIPPING:");
    System.out.println("  Books:                              $" + fmt.format(shippingBook));
    System.out.println("  Movies:                             $" + fmt.format(shippingMovies));
    System.out.println("  Peanuts:                            $" + fmt.format(shippingPeanuts));
    System.out.println("TAXES:");
    System.out.println("Tax total:                            $" + fmt.format(((bookCost * TAX)+(movieCost * TAX))));
    System.out.println("----------------------------------------------");
    System.out.println("GRAND TOTAL:                          $" + fmt.format((bookCost+movieCost+peanutCost+shippingBook+shippingMovies+shippingPeanuts+(books *TAX)+(movies * TAX))));
  }
}
