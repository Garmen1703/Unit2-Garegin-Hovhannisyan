import java.util.Random;

public class RandomNumbers{
  public static void main(String[] args){
    Random rand = new Random();

    rand.nextInt(10);
    System.out.println("# [0,9]: = " + rand.nextInt(10));

    System.out.println("# [1,10]: = " + (int)(Math.random()*10));

    System.out.println("# [20,34]: " + (int)(Math.random()*15 + 20));

    System.out.println("# [-10,9]: " +(int)(Math.random()*20 - 10));

    rand.nextDouble();
    System.out.println("# [0,1): " + Math.random());
    
    System.out.println("# [0,6): " + (Math.random() * 6));
  }
}
