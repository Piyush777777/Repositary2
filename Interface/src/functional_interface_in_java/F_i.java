package functional_interface_in_java;
// example of Functional interface
public class F_i implements Single_quality {
	public static void main(String args[]) {
		F_i f = new F_i();
        f.IQ();
	}
	@Override
	public void IQ() {
		// TODO Auto-generated method stub
		System.out.println("Woww.. your IQ is above 100");
	}
}
