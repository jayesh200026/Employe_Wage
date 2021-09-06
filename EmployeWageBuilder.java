import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



/**
 * @author jayeshkumar Computes wage of employee belonging to comapy with
 *         specific wagePerhour
 */
public class EmployeWageBuilder implements ComputeEmpWage {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;

	private List<CompanyWage> companywage;
	private Map<String,CompanyWage> map1 ;

	EmployeWageBuilder() {
		companywage = new ArrayList<>();
		map1=new HashMap<>();
	}

	//@Override
	public void addCompanyEmpWage(String company, int wagePerHour, int maxHoursPerMonth, int maxDaysPerMonth) {

		CompanyWage companyWage = new CompanyWage(company, wagePerHour, maxHoursPerMonth, maxDaysPerMonth);
		companywage.add(companyWage);
		numOfCompany += 1;
	}

	/**
	 * Made this method non static so that i can access non static variables.
	 */
	//@Override
	public void computWage() {

		for (CompanyWage company : companywage) {

			int totalHours, totalDays, empHour;
			totalHours = totalDays = empHour = 0;

			while (totalHours < company.maxHoursPerMonth && totalDays < company.maxDaysPerMonth) {
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

				int dailywage = empHour * company.wagePerHour;
				company.setDailyWage(dailywage);
				map1.put(company.company, company);
				System.out.println(
						"Day::" + totalDays + " Emp hour" + empHour + " Daily wage is " + company.getDailyWage());

			}

			company.setTotalWage(totalHours * company.wagePerHour);
			System.out.println(company);
		}

	}

	/**
	 * returns totalwage of company
	 */
	public int getTotalWage(String company) {
		
		CompanyWage c = map1.get(company);
		if(c != null) {
			return c.getTotalWage();		
			}
		return 0;

	}

	public static void main(String[] args) {

		EmployeWageBuilder employeWageBuilder = new EmployeWageBuilder();

		employeWageBuilder.addCompanyEmpWage("Amazon", 60, 90, 20);
		employeWageBuilder.addCompanyEmpWage("Google", 80, 87, 18);
		employeWageBuilder.addCompanyEmpWage("Facebook", 70, 85, 21);

		employeWageBuilder.computWage();

		System.out.println("Total employee wage for company Amazon is " + employeWageBuilder.getTotalWage("Amazon"));

	}

}
