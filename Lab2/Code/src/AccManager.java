public class AccManager {
	public void fillAccountData(Account a1) {
		System.out.print("Enter account number : ");
		String accNo = Console.readLine();
		System.out.print("Enter name : ");
		String name = Console.readLine();
		System.out.print("Enter balance amount : ");
		double balance = Console.readDouble();
		
		a1.setAccNo(accNo);
		a1.setName(name);
		a1.setBalance(balance);
	}
	public void displayAccountData(Account a1) {
		System.out.println("AccNo : " + a1.getAccNo());
		System.out.println("Name : " + a1.getName());
		System.out.println("Balance : " + a1.getBalance());
	}
}
