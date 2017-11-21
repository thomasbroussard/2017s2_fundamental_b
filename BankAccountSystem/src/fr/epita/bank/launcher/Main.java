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
import fr.epita.bank.services.ui.ConsoleHandler;

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
		Double investmentsBalance = ConsoleHandler.getDouble(scanner);

		investmentAccount.setBalance(investmentsBalance);

		System.out.println("please enter an initial balance for the savings account : ");

		SavingsAccount savingsAccount = new SavingsAccount();
		Double savingsBalance = ConsoleHandler.getDouble(scanner);
		savingsAccount.setBalance(savingsBalance);

		customer1.setInvestmentsAccounts(Arrays.asList(investmentAccount));
		customer1.setSavingsAccounts(Arrays.asList(savingsAccount));

		System.out.println(customer1);

	}


}
