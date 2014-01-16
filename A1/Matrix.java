//ARRAY[ROW][COL]

public class Matrix {
	public double [][] matrix;
	public int cols = 3;
	public int rows = 3;

	public Matrix(double[][] matrix) {
		this.matrix = matrix;
		this.rows = matrix.length;
		this.cols = matrix[0].length;
	}

	public Matrix(int rows, int cols) {
		matrix = new double[rows][cols];
		this.rows = rows;
		this.cols = cols;

		clear();
	}

	public Matrix transpose() {
		Matrix result = new Matrix(this.cols, this.rows);
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result.matrix[j][i] = this.matrix[i][j];
			}
		}

		return result;
	}

	public Matrix cofactor() {
		Matrix result = new Matrix(this.rows, this.cols);
		for (int i = 0; i < result.rows; i++) {
			for (int j = 0; j < result.cols; j++) {
				result.matrix[i][j] = (double)(Math.pow(-1, i + j) * removeRowCol(i, j).determinant());
			}
		}

		return result;
	}

	public Matrix removeRowCol(int row, int col) {
		Matrix result = new Matrix(this.rows - 1, this.cols - 1);

		int k = 0; // row
		int l = 0; // col
		for (int i = 0; i < this.rows; i++) {
			if (i == row) continue;
			for (int j = 0; j < this.cols; j++) {
				if (j == col) continue;
				result.matrix[k][l] = this.matrix[i][j];

				l = (l + 1) % (this.cols - 1);
				if (l == 0) k++;
			}
		}

		return result;
	}

	public double determinant() {
		if (this.rows == 2) return this.matrix[0][0] * this.matrix[1][1] - this.matrix[0][1] * this.matrix[1][0];

		int determinant1 = 0, determinant2 = 0;
		for (int i = 0; i < this.rows; i++) {
			int temp = 1, temp2 = 1;
			for (int j = 0; j < this.cols; j++) {
				temp *= this.matrix[(i + j) % this.cols][j];
				temp2 *= this.matrix[(i + j) % this.cols][this.rows - 1 - j];
			}
		
			determinant1 += temp; 
			determinant2 += temp2;
		}

		return determinant1 - determinant2;
	}

	public Matrix dualMatrix() {
		Matrix result = new Matrix(3, 3);
		result.matrix[0][1] -= this.matrix[2][0];
		result.matrix[0][2] = this.matrix[1][0];
		result.matrix[1][2] -= this.matrix[0][0];
		result.matrix[1][0] = this.matrix[2][0];
		result.matrix[2][0] -= this.matrix[1][0];
		result.matrix[2][1] = this.matrix[0][0];

		return result;
	}

	// this * b (matrix)
	public Matrix multiply(Matrix b) {
		if (this.cols != b.rows) return null;
		Matrix result = new Matrix(this.rows, b.cols);

		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < b.cols; j++) {
				int sum = 0;
				for (int k = 0; k < this.cols; k++) sum += this.matrix[i][k] * b.matrix[k][j];

				result.matrix[i][j] = sum;
			} 
		}

		return result;
	}

	// this * b (double)
	public Matrix multiply(double b) {
		Matrix result = new Matrix(this.rows, this.cols);
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result.matrix[j][i] = this.matrix[i][j] * b;
			}
		}

		return result;
	}

	public Matrix inverse() {
		return this.cofactor().multiply(1 / this.determinant());
	}

	// this dot b
	public Matrix dot(Matrix b) {
		if (this.cols != 1 || b.cols != 1) return null;
		return this.transpose().multiply(b);
	}

	// this x b
	public Matrix cross(Matrix b) {
		if (this.cols != 1 || b.cols != 1) return null;
		return this.dualMatrix().multiply(b);
	}

	public boolean equals(Matrix b) {
		if (this.cols != b.cols || this.rows != b.rows) return false;
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				if (this.matrix[i][j] != b.matrix[i][j]) return false;
			}
		}

		return true;
	}

	public void clear() {
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				this.matrix[i][j] = 0.0;
			}
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				sb.append(matrix[i][j] + "\t");
			}

			sb.append("\n");
		}

		return sb.toString();
	}
}