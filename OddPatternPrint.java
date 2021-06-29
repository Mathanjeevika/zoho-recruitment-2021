import java.util.Scanner;

/**
 * 
 * @author Mathan
 *
 */
public class OddPatternPrint {

	
	/**
	 * Method to find the following pattern
	 * 
	 * String INDIA
	 * 
	 *      D
	 *     DI
	 *    DIA
	 *   DIAN
	 *  DIANI 
	 * 
	 */
	public static void printPattern() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String ");
		String value = scanner.next();
		int len = value.length();
		if(len %2 == 0) {
			System.out.println("Length of the String should be Odd");
			return;
		}

		StringBuilder resVal = new StringBuilder(); // variable to store the value
		int mid = len /2; 
		/**
		 * Loop to print the elements from the middle of the string to end of the String
		 */
		for(int row = mid;row<len;row++) {
			for(int col = 0;col<(len-row+mid-1);col++) {
				System.out.print(" ");
			}
			resVal.append(value.charAt(row));
			System.out.println(resVal.toString());
		}
		
		/**
		 * Loop to print the elements from the start till the middle of the elements
		 */
		
		for(int row = 0;row<mid;row++) {
			for(int col = 0;col<(mid-row-1);col++) {
				System.out.print(" ");
			}
			resVal.append(value.charAt(row));
			System.out.println(resVal.toString());
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		printPattern();
		
	}
	
}
