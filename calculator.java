import java.util.Scanner;

public class calculator { 
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a: ");
    int a =sc.nextInt();
    System.out.print("Enter b: ");
    int b =sc.nextInt();
    System.out.print("Enter operator: ");
    char op =sc.next().charAt(0);

    double result = 0;

    switch(op){
    case'+':
    result = a+b;
    break;

    case'-':
    result = a-b;
    break;

    case'*':
    result = a*b;
    break;

    case'/':
    if(b!=0)
        result= (double)a/b;
    else
        System.out.println("Error!,canot be divide by 0");
    break;

    default:
        System.out.println("invalid operator");

    }
    sc.close();

  System.out.println("Result: " + result );  
}
}
