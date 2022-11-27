package keywork_super;

public class Apple extends Fruits {
   public int price_of_the_fruit(int price) {
	   return price;
   }
   public void call() {
	   super.fruit_name("Apple");
	   System.out.println("Price of the fruit is Rs."+price_of_the_fruit(100));
   }
}
