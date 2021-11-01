import java.util.*;

public class Q3 {
	public static double proFit;
	public static double sum=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Employee newDev[] = new Employee[n];
		for(int i=0;i<n;i++)
		{
			String arr4 = sc.nextLine();
			String[] arr3=arr4.split(" ");
			newDev[i] = new Employee();
			newDev[i].name = arr3[0];
			newDev[i].profile = arr3[1];
			newDev[i].salary=Float.parseFloat(arr3[2]);
			sum = sum + newDev[i].salary;	
		}
		proFit = sc.nextDouble();
		
		for(int i=0;i<n;i++)
		{
			if((newDev[i].profile).equalsIgnoreCase("Developer"))
			{
				developer newDev2 = new developer();
				newDev2.name = newDev[i].name;
				newDev2.profile = newDev[i].name;
				newDev2.salary = newDev[i].salary;
				newDev2.totalBaseSalary = sum;
				newDev2.profit = proFit;
				newDev2.calculateSalary();
				
				
			}
			else if((newDev[i].profile).equalsIgnoreCase("Manager"))
			{
				manager newMan = new manager();
				newMan.name = newDev[i].name;
				newMan.profile = newDev[i].name;
				newMan.salary = newDev[i].salary;
				newMan.totalBaseSalary = sum;
				newMan.profit = proFit;
				newMan.calculateSalary();
			}
			else if((newDev[i].profile).equalsIgnoreCase("CEO"))
			{
				ceo newCeo = new ceo();
				newCeo.name = newDev[i].name;
				newCeo.profile = newDev[i].name;
				newCeo.salary = newDev[i].salary;
				newCeo.totalBaseSalary = sum;
				newCeo.profit = proFit;
				newCeo.calculateSalary();
			}
		}
		
		
		
		sc.close();

	}

}

class Employee{
	String name;
	double salary;
	float profit_share;
	String profile;
	double profit;
	double totalBaseSalary;
	
}

class developer extends Employee{
	float profit_share = 10;
	
	void calculateSalary() {
		double tSalary = ((profit_share*(profit-totalBaseSalary) ) /100)+salary;
		System.out.printf("%.2f",tSalary);
		System.out.println();
	}
	
}

class manager extends Employee{
	float profit_share = 20;
	
	void calculateSalary() {
		double tSalary = ((profit_share*(profit-totalBaseSalary) ) /100)+salary;
		System.out.printf("%.2f",tSalary);
		System.out.println();
	}
	
	
}

class ceo extends Employee{
	float profit_share = 50;
	
	void calculateSalary() {
		double tSalary = ((profit_share*(profit-totalBaseSalary) ) /100)+salary;
		System.out.printf("%.2f",tSalary);
		System.out.println();
	}
	
}