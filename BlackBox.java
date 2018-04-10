
/**
 * Write a description of class secret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackBox
{
  String coder;
  int k;char ch;
  boolean s;
public String dissolve(String code)
  {
     k=(int)(code.charAt(0));
     ch=(char)(Integer.parseInt(code.substring(2)));
      coder=ch+"@"+k;
      
      return(coder);
    }

    
 public boolean solve(String st,int m)
 {
     boolean f=false;
     coder=st.substring(0,5);
     k=(int)coder.charAt(1);
     char ch=(char)Integer.parseInt(coder.substring(3,4));
     String code2=ch+"="+k;
     
     getMove ob=new getMove();
     int p=ob.getMove(code2);
     
     if(p==m)
      f=true;
    
     return(f);
    }
}