import java.util.Scanner;

public class RudeQuestion{
  public static void main( String[] args){
    String name, color;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, "+name+"! How old are you?");
    age = keyboard.nextInt();

    System.out.println("So you're "+age+", eh? That's not very old.");
    System.out.print("How much do you weigh, "+name+"?");
    weight= keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, "+name+"?");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is "+income+" per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name+".");


    System.out.print("What is your favorite color?");
    color = keyboard.next();
    System.out.println(color+", that's an awesome color!");


  }
}
//It doesn't blow up when an int is enetered over a douible, Double can take ints and decimals.
//It doesn't blow-up if an int is entered on a string, is an input that string can understand.
//In the first question anything can be typed. Second question any integer, no decimals.
//Third question any integer or decimal, no strings.Finally, in the fourth question only integers and  decimals, it's a double (same case as the third).
