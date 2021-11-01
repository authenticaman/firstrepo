import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Smallest num = new Smallest();
		if(sc.hasNextInt())
		{
			
			 int a = sc.nextInt();
			 int b = sc.nextInt();
			 num.cHk(a, b);
		}
		else
		{
			String a = sc.next();
			String b = sc.next();
			num.cHk(a, b);
		}
		
		sc.close();
	}

}
class Smallest{
	void cHk(int a, int b){
		if(a>b)
		{
			System.out.println(b);
		}
		else if(a<b)
		{
			System.out.println(a);
		}
		else if(a==b)
		{
			System.out.println(a);
		}
	}
	void cHk(String a, String b){
		double sumA=0;
		double sumB=0;
		for(int i=0;i<a.length();i++)
		{
			sumA= sumA + (int)a.charAt(i);
		}
		for(int i=0;i<b.length();i++)
		{
			sumB= sumB + (int)b.charAt(i);
		}
		if(sumA>sumB)
		{
			System.out.println(b);
		}
		else if(sumA<sumB)
		{
			System.out.println(a);
		}
		else if(a==b)
		{
			System.out.println(a);
		}
	}
}
