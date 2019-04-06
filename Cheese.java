/**
 * @author  Roberto Cella
 *          rob.uniud@gmail.com
 * @version 1.0        
 */

import java.util.Scanner;

public class Cheese {

	private static double milkCounter;
	private static double valueCounter;
	private final static double[] array =	new double[6];
	private final static double[] conv 	= 	new double[] {10, 10, 10, 10, 10, 10}; // to set correct conversion rates
	private final static double[] price = 	new double[] {5, 5, 10, 12, 8.5, 12};
	private final static String[] questions = new String[] {"Quanta ricotta devi fare? ", "Quanta caciotta devi fare? ", 
															"Quanto yogurt devi fare? ",  "Quanto primosale devi fare? ", 
															"Quanta latteria devi fare? ","Quanta mozzarella devi fare? "};

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
		for(int i = 0; i < array.length; i++) {
			System.out.print(questions[i] + "(in kg) ");
			array[i] = user_input.nextDouble();
			milkCounter += (array[i] * conv[i]);
			valueCounter +=	(array[i] * price[i]);
		}
		System.out.print("Devi usare " + (int)milkCounter + " litri di latte.\n");
		System.out.print("Le vendite produrranno un guadagno stimato di € " + valueCounter);
	}
}
 