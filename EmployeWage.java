import java.util.Scanner;

/**
 * @author jayeshkumar
 * Every company will have name,wagePerhour,maximum working hour and days of employee.
 */
class Company {
	String companyName;
	int wagePerHour;
	int maxHour;
	int maxDays;

	public void getData() {
		Scanner r = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter company name");
		companyName = r.nextLine();
		System.out.println("Enter wage per hour of company");
		wagePerHour = sc.nextInt();
		System.out.println("Enter maximum working hour of company");
		maxHour = sc.nextInt();
		System.out.println("Enter maximum working days of company");
		maxDays = sc.nextInt();
	}
}

/**
 * @author jayeshkumar
 * Computes wage of employee belonging to comapy with specific wagePerhour
 */
public class EmployeWage {
	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;

	public static void computWage(String companyName, int wagePerHour, int maxHours, int maxDays) {

		int empWage, totalHours, totalDays, empHour, totalWage;
		empWage = totalHours = totalDays = empHour = totalWage = 0;

		while (totalHours < maxHours && totalDays < maxDays) {
			totalDays += 1;
			int attendance = (int) Math.floor(Math.random() * 10) % 3;

			switch (attendance) {
			case IS_FULL_TIME:
				empHour = 8;
				break;
			case IS_PART_TIME:
				empHour = 4;
				break;
			default:
				empHour = 0;
			}
			totalHours += empHour;
			empWage = wagePerHour * empHour;
			totalWage += empWage;

		}

		display(companyName, totalWage, totalHours, totalDays);

	}

	private static void display(String companyName, int wage, int totalHour, int totalDay) {

		System.out.println("Company Name::" + companyName);
		System.out.println("Total Wage::" + wage);
		System.out.println("Total working hours per month::" + totalHour);
		System.out.println("Total Working days per month::" + totalDay);

	}

	public static void main(String[] args) {
		Company yml = new Company();

		yml.getData();
		computWage(yml.companyName, yml.wagePerHour, yml.maxHour, yml.maxDays);

	}

}
