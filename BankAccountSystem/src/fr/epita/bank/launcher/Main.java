/**
 * 
 * Code application :
 * Composant : 
 */
package fr.epita.bank.launcher;

import java.util.Arrays;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.InvestmentAccount;
import fr.epita.bank.datamodel.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setName("tom");
		customer1.setName("");
		
		System.out.println("customer name : " + customer1.getName());
		
		InvestmentAccount investmentAccount = new InvestmentAccount();
		investmentAccount.setBalance(5000.0);
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.setBalance(10000.0);
		
		
		customer1.setInvestmentsAccounts(Arrays.asList(investmentAccount));
		customer1.setSavingsAccounts(Arrays.asList(savingsAccount));
		
		
		System.out.println(customer1);
		
		
		
		
	}

}
