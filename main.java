
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
public class main
{
  
   char c; boolean s;
  
     
 
   public void ask()throws IOException
   {
        InputStreamReader in=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(in);
       
    
       System.out.println("\n"+"Enter your choice"+"\n"+"Press C for Coding a String"+"\n"+"Press D for Decoding a String"+"\n"+"Press H for Help..."+"\n"+"Press X to Exit!!!");
       c=(char)br.read();
    }
     
     
    private void drawLine()
{
         for(int i=0;i<90;i++)
        System.out.print("_");
        System.out.println();
       
    }
    
    
    
    
    
    
    
    
    public void play()throws IOException
    {
        s=true;
        
       while(s=true)
       {
       ask();
       drawLine();
         
       if(c=='C'||c=='c')
         {
             Coding ob=new Coding();
             ob.play();
            }
            
         else if(c=='D'||c=='d')
         {
             DeCoding ob=new DeCoding();
             ob.play();
             }
         
          
          else if(c=='H'||c=='h')
          {
              Help ob=new Help();
              ob.display();
            }
             else if(c=='x'||c=='X')
          {
             System.out.println("Bye!!!!!!"+"\n"+"\n");
       
             System.out.println("Prested by....."+"\t"+"Kartik...");
              s=false;
            }
             
             
             else
         {
         System.out.println("Can't UnderStand you...."+"\n");
        
         play();
        }
      }
    }
    
    
}