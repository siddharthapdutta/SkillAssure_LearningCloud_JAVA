public class SalaryCalculator {
	public static double getSalary(Employee emp) {
		return emp.getBasicSalary() + emp.getHraAmount() + getAllowance(emp);
	}

	public static double getAllowance(Employee emp) {
		return emp.getBasicSalary() * emp.getAllowPerc() * 0.01;
	}
}
