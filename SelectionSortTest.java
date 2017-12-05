import static org.junit.Assert.*;
import org.junit.Test;

/**
 *@author Ellen Sutton
 */

public class SelectionSortTest{

	@Test
	public void test1(){
		int[] before = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] actual = SelectionSort.selectionSort(before);
		
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test2(){
		int[] before = {7, 12, 8, 22, 4, 3, 9, 1};
		int[] expected = {1, 3, 4, 7, 8, 9, 12, 22};
		int[] actual = SelectionSort.selectionSort(before);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test3(){
		int[] before = {5, 9, 13, 456, 87, 23, 11};
		int[] expected = {5, 9, 11, 13, 23, 87, 456};
		int[] actual = SelectionSort.selectionSort(before);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test4(){
		int[] before = {2651, 987, 12, 1432, 1123, 5, 17, 49, 519, 712};
		int[] expected = {5, 12, 17, 49, 519, 712, 987, 1123, 1432, 2651};
		int[] actual = SelectionSort.selectionSort(before);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test5(){
		int[] before = {777, 7, 0, 7777, 7777777, 77, 777777, 77777};
		int[] expected = {0, 7, 77, 777, 7777, 77777, 777777, 7777777};
		int[] actual = SelectionSort.selectionSort(before);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test6(){
		int[] before = {-3, -4, -2, -5, 1, 0, -1};
		int[] expected = {-5, -4, -3, -2, -1, 0, 1};
		int[] actual = SelectionSort.selectionSort(before);

		assertArrayEquals(expected, actual);
	}


}
