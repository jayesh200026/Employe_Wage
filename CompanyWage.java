/**
 * @author jayeshkumar This class has features needed to compute the wage
 */

class CompanyWage {
	public final String company;
	public final int wagePerHour;
	public final int maxHoursPerMonth;
	public final int maxDaysPerMonth;
	public int dailyWage;
	public int totalWage;

	CompanyWage(String company, int wagePerHour, int maxHoursPerMonth, int maxDaysPerMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.maxDaysPerMonth = maxDaysPerMonth;
	}

	public int getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(int dailyWage) {
		this.dailyWage = dailyWage;
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