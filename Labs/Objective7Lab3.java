import static java.lang.System.*;
import java.util.Scanner;

public class Objective7Lab3{
  public static void main(String[] args){
  Scanner key= new Scanner(System.in);
  int sel;

  while(true){
    printMenu();
    sel=key.nextInt();

    if (sel==1)
      out.println("Hello Human!");

    else if (sel==2)
      out.println(" Apples, Bananas, Coconuts");

    else if (sel ==3){
    out.println("Goodbye");
    break;
    }
  }
  key.close();
}
public static void printMenu(){
  out.println("_____Menu_____");
  out.println("1: Say Hello");
  out.println("2: List My favorite foods");
  out.println("3: EXIT");
  out.println();
}

}
