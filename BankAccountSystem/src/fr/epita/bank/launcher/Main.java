/**
 * 
 * Code application : Composant :
 */
package fr.epita.bank.launcher;

import java.util.Arrays;
import java.util.Scanner;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.InvestmentAccount;
import fr.epita.bank.datamodel.SavingsAccount;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Bank Account System");
		System.out.println("Please enter a customer name:");

		String customerName = scanner.nextLine();

		// Customer creation
		Customer customer1 = new Customer();
		// set the name from the console
		customer1.setName(customerName);

		System.out.println("customer name : " + customer1.getName());

		System.out.println("please enter an initial balance for the investments account : ");

		InvestmentAccount investmentAccount = new InvestmentAccount();
		Double investmentsBalance = getDouble(scanner);

		investmentAccount.setBalance(investmentsBalance);

		System.out.println("please enter an initial balance for the savings account : ");

		SavingsAccount savingsAccount = new SavingsAccount();
		Double savingsBalance = getDouble(scanner);
		savingsAccount.setBalance(savingsBalance);

		customer1.setInvestmentsAccounts(Arrays.asList(investmentAccount));
		customer1.setSavingsAccounts(Arrays.asList(savingsAccount));

		System.out.println(customer1);

	}

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
	private static Double getDouble(Scanner scanner) {
		Double investmentsBalance = 0d;
		int counter = 0;
		while (counter < 3) {
			if (scanner.hasNextDouble()) {
				investmentsBalance = scanner.nextDouble();
				break;
			} else {
				String textFromConsole = scanner.nextLine();
				System.out.println("Your input was wrong, expected a number and you input : " + textFromConsole);
				System.out.println("please retry");
				counter++;
			}
		}
		return investmentsBalance;
	}

}
