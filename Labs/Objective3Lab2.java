import java.util.Scanner;

public class Objective3Lab2{
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    String name;

    System.out.println("What's your name?");
    name=input.next();
    System.out.println("Hello "+name);

    input.close();

  }
}
