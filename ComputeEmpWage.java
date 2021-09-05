
/**
 * @author jayeshkumar Only declared the methods. These methods will be defined
 *         by those classes which implemets the interface
 */
public interface ComputeEmpWage {
	public void addCompanyEmpWage(String company, int wagePerHour, int maxHoursPerMonth, int maxDaysPerMonth);

	public void computWage();

	public int getTotalWage(String companyName);

}
