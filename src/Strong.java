import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int r, sum = 0, fact, i;

        while (n != 0) {
            r = n % 10;
            fact = 1;
            for (i = 1; i <= r; i++) {
                fact *= i; // calculate the factorial of the digit
            }
            sum += fact; // add the factorial to the sum
            n = n / 10; // remove the rightmost digit
        }
        if (sum == num)
            System.out.println("Strong");
        else
            System.out.println("Not Strong");
    }
}
