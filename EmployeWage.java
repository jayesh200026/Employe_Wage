public class EmployeWage{
 public static void main(String args[])
	{
	  System.out.println("Welcome to Employe Wage computation");
		double attendance=Math.floor(Math.random()*10)%2;
		if(attendance==1)
		{
			System.out.println("Employee is present");
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}
