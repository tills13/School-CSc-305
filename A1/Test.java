import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Matrix a = new Matrix(3, 1);
		Matrix b = new Matrix(3, 1);

		a.matrix[0][0] = 8;
		a.matrix[1][0] = 3;
		a.matrix[2][0] = 5;

		b.matrix[0][0] = 1;
		b.matrix[1][0] = 3;
		b.matrix[2][0] = 2;

		//a.matrix[0][0] = 1;
		//a.matrix[0][1] = 3;
		//a.matrix[1][0] = 4;
		//a.matrix[1][1] = 2;	

		/*a.matrix[0][0] = 8;
		a.matrix[0][1] = 3;
		a.matrix[0][2] = 5;
		a.matrix[1][0] = 5;
		a.matrix[1][1] = 6;
		a.matrix[1][2] = 6;
		a.matrix[2][0] = 1;
		a.matrix[2][1] = 7;
		a.matrix[2][2] = 6;

		b.matrix[0][0] = 1;
		b.matrix[0][1] = 0;
		b.matrix[0][2] = 5;
		b.matrix[1][0] = 9;
		b.matrix[1][1] = 3;
		b.matrix[1][2] = 0;
		b.matrix[2][0] = 0;
		b.matrix[2][1] = 9;
		b.matrix[2][2] = 3;*

		/*a.matrix[0][0] = 1;
		a.matrix[0][1] = 0;
		a.matrix[1][0] = 9;
		a.matrix[1][1] = 3;
		a.matrix[2][0] = 0;
		a.matrix[2][1] = 0;

		b.matrix[0][0] = 8;
		b.matrix[0][1] = 3;
		b.matrix[0][2] = 5;
		b.matrix[1][0] = 5;
		b.matrix[1][1] = 6;
		b.matrix[1][2] = 6;*/

		/*for (int i = 0; i < a.rows; i++) {
			for (int j = 0; j < a.cols; j++) {
				a.matrix[i][j] = new Random().nextInt(10);
			}
		}

		for (int i = 0; i < b.rows; i++) {
			for (int j = 0; j < b.cols; j++) {
				b.matrix[i][j] = new Random().nextInt(10);
			}
		}*/


		System.out.println("a\n" + a);
		//System.out.println("a\n" + a.inverse());


		System.out.println("b\n" + b);
		//System.out.println("b\n" + b.cofactor());
		//System.out.println("det a: " + a.determinant());

		//System.out.println("b\n" + b);
		//System.out.println("det b: " + b.determinant());
		//System.out.println("a transpose: \n" + a.transpose());
		//System.out.println("b\n" + b);
		//System.out.println("b transpose: \n" + b.transpose());
		//System.out.println("a (trans) * b: \n" + a.transpose().multiply(b));


		System.out.println("a * b: \n" + a.multiply(b));
		System.out.println("a (dot) b: \n" + a.dot(b));
		System.out.println("a x b: \n" + a.cross(b));
	}
}