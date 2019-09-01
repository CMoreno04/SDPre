import static java.lang.System.*;
import java.util.Scanner;

public class Objective6Lab5{
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    int inp;

    while (true) {
      out.println("_____Menu_____");
      out.println("1: Say Hello");
      out.println("2: List My favorite foods");
      out.println("3: EXIT");
      out.println();

      inp=key.nextInt();

      if (inp==1)
        out.println("Hello Human!");

      else if (inp==2)
        out.println("Apples, Banans, Coconuts");

      else if (inp==3){
        out.println("Goodbye! ");
        break;}

    }
    key.close();
  }
}
