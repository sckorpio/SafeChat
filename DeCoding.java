
/**
 * Write a description of class Encryptology here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class DeCoding
{
  String st,st2,code;
   int rc,move=0;
    private void input()throws IOException
   {
       InputStreamReader in=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(in);
       
       System.out.println("enter the string(in code) you want to Decode"+"\n");
       st=br.readLine();
       
       System.out.println("do you wanna continue...?"+"\n"+"\t"+"* Press Y to Yes "+"\n"+"\t"+"* Press N to back");
       char ch=(char)br.read();
       
       if(ch=='Y'||ch=='y')
       {
         getCode ob=new getCode();
         code=ob.giveCode(ch);
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
        st2=ob.DisplayDecode(st,move);
       System.out.println(st2);
       DeCoding ob2=new DeCoding();
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
        DeCoding ob=new DeCoding();
        ob.input();
        ob.calculateMove();
        ob.display();
    }
}

        
        
  





