	
public class ClassJava implements centralTrafficeInterface,NewInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		centralTrafficeInterface k = new ClassJava();
		NewInterface j = new ClassJava();
		k.RedGo();
		k.FlashYellow();
		k.GreenGo();
		j.Railwayman();
	}

	@Override
	public void RedGo() {
		// TODO Auto-generated method stub
		System.out.println("Redgo channel");
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("GreenGo channel");

	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("FlashYellow channel");

	}

	@Override
	public void Railwayman() {
		// TODO Auto-generated method stub
		System.out.println("The Railway Guy");
	}

}
