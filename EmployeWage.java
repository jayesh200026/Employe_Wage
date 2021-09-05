import java.util.Scanner;


/**
 * @author jayeshkumar
 * Computes wage of employee belonging to comapy with specific wagePerhour
 */
public class EmployeWage {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	private final String company;
	private final int wagePerHour;
	private final int maxHoursPerMonth;
	private final int maxDaysPerMonth;
	private int totalWage;
	
	@Override
	public String toString() {
		return "Total EmployeWage for company=" + company + " is " + totalWage + " ";
	}



	EmployeWage(String company, int wagePerHour, int maxHoursPerMonth, int maxDaysPerMonth){
		this.company=company;
		this.wagePerHour=wagePerHour;
		this.maxHoursPerMonth=maxHoursPerMonth;
		this.maxDaysPerMonth=maxDaysPerMonth;
	}
	
	

	/**
	 * Made this method non static so that i can access non static variables.
	 */
	public void computWage() {

		int empWage, totalHours, totalDays, empHour;
		empWage = totalHours = totalDays = empHour = 0;

		while (totalHours < maxHoursPerMonth && totalDays < maxDaysPerMonth) {
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
			System.out.println("Day::"+totalDays+ " Emp hour"+empHour);

		}
		empWage = wagePerHour * totalHours;
		totalWage += empWage;
		

	}

	
	public static void main(String[] args) {
		
		EmployeWage amazon = new EmployeWage("Amazon",40,90,20);
		EmployeWage google = new EmployeWage("Google",50,87,18);
		
		amazon.computWage();
		System.out.println(amazon);
		google.computWage();
		
		System.out.println(google);
		

	}

}
