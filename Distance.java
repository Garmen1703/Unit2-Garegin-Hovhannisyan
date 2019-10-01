import  java.util.Scanner;
//import java.util.Math;

public class Distance{
  public static void main (String [] args){
    Scanner input =new Scanner(System.in);
    System.out.println("Please insert name:");
    String name = input.next();

    System.out.println("Insert coordinates(X1,X2,Y1,Y2)");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    int num4 = input.nextInt();

    int num5 = num2 - num1;
    int num6 = num4 - num3;
    int num7 = num5 * num5;
    int num8 = num6 * num6;
    int num9 = num7 + num8;
    double num10 = Math.sqrt(num9);


    System.out.println("Your name is: " + name);
    System.out.println("The d is " + num10);
  }
}
