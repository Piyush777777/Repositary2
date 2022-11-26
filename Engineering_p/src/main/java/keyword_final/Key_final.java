package keyword_final;
//Final keyword is used to restrict the user
public final class Key_final {
	public void mark(String a , int m) {
		System.out.println("Marks aquired by " + a +" is "+m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Key_final k = new Key_final();
		k.mark("Prince" , 90);
	}

}
