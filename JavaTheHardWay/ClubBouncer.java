public class ClubBouncer {
  public static void main( String[] args){
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestList || age >= 21 || (gender.equals("F") && allure >+ 8)){
      System.out.println("You are allowed to enter the club.");
    }

    System.out.println("C-C-C-COMBO BREAKER");

    else {
      System.out.println("You are not allowed to enter the club.");
    }
  }
}// doesn't compile, line 12 interferes with if \ else statement. 
