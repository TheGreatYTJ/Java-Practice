import java.util.Scanner;

public class Ddiff {
    int x;
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a, b,d;

         System.out.print("Enter first number: ");
         a = sc.nextInt();
        
         System.out.print("Enter second number: ");
         b = sc.nextInt();

         d = a-b;

         System.out.println("Difference : "+ d);

         
         sc.close();
        

    }

}
