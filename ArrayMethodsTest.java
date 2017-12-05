import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArrayMethodsTest {
	
	private final static double EPSILON = 1e-6;
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void test1(){
		double[][] array = {{1}, {3.3, 2.2}, {5.5, 4.4, 6}, {7}};
		
		double expectedMin = 1;
		double expectedMax = 7;
		double expectedMean = 4.2;
		double expectedMedian = 4.4;
		
		assertEquals(expectedMin, ArrayMethods.min(array), EPSILON);
		assertEquals(expectedMax, ArrayMethods.max(array), EPSILON);
		assertEquals(expectedMean, ArrayMethods.mean(array), EPSILON);
		assertEquals(expectedMedian, ArrayMethods.median(array), EPSILON);
	}
	
	
	@Test
	public void test2(){
		
		double[][] array = {{-5.5, 17.0, 4.0}, {1.3, -8.0}, {20.0}};
		
		double expectedMin = -8.0;
		double expectedMax = 20.0;
		double expectedMean = 4.8;
		double expectedMedian = 2.65;
		
		assertEquals(expectedMin, ArrayMethods.min(array), EPSILON);
		assertEquals(expectedMax, ArrayMethods.max(array), EPSILON);
		assertEquals(expectedMean, ArrayMethods.mean(array), EPSILON);
		assertEquals(expectedMedian, ArrayMethods.median(array), EPSILON);
		
	}
	
	
	@Test
	public void test3(){
		
		double[][] array = {{0.0}, {0.0, -4.5}, {-7,-458.2}};
			
		double expectedMin = -458.2;
		double expectedMax = 0.0;
		double expectedMean = -93.94;
		double expectedMedian = -4.5;
		
		assertEquals(expectedMin, ArrayMethods.min(array), EPSILON);
		assertEquals(expectedMax, ArrayMethods.max(array), EPSILON);
		assertEquals(expectedMean, ArrayMethods.mean(array), EPSILON);
		assertEquals(expectedMedian, ArrayMethods.median(array), EPSILON);
		
	}
	
	
	@Test
	public void test4(){
		
		double[][] array = { {} };
		exception.expect(IllegalArgumentException.class);
		ArrayMethods.min(array);
		ArrayMethods.max(array);
		ArrayMethods.mean(array);
		ArrayMethods.median(array);
	}
	

	@Test
	public void test5(){
		
		double[][] array = {{-1.0}, {0.0, 0.0}, {1.0}};
		double expectedMin = -1.0;
		double expectedMax = 1.0;
		double expectedMean = 0.0;
		double expectedMedian = 0.0;
		
		assertEquals(expectedMin, ArrayMethods.min(array), EPSILON);
		assertEquals(expectedMax, ArrayMethods.max(array), EPSILON);
		assertEquals(expectedMean, ArrayMethods.mean(array), EPSILON);
		assertEquals(expectedMedian, ArrayMethods.median(array), EPSILON);
	}
	
	@Test
	public void test6(){
		

	double[][] array = {{17}};
	double expectedMin = 17;
	double expectedMax = 17;
	double expectedMean = 17;
	double expectedMedian = 17;
	
	assertEquals(expectedMin, ArrayMethods.min(array), EPSILON);
	assertEquals(expectedMax, ArrayMethods.max(array), EPSILON);
	assertEquals(expectedMean, ArrayMethods.mean(array), EPSILON);
	assertEquals(expectedMedian, ArrayMethods.median(array), EPSILON);
	}
}
