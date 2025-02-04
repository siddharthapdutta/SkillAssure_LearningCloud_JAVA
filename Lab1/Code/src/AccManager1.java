/*
 * The AccManager1 class accesses data fields of the Account class directly,
 * using the dot operator.
 */
public class AccManager1 {
	public void fillAccountData(Account a1) {
		a1.accNo = "004701";
		a1.name = "Chandra";
		a1.balance = 45000.0;
	}
	public void displayAccountData(Account a1) {
		System.out.println("AccNo : " + a1.accNo);
		System.out.println("Name : " + a1.name);
		System.out.println("Balance : " + a1.balance);
	}
}
