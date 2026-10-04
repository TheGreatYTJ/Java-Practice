import java.util.Scanner;

public class Larger{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
         
        if(a==b&&b==c)
            System.out.println("All are equal.");
        else if(a>=b && a>=c)
            System.out.println(a+" largest no.");
        else if(b>=a && b>=c)
        System.out.println(b+" is largest.");
         else
            System.out.println(c+" is largest.");
        sc.close();
    }
    
}
