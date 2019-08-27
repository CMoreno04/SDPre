import static java.lang.System.*;
import java.util.Scanner;

public class Objective4Lab3{
  public static void main( String[] args){
    Scanner input = new Scanner(System.in);
    int userNum;

    out.println("Please enter a number: ");
    userNum = input.nextInt();

    if (userNum>0){
      out.println("The number is positive.");
    }
    else {
      out.print("The number is negative.");
    }
    input.close();
  }
}
