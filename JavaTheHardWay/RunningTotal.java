import static java.lang.System.*;
import java.util.Scanner;

public class RunningTotal{
  public static void main(String[] args){
    Scanner key = new Scanner(System.in);
    int current, total =0;

    out.print("Type in a unch of values and I'll add them up. ");
    out.println("I'll stop when you type zero.");

    do{
        out.print("Value: ");
        current = key.nextInt();

        if (current > 0){
        total += current;
        out.println("The total so far is: "+total);
        }
    }

    while ( current != 0);
      out.println("The final total is: "+total);

  }
}
