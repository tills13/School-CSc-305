public class Test {
	public static void main(String [] args) {
		My2DPoint point = new My2DPoint(1, 0);
		System.out.println(point);
		point.set(2, 3);
		System.out.println(point);
		point.move(3, 2);
		System.out.println(point);
	}
}