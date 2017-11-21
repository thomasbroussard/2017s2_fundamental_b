/**
 
 * Code application :
 * Composant : 
 */
package fr.epita.bank.services.ui;

import java.util.InputMismatchException;
import java.util.Scanner;


/** 
 * <h3>Description</h3>  
 * <p>Cette classe permet de ...</p>
 *
 * <h3>Utilisation</h3>
 * <p>Elle s'utilise de la manière suivante :
 *   <pre><code>${type_name} instance = new ${type_name}();</code></pre>
 * </p>
 *  
 * @since $${version}
 * @see Voir aussi $${link}
 * @author ${user}
 *
 * ${tags}
 */
public class ConsoleHandler {
	

	
	
	/** 
	 * <h3>Description</h3>  
	 * <p>Cette méthode permet de ...</p>
	 *
	 * <h3>Utilisation</h3>
	 * <p>Elle s'utilise de la manière suivante :
	 *   
	 * <pre><code> ${enclosing_type} sample;
	 *
	 * //...
	 *
	 * sample.${enclosing_method}();
	 *</code></pre>
	 * </p>
	 *  
	 * @since $${version}
	 * @see Voir aussi $${link}
	 * @author ${user}
	 *
	 * ${tags}
	 */
//	public static Double getDouble(Scanner scanner) {
//	
//		Double result = 0d;
//		int counter = 0;
//		while (counter < 3) {
//			if (scanner.hasNextDouble()) {
//				result = scanner.nextDouble();
//				break;
//			} else {
//				String textFromConsole = scanner.nextLine();
//				
//				System.out.println("Your input was wrong, expected a number and you input : " + textFromConsole);
//				System.out.println("please retry");
//				counter++;
//			}
//		}
//		return result;
//	}
	
	
	public static Double getDouble(Scanner scanner) {
		Double result = 0d;
		int counter = 0;
		while (counter < 3) {
			try {
				String textFromConsole = scanner.nextLine();
				result = Double.parseDouble(textFromConsole);
				return result;
			} catch (NumberFormatException nfe) {
				System.out.println("there was a problem with your input : " + nfe.getMessage());
				System.out.println("please retry");
				counter++;
			}
		}
		
		
		return result;
	}

}
