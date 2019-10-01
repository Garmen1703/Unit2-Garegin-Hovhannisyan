import java.util.Random;

public class Phone{
  public static void main(String[] args){
    Random phone = new Random();
    int dig1 = phone.nextInt(8)+2;
    int dig2 = phone.nextInt(9);
    int dig3 = phone.nextInt(10);
    int dig4 = phone.nextInt(10);
    int dig5 = phone.nextInt(10);
    int dig6 = phone.nextInt(10);
    int dig7 = phone.nextInt(10);
    int dig8 = phone.nextInt(10);
    int dig9 = phone.nextInt(10);
    int dig10 = phone.nextInt(10);

    System.out.println("Phone number: ("+dig1+dig2+dig3+") "+dig4+dig5+dig6+"-"+dig7+dig8+dig9+dig10);
  }
}
