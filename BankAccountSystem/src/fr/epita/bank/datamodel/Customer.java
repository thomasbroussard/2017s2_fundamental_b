/**
 * 
 * Code application :
 * Composant : 
 */
package fr.epita.bank.datamodel;

import java.util.List;

public class Customer {

	private String name;
	private String address;
	
	private List<SavingsAccount> savingsAccounts;
	private List<InvestmentAccount> investmentsAccounts;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String newName) {
		if (!newName.isEmpty()) {
			this.name = newName;	
		}
		
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the savingsAccounts
	 */
	public List<SavingsAccount> getSavingsAccounts() {
		return savingsAccounts;
	}
	/**
	 * @param savingsAccounts the savingsAccounts to set
	 */
	public void setSavingsAccounts(List<SavingsAccount> savingsAccounts) {
		this.savingsAccounts = savingsAccounts;
	}
	/**
	 * @return the investmentsAccounts
	 */
	public List<InvestmentAccount> getInvestmentsAccounts() {
		return investmentsAccounts;
	}
	/**
	 * @param investmentsAccounts the investmentsAccounts to set
	 */
	public void setInvestmentsAccounts(List<InvestmentAccount> investmentsAccounts) {
		this.investmentsAccounts = investmentsAccounts;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", savingsAccounts=" + savingsAccounts + ", investmentsAccounts="
				+ investmentsAccounts + "]";
	}
	
	
	
	
	
}
