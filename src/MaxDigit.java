import java.util.Scanner;
public class MaxDigit{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=0;
		while(n!=0)
		{
			int r=n%10;
			if(r<max)
				max=r;
			n=n/10;
		}
		System.out.println(max);
	}
}