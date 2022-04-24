package Main;

public class Employee {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double Hra = 1000.50;
	double basicSalary;
	double specialAllowance;
	
	
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
}


	double calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
		return salary;
	}
	double calculateTransportAllowance() {
		double transportAllowance = basicSalary * .10;
		return transportAllowance;
	}
	
	
	
	
}
	
	

	


