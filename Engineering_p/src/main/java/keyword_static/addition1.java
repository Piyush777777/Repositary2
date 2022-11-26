package keyword_static;

public class addition1 {
   static int a = 5;
   public static int addition(int b) {
	   a=a+b;
	   return a;
   }
   public static void main(String args[]) {
	   System.out.println(addition1.addition(10));
   }
}
