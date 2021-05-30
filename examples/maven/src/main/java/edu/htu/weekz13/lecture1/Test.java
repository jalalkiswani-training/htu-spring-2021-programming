package edu.htu.weekz13.lecture1;

import com.jk.util.logging.JKLogger;
import com.jk.util.logging.JKLoggerFactory;

public class Test {
	public static void main(String[] args) {
		JKLogger logger=JKLoggerFactory.getLogger("Test");
		
		int i = 10;
		logger.warn("i = "+i);
		int j = 20;
		logger.warn("j = "+j);
		int x = i + j;
		logger.warn("x = "+x);
		int y = x - i;
		logger.warn("y = "+x);
		x = calculateX(x, y);
		logger.warn("x after calcuation= "+x);
		
		System.out.println("i=" + i);// 10
		System.out.println("j=" + j);// 20
		System.out.println("y=" + y);// 20, 30,
		System.out.println("x=" + x);// 620
	}

	private static int calculateX(int x, int y) {
		x = x * 20 + y;
		x = y * 30 / 10;
		x = x + 7;
		return x;
	}
}
