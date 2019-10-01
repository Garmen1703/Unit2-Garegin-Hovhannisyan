//Question 2
// int chickens = 6;
// double food = 3.2;
// boolean isOn = true;

// Question 3
// int ans n*w+r;
// 33;
//double ans = r/m-w;
// 1.0;

//Question 4
//Random int = nextInt(0,12);
//^Declaring^ ^Initialization^;

//Question 5
public class Quiz1{
  public static void main(String [] args){
    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName = "Hernandez";
    String initFirst = firstName.substring(0,1);
    String initMiddle = middleName.substring(0,1);
    String initLast = lastName.substring(0,1);
    String initials = initFirst+initMiddle+initLast;
    String lowInitials = initials.toLowerCase();
    System.out.println(lowInitials);
  }
}

//Question 6
import java.util.Scanner;
import java.util.Random;
public class Quiz2{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Please provide an integer between 1 and 100");
    int num1 = scan.nextInt();
    int num2 = rand.nextInt(100)+1;
    int num3 = Math.abs(num1-num2);
    System.out.println("Your lucky # is: "+num3);
  }
}
