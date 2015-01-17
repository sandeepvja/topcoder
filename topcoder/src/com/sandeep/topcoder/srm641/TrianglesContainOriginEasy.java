package com.sandeep.topcoder.srm641;

public class TrianglesContainOriginEasy {
	
	public static void main(String args[]) {
		int x[] = {1,5,10,5,-5,7,-9,-6,-3,0,8,8,1,-4,7,-3,10,9,-6};
		int y[] = {5,-6,-3,4,-2,-8,-7,2,7,4,2,0,-4,-8,7,5,-5,-2,-9};
		
		TrianglesContainOriginEasy test = new TrianglesContainOriginEasy();
		System.out.print(test.count(x, y));
	}
	
	public int count(int[] x, int[] y) {
		int length = x.length;
		int count = 0;
		for(int i = 0; i < length; i++) {
			for(int j = i+1; j < length; j++) {
				for(int k = j+1; k < length; k++) {
					if(isOriginInside(x[i], y[i], x[j], y[j], x[k], y[k])) {
						count++;
					}
				}
			}
		}
		return count;
	}

	private boolean isOriginInside(int xa, int ya, int xb, int yb, int xc, int yc) {
		double area1 = findArea(0, 0, xa, ya, xb, yb);
		double area2 = findArea(0, 0, xa, ya, xc, yc);
		double area3 = findArea(0, 0, xb, yb, xc, yc);
		double area = findArea(xa, ya, xb, yb, xc, yc);
		
		return (area == (area1 + area2 + area3));
	}

	private double findArea(int xa, int ya, int xb, int yb, int xc, int yc) {
		double area = Math.abs(xa * (yb - yc) + xb * (yc - ya) + xc * (ya - yb));
		area = area/2.0;
		return area;
	}
}
