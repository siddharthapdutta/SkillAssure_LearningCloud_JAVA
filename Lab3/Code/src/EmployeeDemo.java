public class EmployeeDemo {
	public static void main(String[] args)  {
		Employee emp = new Employee();
		
		storeData(emp);
		
		showData(emp);
	}

	public static void storeData(Employee emp)  {
		System.out.println("Enter EmpId : ");
		String empId = Console.readLine();
		emp.setEmpId(empId);
		System.out.println("Enter Name : ");
		String name = Console.readLine();
		emp.setName(name);
		Address address = new Address();
		System.out.println("Address Line1 : ");
		String addrLine1 = Console.readLine();
		address.setAddrLine1(addrLine1);
		System.out.println("Address Line2 : ");
		String addrLine2 = Console.readLine();
		address.setAddrLine2(addrLine2);
		System.out.println("Address City : ");
		String city = Console.readLine();
		address.setCity(city);
		System.out.println("Address Pin : ");
		String pin = Console.readLine();
		address.setPin(pin);
		emp.setAddress(address);

	}
	public static void showData(Employee emp) {
		
		System.out.println("Emp Id : " + emp.getEmpId());
		System.out.println("Name : " + emp.getName());
		System.out.println("--------------------------------------------");
		System.out.println("Addr Line1 : " + emp.getAddress().getAddrLine1());
		System.out.println("Addr Line2 : " + emp.getAddress().getAddrLine2());
		System.out.println("City : " + emp.getAddress().getCity());
		System.out.println("Pin : " + emp.getAddress().getPin());
		System.out.println("--------------------------------------------");

		


	}
}














