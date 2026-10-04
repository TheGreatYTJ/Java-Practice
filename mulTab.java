import java.util.Scanner;
public class mulTab {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(n+" ki Table:");

        for(int i=1; i<=10; i++)
            System.out.println(n+" * "+i+" = "+n*i);

sc.close();
    }

    
}
