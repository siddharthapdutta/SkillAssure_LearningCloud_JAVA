public class TestMain {
	public static void main(String[] args) {

		Employee employees[] = new Employee[1];
		Employee employee = new Employee();
		System.out.print("Enter employee ID: ");
		employee.setEmpId(Console.readLine());
		System.out.print("Enter employee name: ");
		employee.setEmpName(Console.readLine());
		System.out.print("Enter basic salary: ");
		employee.setBasicSalary(Console.readDouble());
		System.out.print("Enter HRA amount: ");
		employee.setHraAmount(Console.readDouble());
		System.out.print("Enter allowance percentage: ");
		employee.setAllowPerc(Console.readDouble());
		System.out.print("Enter role ID: ");
		employee.setRoleId(Console.readInt());
		employees[0] = employee;

		System.out.print("Enter the Date Of Report: ");
		String dtReport = Console.readLine();

		EmployeeReport employeeReport = new EmployeeReport(dtReport);
		employeeReport.display(employees);
	}
}
