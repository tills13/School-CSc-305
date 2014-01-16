#include "My2DPoint.h"

My2DPoint::My2DPoint(int _x, int _y) {
	x = _x;
	y = _y;
}

void set(int _x, int _y) {
	x = _x;
	y = _y;
}

void move(int _x, int _y) {
	x += _x;
	y += _y;
}

int getX() {
	return x;
}

int getY() {
	return y;
}

