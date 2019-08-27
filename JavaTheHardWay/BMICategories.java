import java.util.Scanner;

public class BMICategories{
  public static void main ( String[] args){
    Scanner keyboard = new Scanner(System.in);
    double bmi, ft, inch, m, kg, pnd, inch1, inch2;


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

    System.out.print(" BMI "+bmi+", category: ");
    if ( bmi < 15.0){
      System.out.println( "very severelu underweight" );
    }
    else if ( bmi <= 16.0 ){
      System.out.println( "severely underweight" );
    }
    else if ( bmi < 18.5 ){
      System.out.println( "underweight" );
    }
    else if ( bmi < 25.0 ){
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0 ){
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 ){
      System.out.println( "moderately obese" );
    }
    else if ( bmi < 40.0 ){
      System.out.println( "severely obese" );
    }
    else {
      System.out.println( "very sverely/\"mordibly\"obese");
    }
  }
}
