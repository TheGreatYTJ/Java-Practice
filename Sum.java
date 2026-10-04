public class Sum {
   int x = 20;

   public static void main(String[] args) {
      int a = 5;
      int b = 10;
      int s = a + b;
      System.out.println("Sum of two numbers is " + s);
      Sum su = new Sum();
      int y = su.x + s;
      System.out.println(y);

   }
}
