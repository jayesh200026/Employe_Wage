
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
		int Max_total_working_hour=100;
		int Max_total_working_days=20;
		int total_working_hour=0,total_working_days=0;
		double Total_wage=0;
		while(total_working_hour < Max_total_working_hour && total_working_days <Max_total_working_days){
		total_working_days+=1;
		double attendance=Math.floor(Math.random()*10)%3;
		switch((int)attendance)
		{
			
			case 0:System.out.println("Employe is absent");
					break;
			case 1:System.out.println("Employee is present and is FullTime");
        			 Daily_wage=Wage_per_hour*Full_Time_hour;
					 Total_wage+=Daily_wage;
					 Monthly_wage=Daily_wage*working_days_per_month;
      			 System.out.println("Daily wage of a Full Time Employe is: "+String.format("%.4f",Daily_wage));
					 System.out.println("Monthly wage of a Full Time Employe is: "+String.format("%.4f",Monthly_wage));
					 total_working_hour+=Full_Time_hour;
					 break;
			case 2:System.out.println("Employee is present and is PartTime");
        			 Daily_wage=Wage_per_hour*Part_Time_hour;
					 Total_wage+=Daily_wage;
					 Monthly_wage=Daily_wage*working_days_per_month;
        			 System.out.println("Daily wage of a Part Time Employe is: "+String.format("%.4f",Daily_wage));
					 System.out.println("Monthly wage of a part Time Employe is: "+String.format("%.4f",Monthly_wage));
					 total_working_hour+=Part_Time_hour;
					 break;
			default:System.out.println("Invalid input");
		}
}
System.out.println("Total working hour="+total_working_hour);
System.out.println("Total working Days="+total_working_days);
System.out.println("Total Wage="+Total_wage);
}
}
