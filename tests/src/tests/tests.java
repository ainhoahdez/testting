package tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class tests {

	 /**
	Test sin fallos
	 */
	@Test public void testelement(){
		int arg[] = {1, -2, 3};
		int obj = ejercicio_1.countPositive(arg);
		assertTrue("Numeros positivos", (obj == 2));
	}
	
	@Test public void nullelement(){
		int arg[] = null;
		try {
			ejercicio_1.countPositive(arg);
		} catch (NullPointerException e) {
			 return;
		}
		fail ("NullPointerException expected");
	}
	
	 /**
	Test sin fallos
	 */
	@Test public void testlastZero(){
		int arg[] = {1, -2, 3};
		int obj = lastZero.lastZero(arg);
		assertTrue("Numeros positivos", (obj == -1));
	}
	
	 /**
	Test sin fallos
	 */
	@Test public void testlastZero_1(){
		int arg[] = {1, -2, 0};
		int obj = lastZero.lastZero(arg);
		assertTrue("Numeros positivos", (obj == 2));
	}
	
	 /**
	Test con fallos
	 */
	@Test public void testlastZero_2(){
		int arg[] = {1, -2, 0, 0};
		int obj = lastZero.lastZero(arg);
		assertTrue("Numeros positivos", (obj == 3));
	}
	
	 /**
	Test sin fallos
	 */
	@Test public void testfindLast(){
		int arg[] = {1, -2, 0};
		int num = 0;
		int obj = findLast.findLast(arg, num);
		assertTrue("Numeros positivos", (obj == 2));
	}
	/**
	Test con fallos
	 */
	@Test public void testfindLast_1(){
		int arg[] = {3, -2, 0, 8, 10};
		int num = 3;
		int obj = findLast.findLast(arg, num);
		assertTrue("Numeros positivos", (obj == 0));
	}
	
	 /**
	Test sin fallos
	 */
	@Test public void testOddOrPos(){
		int arg[] = {1, -2, 2};
		int obj = oddOrPos.oddOrPos(arg);
		assertTrue("Numeros positivos", (obj == 2));
	}
	
	 /**
	Test con fallos
	 */
	@Test public void testOddOrPos_1(){
		int arg[] = {1, -2, 2, -3};
		int obj = oddOrPos.oddOrPos(arg);
		assertTrue("Numeros positivos", (obj == 3));
	}
}
