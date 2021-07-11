public class EmployeeReport {
	private String dtReport;

	public EmployeeReport(String dtReport) {
		this.dtReport = dtReport;
	}
	
	private void printLine() {
		System.out.println("---------------------------------------------------------------------------");
	}

	private void displayHeader() {
		printLine();
		System.out.print("EMPLOYEE REPORT\t\t\t\t");
		System.out.println("Date : " + dtReport);
		printLine();
	}

	private void displayFooter(int count) {
		printLine();
		System.out.println("Total Employees : " + count);
		printLine();
	}

	public void display(Employee empArr[]) {
		displayHeader();

		System.out.println("EMP_ID\tNAME\tROLE\t\tBASIC\tHRA\tALLOW\tSALARY");
		for (Employee emp : empArr) {
			System.out.print(emp.getEmpId() + "\t");
			System.out.print(emp.getEmpName() + "\t");
			System.out.print(emp.getRoleDescription() + "\t");
			System.out.print(emp.getBasicSalary() + "\t");
			System.out.print(emp.getHraAmount() + "\t");
			System.out.print(emp.getAllowance() + "\t");
			System.out.print(emp.getSalary());
			System.out.println();
		}

		displayFooter(empArr.length);

	}

	public void setDtReport(String dtReport) {
		this.dtReport = dtReport;
	}

	public String getDtReport() {
		return dtReport;
	}
}