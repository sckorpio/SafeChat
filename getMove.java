
/**
 * Write a description of class getMove here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class getMove
{
     int move;   
public int getMove(String code)
   {
       char ch=Character.toUpperCase(code.charAt(0));
      String st=code.substring(2);
       int a=Integer.parseInt(st);
       int b=(int)ch;
       move=a-b;
       
       return(move);
    }
}