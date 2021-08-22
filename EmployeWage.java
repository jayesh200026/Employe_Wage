public class EmployeWage{
 public static void main(String args[])
	{
	  System.out.println("Welcome to Employe Wage computation");
		double Wage_per_hour=20;
		double Full_Time_hour=8;
		double Part_Time_hour=4;
		int working_days_per_month=20;
		double Monthly_wage;
		double Daily_wage;
		int PartTime=2;
		int FullTime=1;
		double attendance=Math.floor(Math.random()*10)%3;
		switch((int)attendance)
		{
			case 0:System.out.println("Employe is absent");
					break;
			case 1:System.out.println("Employee is present and is FullTime");
        			 Daily_wage=Wage_per_hour*Full_Time_hour;
					 Monthly_wage=Daily_wage*working_days_per_month;
      			 System.out.println("Daily wage of a Full Time Employe is: "+String.format("%.4f",Daily_wage));
					 System.out.println("Monthly wage of a Full Time Employe is: "+String.format("%.4f",Monthly_wage));
					 break;
			case 2:System.out.println("Employee is present and is PartTime");
        			 Daily_wage=Wage_per_hour*Part_Time_hour;
					 Monthly_wage=Daily_wage*working_days_per_month;
        			 System.out.println("Daily wage of a Part Time Employe is: "+String.format("%.4f",Daily_wage));
					 System.out.println("Monthly wage of a part Time Employe is: "+String.format("%.4f",Monthly_wage));
					 break;
			default:System.out.println("Invalid input");
		}
}
}
