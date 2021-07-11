public class Employee implements Roles {

	private String empId;
	private String empName;
	private double basicSalary;
	private double hraAmount;
	private double allowPerc;
	private int roleId;

	public Employee() {
		
	}
	
	public Employee(String empId, String empName, double basicSalary, double hraAmount, double allowPerc, int roleId) {
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.hraAmount = hraAmount;
		this.allowPerc = allowPerc;
		this.roleId = roleId;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getHraAmount() {
		return hraAmount;
	}

	public double getAllowPerc() {
		return allowPerc;
	}

	@Override
	public int getRoleId() {
		return roleId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public void setHraAmount(double hraAmount) {
		this.hraAmount = hraAmount;
	}

	public void setAllowPerc(double allowPerc) {
		this.allowPerc = allowPerc;
	}

	@Override
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public double getSalary() {
		return SalaryCalculator.getSalary(this);
	}
	
	public double getAllowance() {
		return SalaryCalculator.getAllowance(this);
	}
	
	public String getRoleDescription() {
		return RoleBuilder.getRoleDescription(this.roleId);
	}
	
}
