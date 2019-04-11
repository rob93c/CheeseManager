/**
 * @author  Roberto Cella
 *          rob.uniud@gmail.com
 * @version 1.1        
 */

package cheese;

import java.util.Scanner;

public class Cheese {

	private static double milkCounter;
	private static double valueCounter;
	private final static double[] array = new double[6];

	/**
	 * change "conv" to mirror accurate conversion rates between 
	 * a kind of cheese and the milk needed to produce it.
	 */
	private final static double[] conv 	= new double[] {10, 10, 10, 10, 10, 10};

	/**
	 * change "price" to mirror your products' prices
	 */
	private final static double[] price = new double[] {5, 5, 10, 12, 8.5, 12};

	private final static String[] questIt = new String[] {"Quanta ricotta devi fare? ", 
							      "Quanta caciotta devi fare? ", 
							      "Quanto yogurt devi fare? ",  
							      "Quanto primosale devi fare? ", 
							      "Quanta latteria devi fare? ",
							      "Quanta mozzarella devi fare? "};
							      
	private final static String[] questEn = new String[] {"How much ricotta cheese do you have to produce? ",
							      "How much caciotta do you have to produce? ",
							      "How much yogurt do you have to produce? ",
							      "How much primosale do you have to produce? ",
							      "How much latteria do you have to produce? ",
							      "How much mozzarella do you have to produce? "};

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
		System.out.print("Choose program language: 1 to select Italian, 2 to select English.\n");
		if(user_input.nextDouble() == 1) {
			for(int i = 0; i < array.length; i++) {
				System.out.print(questIt[i] + "(in kg) ");
				array[i] = user_input.nextDouble();
				milkCounter += (array[i] * conv[i]);
				valueCounter +=	(array[i] * price[i]);
			}
			System.out.print("\nDevi usare " + (int)milkCounter + " litri di latte.\n");
			System.out.print("Le vendite produrranno un guadagno stimato di € " + valueCounter + "\n\n");
			System.out.print("Vuoi eseguirlo ancora? (S/N): ");
		   	String var = user_input.next();
		   	if(var.equalsIgnoreCase("S")) {
		   	main(null); // if input is S then call main again. 
		   }
		} else {
			for(int i = 0; i < array.length; i++) {
				System.out.print(questEn[i] + "(kg) ");
				array[i] = user_input.nextDouble();
				milkCounter += (array[i] * conv[i]);
				valueCounter +=	(array[i] * price[i]);
			}
			System.out.print("\nYou have to use " + (int)milkCounter + " liters of milk.\n");
			System.out.print("Sales will produce an estimated profit of € " + valueCounter + "\n\n");
			System.out.print("Do you want to run it again? (Y/N): ");
		   	String var = user_input.next();
		   	if(var.equalsIgnoreCase("Y")) { // Matches "Y" or "y"
		   	main(null); // if input is Y then call main again.
		   }
		}
	} 
}
