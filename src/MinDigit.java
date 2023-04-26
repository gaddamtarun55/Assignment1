import java.util.Scanner;

public class MinDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 9;

        while (n != 0) {
            int digit = n % 10; // extract the last digit
            if (digit < min) { // compare with the current value of min
                min = digit; // update min if necessary
            }
            n /= 10; // remove the last digit from n
        }

        System.out.println("The smallest digit is " + min);
    }
}
