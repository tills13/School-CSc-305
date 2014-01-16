class My2DPoint {
	public: 
		My2DPoint(int x, int y);
		void set(int x, int y);
		int getX();
		int getY();
		void move(int x, int y);
	private:
		int x;
		int y;
};