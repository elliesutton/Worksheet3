import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * 
 * @author Ellen Sutton
 *
 */
public class StarRatingTest {
	@Rule public final ExpectedException exception = ExpectedException.none();

	@Test
	public void test1(){
		double rating = 3.2;
		String expected = "CRAP";
		assertEquals(expected, StarRating.interpret(rating));
	}
	
	@Test
	public void test2(){
		double rating = 4.4;
		String expected = "OK";
		assertEquals(expected, StarRating.interpret(rating));
	}
	
	@Test
	public void test3(){
		double rating = 4.7;
		String expected = "EXCELLENT";
		assertEquals(expected, StarRating.interpret(rating));
		
	}
	
	@Test
	public void test4(){
		double rating = 5.0;
		String expected = "[HAS ONLY ONE REVIEW]";
		assertEquals(expected, StarRating.interpret(rating));
	}
	
	@Test
	public void test5(){
		double rating = 30;
		exception.expect(IllegalArgumentException.class);
        StarRating.interpret(rating);
	}
	
	@Test
	public void test6(){
		double rating = 0.0;
        exception.expect(IllegalArgumentException.class);
        StarRating.interpret(rating);
	}
}
