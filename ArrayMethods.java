import java.util.ArrayList;

/**
 * ArrayMethods is a class that finds the minimum, maximum, mean and median values of a two-dimensional array.
 * @author Ellen Sutton
 * @version 31/10/2017
 *
 */
public class ArrayMethods {
	
	/**
	 * min is a method that finds the minimum value within a two-dimensional array
	 * @param a The array in which to search for the minimum value
	 * @return The minimum value
	 */
	public static double min(double[][] a){
		try{ 
			double min = a[0][0];
			for (int i = 0; i < a.length; i++){
				for (int j = 0; j < a[i].length; j++){
					if (a[i][j] < min){
						min = a[i][j];
					}
				}
			}
			return min;
		}
		catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}
			
	/**
	 * max is a method that finds the maximum value within a two-dimensional array
	 * @param a The array in which to search for the maximum value
	 * @return The maximum value
	 */
	public static double max(double[][] a){
		try{
			double max = a[0][0];
			for (int i = 0; i < a.length; i++){
				for (int j = 0; j < a[i].length; j++){
					if (a[i][j] > max){
						max = a[i][j];
					}
				}
			}
			return max;
		}
		catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * mean is a method that computes the mean value of the array by summing all elements and then dividing
	 *  by the number of elements.
	 * @param a The array in which to compute the mean value
	 * @return The mean value of the array
	 */
	public static double mean(double[][] a){
		try{
			double total = 0.0;
			double count = 0.0;
			for (int i = 0; i < a.length; i++){
				for (int j = 0; j < a[i].length; j++){
					total = total + a[i][j];
					count++;
				}
			}
			return total/count;
		}
		catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}
	
	
	
	
	/**
	 * median is a method that computes the median value of the array by forming an ArrayList that contains
	 * all elements of the array, sorting them and then finding the value which is in the middle.
	 * @param The array in which to compute the median value
	 * @return The median value of the array
	 */
	public static double median(double [][] a){
		try{
			//creates an array list
			ArrayList<Double> list = new ArrayList<Double>();
			for (int i = 0; i < a.length; i++){
				for (int j = 0; j < a[i].length; j++){
					list.add(a[i][j]);
				}
			}
			//sorts the array list via selection sort
			for (int counter=0; counter<list.size(); counter++){
				int min = counter;
				for (int i=counter+1; i<list.size(); i++){
					if (list.get(i) < list.get(min))
						min = i;
				}
				double temp = list.get(min);
				list.set(min, list.get(counter));
				list.set(counter, temp);
			}
			//finds median
			int middleNumber = list.size()/2;
			double median;
			if (list.size()%2 == 1){
				median = list.get(middleNumber);
			} else {
				median = (list.get(middleNumber)+list.get(middleNumber-1))/2;
			}
		
			return median;
		}
		catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}


		
		
		
}
