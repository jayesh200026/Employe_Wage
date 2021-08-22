public class EmployeWage{
 public static void main(String args[])
	{
	  System.out.println("Welcome to Employe Wage computation");
		double Wage_per_hour=20;
		double Full_day_hour=8;
		double Daily_wage;
		double attendance=Math.floor(Math.random()*10)%2;
		if(attendance==1)
		{
			System.out.println("Employee is present");
		}
		else{
			System.out.println("Employee is absent");
		}
		Daily_wage=Wage_per_hour*Full_day_hour;
		System.out.println("Daily wage of a Employe is: "+String.format("%.4f",Daily_wage));
	}
}
