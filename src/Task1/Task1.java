
package Task1;

import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;


 // Duncan Walker created on 14 Sept 2018

public class Task1 
{

    public static void main(String[] args) 
    {
       Stack<String> carStack = new Stack<>(); 
       String carData;
       
       File myFile = new File("cars.dta");
       
       try
        {
          FileReader fr = new FileReader(myFile);   
          BufferedReader br = new BufferedReader(fr); 
          
          while( (carData = br.readLine()) != null)
          {
            StringTokenizer  st = new StringTokenizer(carData,",");
            while(st.hasMoreTokens())  
             {
               carStack.push(st.nextToken());
             }
              
          }
            System.out.println("All car data processed\n\n");
        }
       catch(IOException e)
        {
          System.out.println("An error has occured ");       
        }
       
      
       
       printStack(carStack);
       swapLastTwo(carStack);
       printStack(carStack);
       
       
       
    }
    
    // methods for CarStack exercise
    
    private static void swapLastTwo(Stack<String> s)
    {
      Stack<String> backupStack = new Stack<>(); 
    
      int limit = s.size()-11;

      for (int k=1; k<=limit; k++)
       {
         backupStack.push(s.pop());
       }

       String tempStr1 = s.pop();
       String tempStr2 = s.pop();
       
       s.push(tempStr1);
       s.push(tempStr2);

      for (int k=1; k<=limit; k++)
       {
         s.push(backupStack.pop());
       }
       
      System.out.println("Swap comleted\n\n");
    }
    
    
    
    private static void printStack(Stack<String> stack)
    {
        if(stack.empty())
         {
           System.out.println("The stack is empty\n"); 
         }
        else
         {
          System.out.printf("%s \n",stack); 
         
          
            
         }
        
    }

   
}
