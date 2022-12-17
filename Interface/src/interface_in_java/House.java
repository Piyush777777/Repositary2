package interface_in_java;
//example of interface
public class House implements House_construction_material{

	public static void main(String args[]) {
		House h = new House();
		System.out.println(h.cement());
		System.out.println(h.no_of_bricks());
		System.out.println(h.Quantity_of_metal());
	}

	@Override
	public String cement() {
		// TODO Auto-generated method stub
		return "Ambuja cement";
	}

	@Override
	public int no_of_bricks() {
		// TODO Auto-generated method stub
		return 9000;
	}

	@Override
	public int Quantity_of_metal() {
		// TODO Auto-generated method stub
		return 230;
	}

}
