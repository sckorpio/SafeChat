
/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display
{
   String str=""; int i;  
 public String DisplayCode(String st,int m,String code)
    {
        BlackBox ob=new BlackBox();
         String coder=ob.dissolve(code);
        
        
        for(i=0;i<st.length();i++)
        {
            char ch=Character.toUpperCase(st.charAt(i));
            int k=0;
            
            if((Character.isLetter(ch)))
            {
                k=((int)ch)+m;
               
                if(k<65||k>90)
                {
                if(k<65)
                  k=k+26;
                else if(k>90)
                  k=k-26;
                } 
                
                if(Character.isLowerCase(st.charAt(i)))
                str+=Character.toLowerCase((char)k);
                else
                str+=(char)k;
            }
            
            else
             str+=ch;
          }
          
          str="$"+coder+"$"+" "+str;
          
          
        return(str);
        }
    
    
    
    
        
        
      public String DisplayDecode(String st,int m)
    {
        
        BlackBox ob=new BlackBox();
        boolean s =ob.solve(st,m);
        
        
        
        if(s=true)
        {
        
            for(i=6;i<st.length();i++)
          {
            char ch=Character.toUpperCase(st.charAt(i));
            int k=0;
            
              if((Character.isLetter(ch)))
              {
                 k=((int)ch)-m;
               
                   if(k<65||k>90)
                  {
                     if(k<65)
                     k=k+26;
                     else if(k>90)
                     k=k-26;
                   } 
                
                 if(Character.isLowerCase(st.charAt(i)))
                 str+=Character.toLowerCase((char)k);
                 else
                 str+=(char)k;
              }
            
            else
             str+=ch;
          }
        }
          
      
        
        
        else
      str="Invalid code"+"\t"+"try again!!!";
    
      
      return(str);
    }   
}
        
   
