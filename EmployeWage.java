import java.util.Scanner;

/**
 * @author jayeshkumar This class has features needed to compute the wage
 */
class CompanyWage {
	public final String company;
	public final int wagePerHour;
	public final int maxHoursPerMonth;
	public final int maxDaysPerMonth;
	public int totalWage;

	CompanyWage(String company, int wagePerHour, int maxHoursPerMonth, int maxDaysPerMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.maxDaysPerMonth = maxDaysPerMonth;
	}

	public int getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	@Override
	public String toString() {
		return "CompanyWage [company=" + company + ", totalWage=" + totalWage + "]";
	}

}

/**
 * @author jayeshkumar Computes wage of employee belonging to comapy with
 *         specific wagePerhour
 */
public class EmployeWage implements ComputeEmpWage {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;

	private CompanyWage[] companywage;

	EmployeWage() {
		companywage = new CompanyWage[5];
	}

	public void addCompanyEmpWage(String company, int wagePerHour, int maxHoursPerMonth, int maxDaysPerMonth) {
		companywage[numOfCompany] = new CompanyWage(company, wagePerHour, maxHoursPerMonth, maxDaysPerMonth);
		numOfCompany += 1;
	}

	/**
	 * Made this method non static so that i can access non static variables.
	 */
	public void computWage() {

		for (int i = 0; i < numOfCompany; i++) {

			int totalHours, totalDays, empHour;
			totalHours = totalDays = empHour = 0;

			while (totalHours < companywage[i].maxHoursPerMonth && totalDays < companywage[i].maxDaysPerMonth) {
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
				System.out.println("Day::" + totalDays + " Emp hour" + empHour);

			}

			companywage[i].setTotalWage(totalHours * companywage[i].wagePerHour);
			System.out.println(companywage[i]);
		}

	}

	public static void main(String[] args) {

		EmployeWage employeWageBuilder = new EmployeWage();

		employeWageBuilder.addCompanyEmpWage("Amazon", 40, 90, 20);
		employeWageBuilder.addCompanyEmpWage("Google", 50, 87, 18);

		employeWageBuilder.computWage();

	}

}
