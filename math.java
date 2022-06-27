import java.util.Scanner;
public class math{
    public static void main(String[] args)
    {
        System.out.println("Enter 1st Number");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b=sc.nextInt();
        int add= a+b;
        System.out.println("The sum is "+add);
                              
    }
}