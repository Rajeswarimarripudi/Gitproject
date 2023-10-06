package Day1;

public class Employeemain {

	static class Employee {
		private double salary;

		public Employee(double salary) {
			this.salary = salary;
		}

		public void work() {
			System.out.println("Employee is working...");
		}

		public double getSalary() {
			return salary;
		}
	}

	static class HRManager extends Employee {
		public HRManager(double salary) {
			super(salary);
		}

		@Override
		public void work() {
			System.out.println("HR Manager is working...");
		}

		public void addEmployee() {
			System.out.println("HR Manager is adding an employee...");
		}
	}

	public static void main(String[] args) {
		// Create an instance of Employee
		Employee employee = new Employee(50000.0);
		employee.work();
		System.out.println("Salary: " + employee.getSalary());

		System.out.println();

		// Create an instance of HRManager
		HRManager hrManager = new HRManager(80000.0);
		hrManager.work();
		hrManager.addEmployee();
		System.out.println("Salary: " + hrManager.getSalary());
	}

}
