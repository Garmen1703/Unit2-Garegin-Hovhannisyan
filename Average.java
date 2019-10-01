import java.util.Scanner;


public class Average{
  public static void main (String []args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three integer values: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    double num4 = num1 + num2 + num3;
    double num5 = num4/3;

    System.out.println("The Average is: " + num5);
  }
}
