
/**
 * 
 * StarRating is a class that interprets a given rating from 1.0 - 5.0 and prints the relevant interpretation.
 * @author Ellen Sutton
 * @version 26/10/2017
 *
 */
public class StarRating {

	/**
	 * interpret is a method that interprets any rating from 1.0 to 5.0. A rating from 1-3.9 prints CRAP, 
	 * a rating from 4-4.4 prints OK, a rating from 4.5-4.9 prints EXCELLENT and a rating of 5 prints HAS ONLY ONE REVIEW.
	 * @param rating The rating to be interpreted
	 * @return The interpreted rating
	 */
	public static String interpret(double rating){
		String output = null;	

			if (rating >= 1.0 && rating < 4.0){
			output = "CRAP";
			}
			else if (rating >= 4.0 && rating < 4.5){
				output = "OK";
			}
			else if (rating >= 4.5 && rating < 5.0){
				output = "EXCELLENT";
			}
			else if (rating == 5.0){
				output = "[HAS ONLY ONE REVIEW]";
			}		
		 else {
			throw new IllegalArgumentException("IllegalArgumentException");
		} 
		return output;
	}
	
	
	
}

