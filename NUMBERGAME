import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Random rand = new Random();
        Scanner sc=new Scanner(System.in);
        int number=rand.nextInt(100);
        System.out.println("You have 10 chances to guess the number");
        System.out.println("ALL THE BEST!!!!");
        int cnt=0;
        while(cnt!=10)
        {
            System.out.println("Enter the number");
            int n=sc.nextInt();
            if(n==number)
            {
                System.out.println("You have won the game");
                break;
            }
           else if(n<number)
            {
                System.out.println("OOOPS!! Low number");
                
            }
             else if(n>number)
            {
                System.out.println("OOOPS!! High number");
                
            }
            cnt++;
        }
        System.out.println("Your chances are completed . BETTER LUCK NEXT TIME ");
    }
}
