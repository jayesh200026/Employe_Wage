public class EmployeWage{
 public static void main(String args[])
	{
	  System.out.println("Welcome to Employe Wage computation");
		double Wage_per_hour=20;
		double Full_Time_hour=8;
		double Part_Time_hour=4;
		double Daily_wage;
		int PartTime=2;
		int FullTime=1;
		double attendance=Math.floor(Math.random()*10)%3;
		if(attendance==FullTime)
		{
			System.out.println("Employee is present and is FullTime");
			Daily_wage=Wage_per_hour*Full_Time_hour;
      System.out.println("Daily wage of a Full Time Employe is: "+String.format("%.4f",Daily_wage));
			
		}
		else if(attendance==PartTime){
			System.out.println("Employee is present and is PartTime");
			Daily_wage=Wage_per_hour*Part_Time_hour;
			System.out.println("Daily wage of a Part Time Employe is: "+String.format("%.4f",Daily_wage));
		}
		else{
		System.out.println("Employe is absent");
		}
	}
}
