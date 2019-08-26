import java.util.Scanner;

public class Objective3Lab3{
  public static void main( String[] Args){
    Scanner input = new Scanner(System.in);
    int birthYear, age, currentYear;

    birthYear=0;

    System.out.println("How are old are you?");
    age=input.nextInt();

    System.out.println("What year are we currently in?");
    currentYear=input.nextInt();

    birthYear=currentYear-age;

    System.out.println("You where born in "+birthYear+".");
    input.close();

  }
}
