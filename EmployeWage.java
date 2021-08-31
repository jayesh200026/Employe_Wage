
public class EmployeWage {
	public static void main(String[] args) {

		System.out.println("Welcome to Employee wage Computation program");
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		int wagePerHour = 20, fullDayHour = 0, totalWorkingHours = 0, totalWorkingDays = 0;
		int empwage = 0, totalwage = 0;
		while (totalWorkingHours < 100 || totalWorkingDays < 20) {
			int attendance = (int) Math.floor(Math.random() * 10) % 3;
			switch (attendance) {
			case IS_FULL_TIME:
				fullDayHour = 8;
				totalWorkingDays += 1;
				break;
			case IS_PART_TIME:
				fullDayHour = 4;
				totalWorkingDays += 1;
				break;
			default:
				fullDayHour = 0;
				break;
			}
			empwage = fullDayHour * wagePerHour;
			totalwage += empwage;
			totalWorkingHours += fullDayHour;
			System.out.println("Employee wage for day is " + empwage);
		}
		System.out.println("Total wage of employee: " + totalwage);
	}
}