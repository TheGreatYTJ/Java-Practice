import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter n: ");
       int n = sc.nextInt();
        if(n<0){
            System.out.println("factorial for negative no. not defined.");
        }
        else{
       int fac = 1;
       for(int i=1; i<=n; i++)
        fac = fac * i; 
    System.out.println("Factorial: "+ fac);
}
    sc.close();
    
}
}
