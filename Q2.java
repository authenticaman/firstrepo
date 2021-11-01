import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String arr2 = sc.nextLine();
		String[] arr3=arr2.split(" ");
		if(arr3[0].equalsIgnoreCase("SBI"))
		{
			SBI newSBI = new SBI();
			newSBI.amount=Float.parseFloat(arr3[1]);
			newSBI.years=Integer.parseInt(arr3[2]);
			newSBI.calculateInterest();

		}
		else if(arr3[0].equalsIgnoreCase("HDFC"))
		{
			HDFC newHDFC = new HDFC();
			newHDFC.amount=Float.parseFloat(arr3[1]);
			newHDFC.years=Integer.parseInt(arr3[2]);
			newHDFC.calculateInterest();


		}
		else if(arr3[0].equalsIgnoreCase("ICICI"))
		{
			ICICI newICICI = new ICICI();
			newICICI.amount=Float.parseFloat(arr3[1]);
			newICICI.years=Integer.parseInt(arr3[2]);
			newICICI.calculateInterest();

		}
		else if(arr3[0].equalsIgnoreCase("PNB"))
		{
			PNB newPNB = new PNB();
			newPNB.amount=Float.parseFloat(arr3[1]);
			newPNB.years=Integer.parseInt(arr3[2]);
			newPNB.calculateInterest();

		}
		sc.close();

	}
}

abstract class bank{
	int years;
	float amount;
	abstract void calculateInterest();
}

class SBI extends bank{
	float roi=8f;

	@Override
	void calculateInterest() {

		float total = ((amount*roi*years)/100);
		System.out.printf("%.2f", total);
	}
}

class HDFC extends bank{
	float roi=9f;

	@Override
	void calculateInterest() {
		float total = ((amount*roi*years)/100);
		System.out.printf("%.2f", total);
	}	
}

class ICICI extends bank{
	float roi=7.7f;

	@Override
	void calculateInterest() {
		float total = ((amount*roi*years)/100);
		System.out.printf("%.2f", total);
	}	
}

class PNB extends bank{
	float roi=6.8f;

	@Override
	void calculateInterest() {
		float total = ((amount*roi*years)/100);
		System.out.printf("%.2f", total);
	}
}
