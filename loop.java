import java.util.Scanner;

public class loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the n: ");
        int n = sc.nextInt();

        int sum =0; 

        for(int i=0; i<n; i++){
            sum = sum+i+1;

        }
        System.out.println("Sum: "+sum );
            
            
      sc.close();
    }
}
