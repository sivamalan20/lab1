import java.util.*;
public class Odd_Even 
{
    public static void main(String[] args) 
    {
        int n;
      //the next three lines are generally used to read input from users in all java program
        Scanner s = new Scanner(System.in);     
        System.out.print("Enter the number ");
        n = s.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The given number "+n+" is Even ");
        }
        else
        {
            System.out.println("The given number "+n+" is Odd ");
      }
    }
}
