import static java.lang.System.*;

public class OverlyComplexFlag{
  public static void main (String[] args){
    pTopHalf();

    p48Colons();
    p48Ohs();
    p48Colons();
    p48Ohs();
    p48Colons();
    p48Ohs();
  }

  public static void p48Colons(){
    out.println( "|::::::::::::::::::::::::::::::::::::::::::::::::|" );
  }

  public static void p48Ohs(){
    out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
  }

  public static void p29colons(){
    out.println( "|:::::::::::::::::::::::::::::|" );
  }

  public static void pPledge(){
    out.println( "I pledge allegiance to the flag." );
  }

  public static void p29Ohs(){
    out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
  }

  public static void p6Stars(){
    out.print( "| * * * * * * " );
  }

  public static void p5Stars(){
    out.print( "| * * * * * " );
  }

  public static void pSixStarLibe(){
    p6Stars();
    p29Ohs();
  }

public static void pTopHalf(){
  out.println( " ________________________________________________" );
  pSixStarLine();
  pFiveStarLine();
  pSixStarLine();
  pFiveStarLine();
  pSixStarLine();
  pFiveStarLine();
  pSixStarLine();
  }
}
