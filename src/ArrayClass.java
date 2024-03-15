
public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		// Multi Dimensional code

		// TODO Auto-generated method stub
		//// a[row][coloum]

		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		// System.out.println(a[1][0]);

		int b[][] = { { 2, 4, -1 }, { 3, 4, 7 }, { 0, 2, 9 } };
	int min = b[0][0];
		//int max = b[0][0];
		// System.out.println(b[2][0]);

		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) 
			{
				if (b[i][j] > min) {
					min = b[i][j];
				}
			}
		}
		System.out.println(min);

	}

}
