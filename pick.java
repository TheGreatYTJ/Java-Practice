import java.util.Scanner;
public class pick {
public static void main(String[ ] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    System.out.print("Enter choice(even/odd): ");
    String choice = sc.next();


    if(choice.equals("even")){
        System.out.println("The Even numbers are: ");
        for(int i=1; i<=n; i++){
           if(i%2==0){
           
        System.out.print(i +" ");
        }
    }
    }
    else if(choice.equals("odd")){
        System.out.println("The Odd numbers are: ");
        for(int i=1; i<=n ; i++){
            if(i%2!=0){
            
            System.out.print(i + " ");
    }
}
}
    else{
        System.out.println("invalid choice!!!");
    }
    sc.close();
}
    
}
