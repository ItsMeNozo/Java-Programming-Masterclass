import java.util.Random; 

public class Main {
  public static void main(String[] args){
    Random random = new Random(); 
    int x = random.nextInt(6); // generate from 0 to 5
    System.out.println(x);
  }
}
