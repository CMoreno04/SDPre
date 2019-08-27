import static java.lang.System.*;
import java.util.Scanner;

public class Objective4Lab4{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num;

    out.println("Please enter a number: ");
    num = input.nextInt();

    if (num % 2 ==0){
      out.println("The number is Even");
    }

    else if (num % 2 ==1){
      out.println(" he number is Odd");
    }

    input.close();
  }
}
