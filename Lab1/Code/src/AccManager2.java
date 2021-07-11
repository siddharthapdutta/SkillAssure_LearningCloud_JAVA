/*
 * The AccManager2 class accesses data fields of the Account class indirectly,
 * using the getter and setter methods for each data field.
 */
public class AccManager2 {
	public void fillAccountData(Account a1) {
		a1.setAccNo("004701");
		a1.setName("Chandra");
		a1.setBalance(45000.0);
	}
	public void displayAccountData(Account a1) {
		System.out.println("AccNo : " + a1.getAccNo());
		System.out.println("Name : " + a1.getName());
		System.out.println("Balance : " + a1.getBalance());
	}
}
