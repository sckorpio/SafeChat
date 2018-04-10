 
import java.io.*;
public class getCode
{
String code="";
 
 public String getCode(char ch1)throws IOException
  {
      InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
       
        if(ch1=='Y'||ch1=='y')
          {
              char c=(char)(Math.random()*(91-64)+64);
              int m=(int)(Math.random()*(91-64)+64);
              code=c+"="+m;
           }
   return(code);
   }
        
      
    
      
      
      
      public String giveCode(char ch1)throws IOException
    {
      
      InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in); 
      
              if(ch1=='Y'||ch1=='y') 
             {
              System.out.println("Enter the code"+"\n"+"\t"+"(i.e, <alphbet>=<any digit b/w 65-90>)");
              code=br.readLine();
             }
      return(code); 
      }
             
           
       
    }

    