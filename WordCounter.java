import java.util.*;
public class Main{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       int len=str.length();
       int cnt=0;
       String temp="";
       for(int i=0;i<len;i++)
       {
           if(!Character.isAlphabetic(str.charAt(i)) && !Character.isDigit(str.charAt(i)))
           {
               
               if(temp.length()!=0)
               cnt++;
               temp="";
           }
           else{
               temp+=str.charAt(i);
           }
       }
      System.out.print("The number of words in the sentence are "+cnt+1);
       
    }
}
