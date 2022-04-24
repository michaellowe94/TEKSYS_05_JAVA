package Main;
public class Manager extends Employee {
	
	
	
	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
		// TODO Auto-generated constructor stub
	}

	double calculateTransportAllowance() {
		double transportAllowance = basicSalary * .15;
		return transportAllowance;
	}

	

}

