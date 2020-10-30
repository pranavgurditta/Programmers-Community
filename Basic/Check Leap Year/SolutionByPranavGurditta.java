import java.util.*;
class Leap_year
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year.");
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Enter a positive number.");
            n=sc.nextInt();
        }
        Leap_year obj=new Leap_year();
        if(obj.leap_year(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public boolean leap_year(int n)
    {
        if(n %4==0)
            return true;
        else
            return false;
    }
    
}
