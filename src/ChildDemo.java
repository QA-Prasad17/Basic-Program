
public class ChildDemo extends ParentDemo{
	
	
	String name = "AQ tester";
	public void getstringdata() {
		
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildDemo cd = new ChildDemo();
		cd.getstringdata();
		cd.note();
	}

}
