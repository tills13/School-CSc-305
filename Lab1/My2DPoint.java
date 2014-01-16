public class My2DPoint {
	int x;
	int y;

	public My2DPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}