import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            double term = (double) i / (i + 1); // calculate the current term
            sum += term; // add the term to the sum
        }
        
        System.out.printf("Sum of the series: %.2f", sum); // output the sum with two decimal places
    }
}
