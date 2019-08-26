import java.util.Scanner;

public  class BMICalculator{
  public static void main (String [] args){
    Scanner keyboard = new Scanner(System.in);
    double m, inch, inch1, inch2, ft, kg, pnd, bmi;

    System.out.println("We are going to need your height in feet with inches.");
    System.out.print("First Feet: ");
    ft=keyboard.nextDouble();

    System.out.print("Now Inches: ");
    inch2=keyboard.nextDouble();

    System.out.print("Your weight in Pounds: ");
    pnd=keyboard.nextDouble();

    inch1=ft*12;
    inch=(inch1+inch2);
    m=inch/39.37;
    kg=pnd/2.205;

    bmi=kg / (m*m);

    System.out.println( "Your BMI is: "+ bmi);
  }
}
