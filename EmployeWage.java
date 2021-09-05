import java.util.Scanner;


/**
 * @author jayeshkumar
 * Computes wage of employee belonging to comapy with specific wagePerhour
 */
public class EmployeWage {
	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;

	public static int computWage(String companyName, int wagePerHour, int maxHours, int maxDays) {

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
			

		}
		empWage = wagePerHour * totalHours;
		totalWage += empWage;
		
		System.out.println("Total employe wage for company "+companyName+" is "+totalWage);
		return totalWage;

		

	}

	
	public static void main(String[] args) {
		

		
		computWage("amazon",40,90,20);
		computWage("google",50,70,18);
		

	}

}
