import java.util.Scanner;
public class Fibo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x1=0,x2=1,x,i;
		System.out.print(x1+" "+x2);
		for(i=3;i<=n;i++)
		{
		x=x1+x2;
		System.out.print(" " + x);
		x1 =x2;
		x2 =x;
		}
	}
 
}
