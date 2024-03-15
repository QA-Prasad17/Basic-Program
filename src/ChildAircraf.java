
public class ChildAircraf extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildAircraf a = new ChildAircraf();
		a.bodycolour();
		a.engine();
		a.SaftyGuidelines();
		
	}

	@Override
	public void bodycolour() {
		// TODO Auto-generated method stub
		System.out.println("red");
	}

}
