
/**
 * Write a description of class help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Help
{
    private void drawLine(int n)
{
         for(int i=0;i<n;i++)
        System.out.print("_");
        System.out.println();
       
    }      


void display()throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
      
        
        System.out.println("'HIDE & SEEK' is a program where you can code or decode any message");
        System.out.println("And How it works.....?"+"\n");
        drawLine(65);
        System.out.println("Select the choice if you want coding or decoding a message...."+"\n");
       
        System.out.println("In case you want to turn your message in code then...");
         drawLine(80);
         System.out.println("\n"+
                            "STEP#1-- Select for CODING"+ "\n"+
                            
                            "STEP#2-- Enter your message and press Enter "+"\n"+
                            "         ----------------------------------"+"\n"+"\n"+
                            
                            
                            "             example..Input--- I m going to Party this Night..."+"\n"+"\n"+   
                            
                            
                            "STEP#3-- When you r satisfied Select Continue..."+"\n"+
                            "        -------------------------------------   "+"\n"+"\n"+
                            
                            "         Program Will provide you a Seceret Access Code"+"\n"+
                            "         ----------------------------------------------"+"\n"+
                            "                   example..A=77"+"\n"+"\n"+

                           
                            "        And your message in coded form..."+"\n"+
                            "        -------------------------------   "+"\n"+
                            
                           "         example...$M@65$ U y sauzs fa Bmdfk ftue Zustf..."+"\n"+"\n"+
                           
                         
                            "    So...it would be..safe to send such message bcoz no one will be able to read it.."+"\n"+
                            "    Except u & one...who knows That Seceret Code...");
                            
            drawLine(80);
            System.out.println("\n"+"Incase of decoding a message then.. ");
            drawLine(80);
            System.out.println("\n"+
                                "STEP#1--Select for DeCoding"+"\n"+
                               
                                "STEP#2-- Enter your message and press Enter "+"\n"+
                                "         ----------------------------------"+"\n"+"\n"+
                            
                            
                                "             example..Input---$M@65$ U y sauzs fa Bmdfk ftue Zustf..."+"\n"+
                                "                                           (which we have coded before...)"+"\n"+"\n"+
                              
                              
                                "STEP#3-- When you r satisfied Select Continue..."+"\n"+
                                "         -------------------------------------   "+"\n"+"\n"+
                            
                                "         Program Will ask you for the Seceret Access Code"+"\n"+
                                "         ------------------------------------------------"+"\n"+"\n"+
                            
                                "STEP#4-- Enter the code.."+"\n"+                              
                                "                   example..A=77"+"\n"+"\n"+
                                
                                
                                "        Program will Decode the message (if the code is correct)"+"\n"+
                                "       ------------------------------------------------------"+"\n"+"\n"+
                                
                                "        OUTPUT--I m going to Party this Night..."+"\n"+"\n");
                                
             drawLine(80);                   
                                
                                 
           }
                    }
         
                           
        