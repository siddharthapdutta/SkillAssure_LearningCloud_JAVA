public class TestMain {
	public static void main(String[] args) {

		Employee employees[] = new Employee[4];
		employees[0] = new Employee("1000", "FooBar1", 10000, 1000, 10, new Roles(1));
		employees[1] = new Employee("1001", "FooBar2", 12000, 500, 20, new Roles(2));
		employees[2] = new Employee("1002", "FooBar3", 15000, 2000, 5, new Roles(3));
		employees[3] = new Employee("1003", "FooBar4", 20000, 5000, 15, new Roles(4));

		System.out.print("Enter the Date Of Report :");
		String dtReport = Console.readLine();

		EmployeeReport employeeReport = new EmployeeReport();
		employeeReport.setDtReport(dtReport);
		employeeReport.display(employees);
	}
}
