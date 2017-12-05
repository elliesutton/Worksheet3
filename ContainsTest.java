import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ContainsTest {
	
	@Test
	public void test1(){
        ArrayList<Integer> expected = new ArrayList<Integer>
        	(Arrays.asList(7, 17, 27, 37, 47, 57, 67, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 87, 97));
        		
        assertEquals(expected, Contains.allIntegersWith(0, 100, 7));

	}
	
	@Test
	public void test2(){
        ArrayList<Integer> expected = new ArrayList<Integer>
        	(Arrays.asList(-13, -3, 3, 13));
        
        assertEquals(expected, Contains.allIntegersWith(-15, 15, 3));
	}
	
	@Test 
	public void test3(){
        ArrayList<Integer> expected = new ArrayList<Integer>	
        	(Arrays.asList(-10, 0, 10, 20, 30, 40));
        
        assertEquals(expected, Contains.allIntegersWith(-15, 45, 0));
	}
	
	@Test
	public void test4(){
        ArrayList<Integer> expected = new ArrayList<Integer>
        	(Arrays.asList(-44, -43, -42, -41, -40, -34, -24, -14, -4, 4, 14, 24, 34, 40, 41, 42, 43, 44));
        
        assertEquals(expected, Contains.allIntegersWith(-44, 45, 4));
	}
	
	@Test
	public void test5(){
		ArrayList<Integer> expected = new ArrayList<Integer>
    	(Arrays.asList(5));
		
		assertEquals(expected, Contains.allIntegersWith(0, 10, 5));
		
	}
	
	@Test
	public void test6(){
		ArrayList<Integer> expected = new ArrayList<Integer>
    	(Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 32));
		
		assertEquals(expected, Contains.allIntegersWith(15, 35, 2));
	}

}
