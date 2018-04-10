
/**
 * Write a description of class Encryptology here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Coding
{
  String st,st2,code;
   int rc,move;
   char ch;
    private void input()throws IOException
   {
       InputStreamReader in=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(in);
       
       System.out.println("enter the string you want to turn in code"+"\n");
       st=br.readLine();
       
       System.out.println("do you wanna continue...?"+"\n"+"\t"+"* Press Y to Yes "+"\n"+"\t"+"* Press N to back");
        ch=(char)br.read();
       
       if(ch=='Y'||ch=='y')
       {
         getCode ob=new getCode();
         code=ob.getCode(ch);
          System.out.println("code="+"\n"+code);
       }
       
       else if(ch=='N'||ch=='n')
       {
           main ob=new main();
           ob.play();
        }
        
        else 
        {
            System.out.println("Can't understand you...");
            input();
    }
       
  
    }
    
    private void calculateMove()
    {
        getMove ob=new getMove();
        move=ob.getMove(code);
       
     }
    
    private void display()
    {
        Display ob=new Display();
        st2=ob.DisplayCode(st,move,code);
       System.out.println("your coded message="+"\n"+st2);
       Coding ob2=new Coding();
       ob2.drawLine();
    }
         
      private void drawLine()
{
         for(int i=0;i<150;i++)
        System.out.print("_");
        System.out.println();
       
    }          
         
         
     public void play()throws IOException
    {
        Coding ob=new Coding();
        ob.input();
        ob.calculateMove();
        ob.display();
    }
}

        
        
  





