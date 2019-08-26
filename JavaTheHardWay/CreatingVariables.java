public class CreatingVariables{
  public static void main( String[] args){
      int x,y, age, year;
      double seconds, e, checking, pi;
      String firstName, lastName, title, month, sign;

      x = 10;
      y = 400;
      age = 25;
      year = 1994;

      seconds = 4.71;
      e = 2.71828182845904523536;
      checking = 1.89;
      pi = 3.14159265359;

      firstName = "Cesar";
      lastName = "Moreno";
      title = "Mr.";
      sign = "Virgo";
      month = "September";

      System.out.println("TYhe variable x constains "+ x);
      System.out.println("The value "+ y +" is stored in the variable y.");
      System.out.println("The experiment took " + seconds +" seconds");
      System.out.println("A favorite irrational # is Euler's number: " + e);
      System.out.println("Hopefully you have more than $" + checking + "!");
      System.out.println("My name's " +title+ " "+firstName + lastName);
      System.out.println("I was born in "+month+" "+" of the year "+year+" "+", I am "+age+" years old");
      System.out.println("My zodiac sign is "+sign);
      System.out.println("My favorite constant is Pi, which is: "+pi);
  }

}
