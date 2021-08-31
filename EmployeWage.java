
class Employe {
	final int IS_FULL_TIME = 1;
	final int IS_PART_TIME = 2;
	final int wagePerHour = 20;
	int attendance;
	int fullDayHour;
	int totalWage;
	int totalWorkingDays;
	int totalWorkingHours;

	Employe() {
		totalWorkingDays = 0;
		totalWorkingHours = 0;
	}

	public void getAttendance() {
		this.attendance = (int) Math.floor(Math.random() * 10) % 3;

		switch (this.attendance) {
		case IS_FULL_TIME:
			this.fullDayHour = 8;
			this.totalWorkingDays += 1;
			break;
		case IS_PART_TIME:
			fullDayHour = 4;
			this.totalWorkingDays += 1;
			break;
		default:
			fullDayHour = 0;
			break;
		}
		this.totalWorkingHours += this.fullDayHour;

	}

	public void getwage() {
		int empwage = 0;
		empwage = this.fullDayHour * wagePerHour;
		this.totalWage += empwage;
		System.out.println("Employee wage for day is " + empwage);
	}

}

public class EmployeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee wage Computation program");

		Employe emp = new Employe();

		int fullDayHour = 0;

		while (emp.totalWorkingHours < 100 && emp.totalWorkingDays < 20) {

			emp.getAttendance();
			emp.getwage();

		}
		System.out.println("Total wage of employee: " + emp.totalWage);
	}
}